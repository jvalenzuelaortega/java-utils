package org.example;

import org.example.base.Editor;
import org.example.base.EmailNotificationListener;
import org.example.base.LogOpenListener;

public class MainBase {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@email.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
