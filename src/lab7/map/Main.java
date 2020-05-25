package lab7.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Employee> employees = new HashMap();
        Employee e1,e2,e3;

        e1 = new Employee(1,"Andrei", "pos1");
        e2 = new Employee(2,"Diana","pos5");
        e3 = new Employee(3,"Darius","pos2");


        employees.put("p1",e1);
        employees.put("p3",e3);
        employees.put("p9",e3);

        for (Map.Entry current : employees.entrySet()){
            System.out.println(current);
        }

    }
}
