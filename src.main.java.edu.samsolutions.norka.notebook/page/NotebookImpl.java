package page;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dznor on 15.02.2017.
 */
public class NotebookImpl implements Notebook<Record> {

    List<Record> list = new ArrayList<>();

    @Override
    public boolean createNote(Record note) {
        return list.add(note);
    }

    @Override
    public Record readNote(int index) {
        return list.get(index);
    }

    @Override
    public Record updateNote(int index, Record note) {
        return list.set(index, note);
    }

    public Record deleteNote(int index) {
        return list.remove(index);
    }

    @Override
    public boolean readNoteByName(String name) {
        return false;
    }

    @Override
    public boolean readNoteByNumber(String name) {
        return false;
    }

    @Override
    public Collection<Record> readAll() {
        return list;
    }

    @Override
    public void save(String path, String fileName) {
        String file = "C:\\Users\\dznor\\1.txt";
        try {
            FileOutputStream fos = new FileOutputStream(new File(file));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            list.forEach(item -> {
                try {
                    oos.writeObject(item);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(String path, String fileName) {
        String file = "C:\\Users\\dznor\\1.txt";
        FileInputStream fis;
        ObjectInputStream ois;
        List<Record> newList = new ArrayList<>();

        try {
            fis = new FileInputStream(new File(file));
            ois = new ObjectInputStream(fis);

            Record tempRepord;
            while (true) {
                newList.add((Record) ois.readObject());
            }
        } catch (EOFException e) {
            list = newList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
//            ois.close;
//            fis.close;
        }
    }
}
