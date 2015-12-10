package com.example.eoinbrowne.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends Activity {

    public void refreshNoteList()
    {
        FragmentManager mgr = getFragmentManager();
        NoteList notelistRef = (NoteList) mgr.findFragmentById(R.id.list);
        notelistRef.refreshlist();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }








}
