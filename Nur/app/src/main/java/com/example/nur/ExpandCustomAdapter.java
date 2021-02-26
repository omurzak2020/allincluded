package com.example.nur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class ExpandCustomAdapter extends BaseExpandableListAdapter {

    private final Context context;
    private final ArrayList<GroupInfo> deptList;
	private final ViewPager2 viewPager2;


	public ExpandCustomAdapter(Context context, ArrayList<GroupInfo> deptList, ViewPager2 viewPager2) {
					this.context = context;
					this.deptList = deptList;
		this.viewPager2 = viewPager2;
	}

				@Override
				public Object getChild(int groupPosition, int childPosition) {
			//		ArrayList<ChildInfo> productList = deptList.get(groupPosition).getProductList();
			//		return productList.get(childPosition);
					return groupPosition;
	}

				@Override
				public long getChildId(int groupPosition, int childPosition) {
					return childPosition;
				}

				@Override
				public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
										 View view, ViewGroup parent) {

					ChildInfo detailInfo = (ChildInfo) getChild(groupPosition, childPosition);
					if (view == null) {
						LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
						view = infalInflater.inflate(R.layout.expandable_child_item, null);
					}

					TextView sequence = (TextView) view.findViewById(R.id.sequence);
					sequence.setText(detailInfo.getSequence().trim() + ". ");
					TextView childItem = (TextView) view.findViewById(R.id.childItem);
					childItem.setText(detailInfo.getName().trim());

					return view;
				}

				@Override
				public int getChildrenCount(int groupPosition) {

				//	ArrayList<ChildInfo> productList = deptList.get(groupPosition).getProductList();
				//	return productList.size();
					return groupPosition;
				}

				@Override
				public Object getGroup(int groupPosition) {
					return deptList.get(groupPosition);
				}

				@Override
				public int getGroupCount() {
					return deptList.size();
				}

				@Override
				public long getGroupId(int groupPosition) {
					return groupPosition;
				}

				@Override
				public View getGroupView(int groupPosition, boolean isLastChild, View view,
										 ViewGroup parent) {

					GroupInfo headerInfo = (GroupInfo) getGroup(groupPosition);
					if (view == null) {
						LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
						view = inf.inflate(R.layout.expandable_group_item, null);
					}

					TextView heading = (TextView) view.findViewById(R.id.heading);
					heading.setText(headerInfo.getName().trim());

					return view;
				}

				@Override
				public boolean hasStableIds() {
					return true;
				}

				@Override
				public boolean isChildSelectable(int groupPosition, int childPosition) {
					return true;
				}


}
