
package com.example.database;

import com.example.entity.DeviceSpecs;
import com.example.interfaces.CRUD;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpecsDAO implements CRUD<DeviceSpecs>{
    
    private final DBConnection dbConnection = new DBConnection();
    private final JdbcTemplate jdbcTemplate = new JdbcTemplate(dbConnection.Conectar());

    @Override
    public void create(DeviceSpecs deviceSpecs) {
        String sql="INSERT INTO device_specs (brand, model, wifi_built_in, bluetooth_built_in) values (?, ?, ?, ?)";
        this.jdbcTemplate.update(sql, deviceSpecs.getBrand(), deviceSpecs.getModel(), deviceSpecs.isWifiBuiltIn(), deviceSpecs.isBluetoothWifiBuiltIn()); 
    }

    @Override
    public void update(DeviceSpecs deviceSpecs) {
        String sql = "UPDATE device_specs SET brand=?, model=?, wifi_built_in=?, bluetooth_built_in=? WHERE id=?";
        this.jdbcTemplate.update(sql, deviceSpecs.getBrand(), deviceSpecs.getModel(), deviceSpecs.isWifiBuiltIn(), deviceSpecs.isBluetoothWifiBuiltIn(), deviceSpecs.getId());
    }

    @Override
    public List read() {
        String sql = "SELECT * FROM device_specs";
        List list = this.jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List getElement(int id) {
        String sql = "SELECT * FROM device_specs WHERE id=?";
        List datosSpecs=this.jdbcTemplate.queryForList(sql, id);
        return datosSpecs;
    }
    
    @Override
    public void delete(int id){
        String sql="DELETE FROM device_specs WHERE id=?";
        this.jdbcTemplate.update(sql, id);  
    }
    
    public int getLastElementId(){
        String sql="SELECT MAX(id) FROM device_specs";
        int id=this.jdbcTemplate.queryForObject(sql, Integer.class);
        return id;
    }
    
    
}
