package com.example.eoinbrowne.myapplication;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.eoinbrowne.myapplication.controller.MainController;
import com.example.eoinbrowne.myapplication.model.Note;

import java.util.ArrayList;

/**
 * Created by EoinBrowne on 09/12/15.
 */
public class NoteList extends ListFragment {


    private ArrayAdapter<Note> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_notelist, container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        ArrayList<Note> notes = MainController.getInstance().getNotes();
        this.adapter = new ArrayAdapter<Note>(getActivity(),android.R.layout.simple_list_item_1, notes);
        setListAdapter(this.adapter);

        super.onActivityCreated(savedInstanceState);
    }

    public void refreshlist()
    {
        this.adapter.notifyDataSetChanged();
    }
}
