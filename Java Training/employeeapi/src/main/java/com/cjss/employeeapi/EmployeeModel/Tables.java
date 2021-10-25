package com.cjss.employeeapi.EmployeeModel;

import java.util.List;

public class Tables {
   private static List<Department> departmentsTable;
   private static List<Location> locationsTable;
   private static List<Benefits> benefitsTable;
   private static List<Employee> employees;

    public static List<Department> getDepartmentsTable() {
        return departmentsTable;
    }

    public static void setDepartmentsTable(List<Department> departmentsTable) {
        Tables.departmentsTable = departmentsTable;
    }

    public static List<Location> getLocationsTable() {
        return locationsTable;
    }

    public static void setLocationsTable(List<Location> locationsTable) {
        Tables.locationsTable = locationsTable;
    }

    public static List<Benefits> getBenefitsTable() {
        return benefitsTable;
    }

    public static void setBenefitsTable(List<Benefits> benefitsTable) {
        Tables.benefitsTable = benefitsTable;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        Tables.employees = employees;
    }
}
