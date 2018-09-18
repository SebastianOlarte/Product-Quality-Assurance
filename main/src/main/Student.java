/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author Sebastian
 */
public class Student implements Comparable <Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
        
        @Override
        public int compareTo(Student stu){
            String a = new String(String.valueOf(this.getCgpa()) + this.getFname() + String.valueOf(this.getId()));
            String b = new String(String.valueOf(stu.getCgpa()) + stu.getFname() + String.valueOf(stu.getId()));
            return a.compareTo(b);            
        }
}