package main;

import page.Notebook;
import page.NotebookImpl;
import page.Record;

import java.time.LocalDate;

/**
 * Created by dznor on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, kitty!");
        Notebook notebook = new NotebookImpl();
        notebook.createNote(new Record(1, "dima", "666", LocalDate.now()));
        notebook.createNote(new Record(2, "lesha", "333", LocalDate.now()));

        System.out.println("do");
        notebook.readAll().forEach(item -> System.out.println(item));

        notebook.deleteNote(1);

        System.out.println("posle");
        notebook.readAll().forEach(item -> System.out.println(item));

        notebook.save("", "");
        System.out.println("save");

        notebook.load("","");
        System.out.println("load");
        notebook.readAll().forEach(item -> System.out.println(item));
    }
}
