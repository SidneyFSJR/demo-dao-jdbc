package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(DepartmentDao obj);
    void update(DepartmentDao obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
