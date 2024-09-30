package org.example;

public class EmployeeFactory {

    public static Employee getEmp(String emptype){
        if(emptype.trim().equalsIgnoreCase("JAVA DEVELOPER")){
            return  new JavaDev();
        }else if(emptype.trim().equalsIgnoreCase("PY DEVELOPER")){
            return new PyDev();
        }else {
            return null;
        }
    }
}
