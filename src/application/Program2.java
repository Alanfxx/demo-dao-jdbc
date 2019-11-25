package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("====== TEST 1 - findById ======");
//		Department depart = departmentDao.findById(1);
//		System.out.println(depart);		
		
//		System.out.println("\n====== TEST 2 - insert ======");
//		Department dep1 = new Department(null, "Programação");
//		departmentDao.insert(dep1);
//		System.out.println(dep1);		
		
//		System.out.println("\n====== TEST 3 - update ======");
//		dep1.setName("Programação modificado");
//		departmentDao.update(dep1);
		
		System.out.println("====== TEST 4 - deleteById ======");
		departmentDao.deleteById(8);
		System.out.println("Feito");
		
		System.out.println("\n====== TEST 5 - findAll ======");
		List<Department> list = departmentDao.findAll();
		for(Department dep:list) {
			System.out.println(dep);
		}
	}
}
