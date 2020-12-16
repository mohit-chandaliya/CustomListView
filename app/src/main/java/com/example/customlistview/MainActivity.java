package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listView);

        ArrayList<Person> arrayList= new ArrayList<>();

        arrayList.add(new Person(R.drawable.harvard, "Harvard University","Cambridge, Massachusetts, USA|Private University| Established 1636"));
        arrayList.add(new Person(R.drawable.mit, "Massachusetts Institute of Technology (MIT)","Cambridge, Massachusetts, USA|Private University| Established 1861"));
        arrayList.add(new Person(R.drawable.stanford, "Stanford University","Stanford, California, USA|Private University| Established 1885"));
        arrayList.add(new Person(R.drawable.caltech, "California Institute of Technology (Caltech)","Pasadena, California, USA|Private University| Established 1891"));
        arrayList.add(new Person(R.drawable.cambridge, "University of Cambridge","Cambridge, Cambridgeshire, UK|Public University| Established 1209"));
        arrayList.add(new Person(R.drawable.princeton, "Princeton University","Princeton, New Jersey, USA|Private University| Established 1746"));
        arrayList.add(new Person(R.drawable.oxford, "University of Oxford (OU)","Oxford, Oxfordshire, UK|Public University| Established 1096"));
        arrayList.add(new Person(R.drawable.yale, "Yale University","New Haven, Connecticut, USA|Private University| Established 1701"));
        arrayList.add(new Person(R.drawable.chicago, "The University of Chicago (UChicago)","Chicago, Illinois, USA|Private University| Established 1890"));
        arrayList.add(new Person(R.drawable.berkeley, "University of California - Berkeley Campus (UC Berkeley)","Berkeley, California, USA|Public University| Established 1868"));

        personAdapter personAdapter= new personAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);


    }
}