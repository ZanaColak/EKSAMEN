package HospitalEksamen;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Department> departmentArrayList = new ArrayList<>();

    Department department = new Department("Akut");
    Department department2 = new Department("Fødsel");

    public void addToArray(){
        departmentArrayList.add(department);
        departmentArrayList.add(department2);
    }
}
