package com.example.search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    private Context context;
    private TextView textView;

    String[] data = {
            "А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К",
            "Л","М","Н","Ң","О","Ө","П","Р","С","Т","У","Ү",
            "Ф","Х","Ц","Ч","Ш","Щ","Ь","Ы","Ъ","Э","Ю","Я",

            "A","B","C","Ç","D","E","F","G","Ğ","H","I","İ",
            "J","K","L","M","N","O","Ö","P","R","S","Ş","T",
            "U","Ü","V","Y","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.idListView);

        searchView = findViewById(R.id.idsearch);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(newText);
        return false;
    }
}