package com.example.interfaces;

import java.util.List;
import java.util.Map;

public interface CRUD<T> {

	public void register(T device);
	public void update(T device, int id);
	//public void delete(int id);
	public List<Map<String, Object>> read();
}
