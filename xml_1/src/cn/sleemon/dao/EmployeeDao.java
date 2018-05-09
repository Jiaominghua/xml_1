package cn.sleemon.dao;

import cn.sleemon.pojo.Employee;

public interface EmployeeDao {
	public abstract Employee  getEmployeeById(Integer id);
	
}
