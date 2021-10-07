package com.jimmy.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Mycellection {

	//数组
	private Object[] array;
	
	//List
	private List list;
	
	//Set
	private Set set;
	
	//Map
	private Map map;
	
	//properties
	private Properties properties;


	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "List:"+this.list+",Set:"+this.set;
		return "map:"+map+",properties:"+properties+";array:"+Arrays.toString(array)+"list:"+list+"set:"+set;
		
	}			
}
