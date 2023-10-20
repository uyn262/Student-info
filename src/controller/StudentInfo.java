/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import repository.StudentRepository;
import model.Student;
/**
 *
 * @author Admin
 */
public class StudentInfo {

    StudentRepository program;
    ArrayList<Student> lt;

    public StudentInfo() {
        program = new StudentRepository();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
    
}
