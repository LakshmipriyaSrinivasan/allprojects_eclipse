package Pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService service = (EmployeeService)context.getBean("service");
	Employee employee = (Employee) context.getBean("employeeObject");
	int id;
	String name;
	double salary;
	String designation;
	int a;
	do{
	System.out.println("******** Employee Management System ********");
	System.out.println("1)Add  2)Delete by Id  3)Display All  4)Update by id  5)Exit");
	System.out.println("Input: ");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	switch(a){
	case 1:
		System.out.println("**** Performing Insert ****");
		System.out.println("Enter Id");
		employee.setId(sc.nextInt());
		System.out.println("Enter Name");
		employee.setName(sc.next());
		System.out.println("Enter Salary");
		employee.setSalary(sc.nextDouble());
		System.out.println("Enter Designation");
		employee.setDesignation(sc.next());
		service.insert(employee);
		System.out.println("**** Employee information stored successfully ****");
		break;
	case 2:
		System.out.println("*** Performing Delete ***");
		System.out.println("Enter Id");
		employee.setId(sc.nextInt());
		service.delete(employee);
		System.out.println("*** Employee deleted successfully ***");
		break;
	case 3:
		System.out.println("**** Displaying All Employees ****** ");
		List<Employee> customerList = service.display();
		for(Employee e : customerList) {
			System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
		}
		break;
	case 4:
		
		String choice;
		do{
		System.out.println("***** A sub menu to update the following ****");
		System.out.println("(a)Name (b)Salary (c)Designation (d) Exit");
		choice=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		switch(choice)
		{
			case "a":				
			{				
				System.out.println("Enter new name");
				name=sc.next();			
				service.updateName(name,id);
				break;
			}
			case "b":
			{				
				System.out.println("Enter new salary");
				salary=sc.nextDouble();
				service.updateSalary(salary,id);
				break;
			}
			case "c":
			{
				System.out.println("Enter new designation");
				designation=sc.next();			
				service.updateDesignation(designation,id);
				break;
			}
			case "d":
			{
				System.out.println("*** Sub menu exit ***");
				break;
			}	
		}	
		}
		while(choice!="d");
		break;
		
	case 5:
		System.out.println("***Main menu exits***");
		System.out.println("****Thank you for visiting*****");
		break;	
	}
}
	while(a!=5);
}
}
