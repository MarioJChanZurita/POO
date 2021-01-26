package com.example.repository;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.interfaces.CRUD;
import com.example.model.DeviceSpecs;

public class DataBaseSpecsDAO implements CRUD<DeviceSpecs>{

	private ConnectionDB connectionDB = new ConnectionDB();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(connectionDB.connect());
	
	@Override
	public void register(DeviceSpecs deviceSpecs){
		String sql = "INSERT INTO device_specs(brand, model, wifi_built_in, bluetooth_built_in) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, deviceSpecs.getBrand(), deviceSpecs.getModel(), deviceSpecs.getWifi(), deviceSpecs.getBluetooth());
	}

	@Override
	public void update(DeviceSpecs deviceSpecs, int id){
		String sql = "UPDATE device_specs set brand = ?, model = ?, wifi_built_in = ?, bluetooth_built_in = ? where id = ?";
		jdbcTemplate.update(sql, deviceSpecs.getBrand(), deviceSpecs.getModel(), deviceSpecs.getWifi(), deviceSpecs.getBluetooth(), id);
	}

	public void delete(int id){
		String sql = "DELETE from device_specs where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public List<Map<String, Object>> read(){
		String sql = "SELECT * from device_specs";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}

	public List<Map<String, Object>> getSpecificDeviceSpecs(int idDeviceSpecs){
		String sql = "SELECT * from device_specs WHERE id = ?";
		List<Map<String, Object>> deviceSpecs = jdbcTemplate.queryForList(sql, idDeviceSpecs);
		return deviceSpecs;
	}
	
}
