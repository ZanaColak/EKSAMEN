package Hospital;

import java.util.ArrayList;

public class Hospital {
    ArrayList<String> departmentArrayList = new ArrayList<>();


    Department department = new Department("Akut modtagelsen");
    Department department1 = new Department("Akut modtagelsen");
    Department department2 = new Department("Akut modtagelsen");

    public void tilføjDepartment(Department department){
        departmentArrayList.add("h");
        departmentArrayList.add("h");
        System.out.println(departmentArrayList.size());
        System.out.println(departmentArrayList);

    }

    @Override
    public String toString() {
        return departmentArrayList.size() + "Hospital{" +
                "departmentArrayList=" + departmentArrayList +
                ", department="  +
                '}';
    }
}
