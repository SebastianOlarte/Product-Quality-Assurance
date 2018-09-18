/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import main.*;

import org.junit.*;



import static org.junit.Assert.*;

/**
 *
 * @author Sebastian
 */
public class test {
    
    @Test
    public static void testOrdenAscenByCgpa(){
        //Vamos a verificar si la funcion ordenar ascendente si los ordena correctamente
        List<Student> list = new ArrayList<Student>();
        List<Student> listideal = new ArrayList<Student>();
        Student stud1  = new Student(1, "Bryan", 3.2);
        Student stud2  = new Student(2, "Carlos", 3.2);
        Student stud3  = new Student(3, "Richard", 5.1);
        Student stud4  = new Student(4, "Estefa", 5);
        Student stud5  = new Student(5, "Julia", 4.3);
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);
        list = main.Main.ordenAscen(list);
        
        listideal.add(stud1);
        listideal.add(stud2);
        listideal.add(stud5);
        listideal.add(stud4);        
        listideal.add(stud3);
        Assert.assertEquals("LOS ESTUDIANTES NO ESTÁN ORDENADOS DE FORMA ASCENDENTE POR SU CGPA", listideal, list);        
    }
    
    @Test
    public static void testOrdenDescenByCgpa(){
        //Vamos a verificar si la funcion ordenar descendente si los ordena correctamente, la cual será su presentacion final
        List<Student> list = new ArrayList<Student>();
        List<Student> listideal = new ArrayList<Student>();
        Student stud1  = new Student(1, "Bryan", 3.2);
        Student stud2  = new Student(2, "Carlos", 3.2);
        Student stud3  = new Student(3, "Richard", 5.1);
        Student stud4  = new Student(4, "Estefa", 5);
        Student stud5  = new Student(5, "Julia", 4.3);
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);
        list = main.Main.ordenDescen(list);
        
        listideal.add(stud3);
        listideal.add(stud4);
        listideal.add(stud5);
        listideal.add(stud1);        
        listideal.add(stud2);
        Assert.assertEquals("LOS ESTUDIANTES NO ESTÁN ORDENADOS DE FORMA DESCENDENTE POR SU CGPA", listideal, list);        
    }
    
    @Test
    public static void testValidData(){
        List<Student> list = new ArrayList<Student>();
        Student stud1  = new Student(1, "bryan", 3.2);
        Student stud2  = new Student(2, "carlos hernandez", 3.2);
        Student stud3  = new Student(-1, "Richard", 5.1);
        Student stud4  = new Student(4, "Estefa", 5);
        Student stud5  = new Student(-3, "Julia", 4.3);
        Student stud6  = new Student(6, "RICHARD", 5.1);
        Student stud7  = new Student(7, "Estefaniaaaaaaaaaaaaaaaaaaa Gonzalesssssssssssssssssss Giraldoooooooooooooooooooooooo", 5);
        Student stud8  = new Student(8, "Julia X", 2.3);
        
        for(Student st: list){
            Assert.assertTrue("EL VALOR DEL ID INGRESADO NO ES VALIDO", (st.getId() >= 0 && st.getId() <= 10000));
            Assert.assertTrue("EL NOMBRE INGRESADO NO ES VALIDO", (st.getFname().length() >= 5 && st.getFname().length() <= 30) || (st.getFname() == st.getFname().toLowerCase()));
            Assert.assertTrue("EL CGPA INGRESADO NO ES VALIDO", (st.getCgpa() >= 0.00 && st.getCgpa() <= 4.00));
        }   
    }
    
    
    
}
