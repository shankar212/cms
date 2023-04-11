package com.cmsa.Service;

import com.cmsa.DAO.StudentDAO;
import com.cmsa.Model.StudentModel;
import com.cmsa.exception.StudentExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentDAO ld;
    /**
     * Returns a list of all students
     */
    public List<StudentModel> getAllLogin() {
        return ld.findAll();
    }
    /**
     * Saves a new student, throws an exception if a student with the same email, phone, or id already exists
     */

    public void saveStudent(StudentModel student) {
        Optional<StudentModel> existingByEmail = Optional.ofNullable(ld.findByEmail(student.getEmail()));
        if (existingByEmail.isPresent()) {
            throw new StudentExistsException("A student with this email already exists: " + student.getEmail());
        }
        
        Optional<StudentModel> existingByPhone = ld.findByMobileno(student.getMobileno());
        if (existingByPhone.isPresent()) {
            throw new StudentExistsException("A student with this phone already exists: " + student.getMobileno());
        }
        
        Optional<StudentModel> existingById = ld.findById(student.getId());
        if (existingById.isPresent()) {
            throw new StudentExistsException("A student with this id already exists: " + student.getId());
        }
        
        ld.save(student);
    }
    /**
     * Updates an existing student with the provided data, throws an exception if the student is not found
     */
    public void updateStudent(StudentModel student) {
        Optional<StudentModel> existingStudent = ld.findById(student.getId());
        if (existingStudent.isPresent()) {
            ld.save(student);
        } else {
            throw new StudentExistsException("Student not found with id: " + student.getId());
        }
    }
    /**
     * Deletes an existing student, throws an exception if the student is not found
     */
    public void deleteStudent(StudentModel student) {
        Optional<StudentModel> existingStudent = ld.findById(student.getId());
        if (existingStudent.isPresent()) {
            ld.delete(student);
        } else {
            throw new StudentExistsException("Student not found with id: " + student.getId());
        }
    }
    /**
     * Returns a student with the provided email, throws an exception if the student is not found
     */
    public StudentModel getStudentById(String email) {
        Optional<StudentModel> student = ld.findById(email);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new StudentExistsException("Student not found with email: " + email);
        }
    }

//    public void saveUser(StudentModel student) {
//        ld.save(student);
//    }
}
