package page;

import java.util.Collection;

/**
 * Created by dznor on 15.02.2017.
 */
public interface Notebook<T> {

    boolean createNote(T note);

    Record readNote(int index);

    Record updateNote(int index, T note);

    Record deleteNote(int index);

    boolean readNoteByName(String name);

    boolean readNoteByNumber(String name);

    Collection<T> readAll();

    void save(String path, String fileName);

    void load(String path, String fileName);

}
