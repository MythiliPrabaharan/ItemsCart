package com.test.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ItemsDAO
{
	List<Items> item = new ArrayList<>();
	Map<String, Items> map = new HashMap<>();
	public ItemsDAO()
	{
		Items i1 = new Items(001, "Shampoo", "Out-Of-Stock", 0);
		Items i2 = new Items(002, "Face Wash", "Available", 10);
		Items i3 = new Items(003, "Lip Balm", "Available", 20);
		Items i4 = new Items(004, "Light Routine", "Out-Of-Stock", 30);
		Items i5 = new Items(005, "White Pine", "Available", 5);
		Items i6 = new Items(006, "TOR Bright", "Available", 10);
		Items i7 = new Items(007, "Body Wash", "Available", 30);

		item.add(i1);item.add(i2);item.add(i3);item.add(i4);item.add(i6);item.add(i7);

		map.put("Shampoo", i1);
		map.put("Face Wash", i2);
		map.put("Lip Balm", i3);
		map.put("Light Routine", i4);
		map.put("White Pine", i5);
		map.put("TOR Bright", i6);
		map.put("Body Wash", i7);

	}

	public Map<String,Items> getItems()
	{
		return map;
	}
	public Items getItems(int id)
	{
		for(Items i : item)
		{
			if(i.getItemId() == id)
				return i;
		}
		return null;
	}
}
