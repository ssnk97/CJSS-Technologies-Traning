package EmployeeTEst;

import EmployeeModel.Benefits;
import EmployeeModel.Department;
import EmployeeModel.Employee;
import EmployeeModel.Location;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String [] args)
    {
        Department dept1 = new Department("d101", "healthcare");
        Department dept2 = new Department("d201", "finance");
        Department dept3 = new Department("d301", "admin");
        Department dept4 = new Department("d401", "fraud");
        List<Department> departmentsTable = Arrays.asList(dept1, dept2, dept3, dept4);

        Location loc1 = new Location("hyd", "Hyderabad", "India");
        Location loc2 = new Location("chn", "Chennai", "India");
        Location loc3 = new Location("Lon", "London", "United Kingdom");
        List<Location> locationsTable = Arrays.asList(loc1, loc2,loc3);
       // locationsTable.forEach(value -> System.out.println(value.getLocationCountry()));

        Benefits ben1 = new Benefits("ben1", "Health Insurance", "Health Insurance is provided for you and your family");
        Benefits ben2 = new Benefits("ben2", "Stakes", "Stack is provided provided of your salary");
        Benefits ben3 = new Benefits("ben3", "Provident Fund", "Useful after retierment");
        Benefits ben4 = new Benefits(null, "No Benefits", "No Benefits");
        List<Benefits> benefitsTable = Arrays.asList(ben1, ben2, ben3, ben4);

        Employee emp1 = new Employee("Emp1", "Apple", "500000",loc1,dept1);
        List<Benefits> emp1benefities = Arrays.asList(ben1, ben2);
        emp1.setBenefitsList(emp1benefities);

        Employee emp2 = new Employee("Emp2", "Mango", "800000",loc2,dept4);
        List<Benefits> emp2benefities = Arrays.asList(ben2, ben3);
        emp2.setBenefitsList(emp2benefities);

        Employee emp3 = new Employee("Emp2", "Grape", "800000",loc3,dept3);
        List<Benefits> emp3benefities = Arrays.asList(ben4);
        emp3.setBenefitsList(emp3benefities);

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3);

        // 2.a) Retrieve all employees in India

        /*employees.stream().
                forEach(emp -> {
                    List<Location> locations = locationsTable.stream().
                    filter(location -> location.getLocationId().equalsIgnoreCase(emp.getLocationId().getLocationId())).collect(Collectors.toList());
                    if (locations!= null) {
                        System.out.println("EmpName: "+ emp.getEmployeeName());
                    }
                    }
                );*/
      System.out.println("\n=====Retrieve all employees in India=====");
      locationsTable.stream().
                filter(s->s.getLocationCountry().equals("India")).
                forEach(list -> {
                    employees.stream().
                            filter(e-> e.getLocation().getLocationId().equals(list.getLocationId())).
                            forEach(emp ->
                                System.out.println("EmpName: "+ emp.getEmployeeName())
                           );
                });


                //2.b) Retrieve employees who are in Chennai or Hyderabad
        System.out.println("\n=====Retrieve employees who are in Chennai or Hyderabad=====");
       employees.stream().
                filter(e-> e.getLocation().getLocationName().equals("Hyderabad") || e.getLocation().getLocationName().equals("Chennai")).
                forEach(emp ->
                        System.out.println("EmpName: "+ emp.getEmployeeName())
                );

       //2.c) Retrieve employees who have Benefits and display benefits details
       System.out.println("\n======sRetrieve employees who have Benefits and display benefits details======");
        employees.forEach(x->
       x.getBenefitsList().forEach(y-> {
           //System.out.println(y.getBenefitId());
           if(y.getBenefitId()!=null)
           {
               System.out.println(" EmployeeName: "+x.getEmployeeName() +
                       " BenefitId: "+ y.getBenefitId()+
                       " BenefitName: "+ y.getBenefitName()+
                       " BenefitDescription: "+ y.getDescription());
           }
       }
       ));


        //2.d) Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
        System.out.println("\n======Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry======");
        employees.forEach(x-> {
            System.out.println("Emp ID: "+ x.getEmployeeId()+
                    "  EmpName: "+x.getEmployeeName() +
                    "  EmpSalary: "+x.getSalary()+
                    "  LocationId: " + x.getLocation().getLocationId() +
                    "  LocationName: "+ x.getLocation().getLocationName()+
                    "  LocationCountry: "+ x.getLocation().getLocationCountry()+
                    "  DepartmentId: "+ x.getDepartment().getDeptId()+
                    "  DepartmentName: "+x.getDepartment().getDeptName()
            );

                }
                );
        //2.e) Retrieve employees who are in Chennai and India
        System.out.println("\n=====Retrieve employees who are in Chennai and India====");
        employees.stream().
                filter(e-> e.getLocation().getLocationName().equals("Chennai") && e.getLocation().getLocationCountry().equals("India")).
                forEach(emp ->
                        System.out.println("EmpName: "+ emp.getEmployeeName() +"  EmpCountry: "+emp.getLocation().getLocationCountry()+"  EmpLocation:"+ emp.getLocation().getLocationName())
                );
    }
}
