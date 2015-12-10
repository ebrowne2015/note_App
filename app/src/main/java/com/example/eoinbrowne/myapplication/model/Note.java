package com.example.eoinbrowne.myapplication.model;

/**
 * Created by EoinBrowne on 09/12/15.
 */
public class Note {

    private String title;
    private String note;

    public Note(String title, String note) {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + this.note;
    }
}
