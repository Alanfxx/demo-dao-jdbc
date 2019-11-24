package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findbyId ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller.getEmail());
		
		System.out.println("\n=== TEST 2: seller findbyDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller seller2: list){
			System.out.println(seller2);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller seller2: list2){
			System.out.println(seller2);
		}
		
//		System.out.println("\n=== TEST 4: seller insert ===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Insert! New id = " + newSeller.getId());
		
//		System.out.println("\n=== TEST 5: seller update ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Waine");
//		sellerDao.update(seller);
//		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller deleteById ===");
		sellerDao.deleteById(8);
		System.out.println("Feito!");
		sellerDao.deleteById(10);
		System.out.println("Feito!");
		
		
	}
}
