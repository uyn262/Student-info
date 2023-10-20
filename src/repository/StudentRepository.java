/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import dataAccess.StudentDAO;
import model.Student;
/**
 *
 * @author Admin
 */
public class StudentRepository implements IStudentRepository{

    @Override
    public void display(ArrayList<Student> lt) {
        StudentDAO.Instance().display(lt);
    }
    
}
