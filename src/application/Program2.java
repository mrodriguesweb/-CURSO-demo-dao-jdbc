package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById =====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("\n=== TEST 3: department update =====");
		dep = departmentDao.findById(6);
		dep.setName("Iphones");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 4: department insert =====");
		Department newDep = new Department(null, "Foods");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
		
		System.out.println("\n=== TEST 5: department delete =====");
		departmentDao.deleteById(7);
		System.out.println("Delete completed!");
	}

}
