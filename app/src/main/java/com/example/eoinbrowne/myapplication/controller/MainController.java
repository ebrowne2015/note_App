package com.example.eoinbrowne.myapplication.controller;

import com.example.eoinbrowne.myapplication.model.Note;

import java.util.ArrayList;

/**
 * Created by EoinBrowne on 09/12/15.
 */
public class MainController {

    private static MainController instance;
    private ArrayList<Note> notesList;


    private MainController()
    {

        this.notesList = new ArrayList<Note>();
    }

    public static MainController getInstance()
    {
        if(instance ==  null)
        {
            instance = new MainController();
        }
        return instance;
    }

    public void addNote(String title, String note)
    {
        Note n = new Note(title, note);
        this.notesList.add(n);
    }
    public ArrayList<Note> getNotes()

    {
        return this.notesList;
    }


}
