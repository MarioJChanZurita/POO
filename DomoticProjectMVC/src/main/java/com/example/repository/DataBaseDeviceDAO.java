package com.example.repository;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.interfaces.CRUD;
import com.example.model.Device;

public class DataBaseDeviceDAO implements CRUD<Device>{

	private ConnectionDB connectionDB = new ConnectionDB();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(connectionDB.connect());
	private DataBaseSpecsDAO dataBaseSpecs = new DataBaseSpecsDAO();
	
	@Override
	public void register(Device device){
		dataBaseSpecs.register(device.getDeviceSpecs());
		String sql = "INSERT INTO devices(name, id_room, is_indispensable, id_specs) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, device.getName(), device.getIdRoom(), device.getIsIndispensable(), device.getDeviceSpecs().getId());
	}

	@Override
	public void update(Device device, int id) {
		dataBaseSpecs.update(device.getDeviceSpecs(), device.getDeviceSpecs().getId());
		String sql = "UPDATE devices set name = ?, id_room = ?, is_indispensable = ?, id_specs = ? where id = ?";
		jdbcTemplate.update(sql, device.getName(), device.getIdRoom(), device.getIsIndispensable(), device.getDeviceSpecs().getId(), id);
	}
	
	
	public void delete(Device device, int id){
		dataBaseSpecs.delete(device.getDeviceSpecs().getId());
		String sql = "DELETE from devices where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public List<Map<String, Object>> read(){
		String sql = "SELECT * from devices";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
	public List<Map<String, Object>> getSpecificDevice(int id) {
		String sql = "SELECT * from devices WHERE id = ?";
		List<Map<String, Object>> device = jdbcTemplate.queryForList(sql, id);
		return device;
	}

}
