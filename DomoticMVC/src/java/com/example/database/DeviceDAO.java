
package com.example.database;

import com.example.entity.Device;
import com.example.interfaces.CRUD;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeviceDAO implements CRUD<Device> {
    
    private final DBConnection dbConnection = new DBConnection();
    private final JdbcTemplate jdbcTemplate = new JdbcTemplate(dbConnection.Conectar());

    @Override
    public void create(Device device) {
        String sql="INSERT INTO devices (name, id_room, is_indispensable, id_specs) values (?, ?, ?, ?)";
        this.jdbcTemplate.update(sql, device.getName(), device.getIdRoom(), device.getIsIndispensable(), device.getDeviceSpecs().getId()); 
    }

    @Override
    public void update(Device device) {
        String sql = "UPDATE devices SET name=?, id_room=?, is_indispensable=? WHERE id=?";
        this.jdbcTemplate.update(sql, device.getName(), device.getIdRoom(), device.getIsIndispensable(), device.getId());
    }

    @Override
    public List read() {
        String sql = "SELECT * FROM devices";
        List list = this.jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List getElement(int id) {
        String sql = "SELECT * FROM devices WHERE id=?";
        List datosDevice=this.jdbcTemplate.queryForList(sql, id);
        return datosDevice;
    }
    
    @Override
    public void delete(int id){
        String sql="DELETE FROM devices WHERE id=?";
        this.jdbcTemplate.update(sql, id);
    }

    public int getIdSpecsFromDevice(int id){
        String sql="SELECT id_specs FROM devices WHERE id=?";
        int idSpecs=this.jdbcTemplate.queryForObject(sql, Integer.class, id);
        return idSpecs;
    }
    
}
