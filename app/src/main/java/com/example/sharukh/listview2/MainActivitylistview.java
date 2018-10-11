package com.example.sharukh.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitylistview extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList;
    String programminglanguageslist[] = {"C", "C++", "C#", "Python", "ASP.NET","HTML","CSS","Java script","PHP","Android apps","IOS Apps"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylistview);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, programminglanguageslist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView tv=(TextView)view;
        Toast.makeText(this,"YOU CLICKED ON"+tv.getText()+i,Toast.LENGTH_SHORT ).show();
    }
}
