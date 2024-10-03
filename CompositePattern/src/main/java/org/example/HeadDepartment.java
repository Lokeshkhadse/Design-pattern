package org.example;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment  implements  Department{
    private  int  id;
    private String name;
     private List<Department> childDept;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDept = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        childDept.add(department);
    }

    public void removeDepartment(Department department) {
        childDept.remove(department);
    }

    @Override
    public void printDeptName() {
        childDept.forEach(Department::printDeptName);
    }


}
