package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerview);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla","9845765842",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","9845765843",R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai","9845765844",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC","9845765845",R.drawable.bhuwan));

        ContactAdapter contactsAdapter = new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
