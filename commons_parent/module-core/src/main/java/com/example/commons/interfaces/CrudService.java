package com.example.commons.interfaces;
import java.util.List;

public interface CrudService<T, ID> {
    T findById(ID id);
    List<T> findAll();
    T save(T entity);
    void delete(ID id);
}
