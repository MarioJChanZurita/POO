
package com.example.interfaces;

import java.util.List;

public interface CRUD<T> {
    
    public void create(T device);
    public void update(T device);
    public List read();
    public void delete(int id);
    public List getElement(int id);
    
}
