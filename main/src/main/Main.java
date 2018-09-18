/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sebastian
 */
package main;
import java.util.*;

public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static List<Student> ordenAscen(List<Student> students){
        Collections.sort(students);
        return students;
    }
    
    public static List<Student> ordenDescen(List<Student> students){
        Student aux ;
        List<Student> listdescen = new ArrayList<Student>(students.size());
        for( int i = students.size()-1; i>=0; i--){            
            if(i>0){
                if (students.get(i).getCgpa() == students.get(i-1).getCgpa()){
                    aux = students.get(i);
                    students.add(i, students.get(i-1));
                    students.add(i-1, aux);
                }            
            }            
            listdescen.add(students.get(i));
        }
        return listdescen;
    }
       
    public static void main(String[] args){        
        System.out.println("Ingrese # de estudiantes\n");
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();
       
        while(testCases>0){
                System.out.println("Ingrese id: ");
                int id = in.nextInt();
                System.out.println("Ingrese nombre: ");
                String fname = in.next();
                System.out.println("Ingrese cgpa: ");
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
        }
        
        studentList = ordenAscen(studentList);
        /*for(Student st: studentList){
			System.out.println(st.getFname() + " : " + st.getCgpa() + " : " + st.getId());
        }*/        
        studentList = ordenDescen(studentList);        
        for(Student st: studentList){
			System.out.println(st.getFname() + " : " + st.getCgpa() + " : " + st.getId());
        }        
    }
}
