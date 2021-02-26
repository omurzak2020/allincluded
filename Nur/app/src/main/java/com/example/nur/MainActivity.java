package com.example.nur;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MainActivity extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();
    private ExpandCustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListViewDemo);
        listAdapter = new ExpandCustomAdapter(MainActivity.this, deptList, viewPager2);
        simpleExpandableListView.setAdapter(listAdapter);
        expandAll();

        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);

                //get the child info
                ChildInfo detailInfo =  headerInfo.getProductList().get(childPosition);

                Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName()
                        + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();
                return false;
            }
        });

        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);

                Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(),
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });
    }

    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.collapseGroup(i);
        }
    }

    private void loadData() {
        addItem("Types of Layout","Linear Layout");
        addItem("Types of Layout","Relative Layout");
        addItem("Types of Layout","Frame Layout");
        addItem("Types of Layout","Tab Layout");
        addItem("Types of Layout","Table Layout");
        addItem("Types of Layout","Grid Layout");

        addItem("Types of Intent","Explicit Intent");
        addItem("Types of Intent","Implicit Intent");

    }

    private int addItem(String department, String product) {

        int groupPosition = 0;

        //check the hash map if the group already exists
        GroupInfo headerInfo = subjects.get(department);

        //add the group if doesn't exists
        if (headerInfo == null) {
            headerInfo = new GroupInfo(image);
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        //size of the children list
        int listSize = productList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }
}


