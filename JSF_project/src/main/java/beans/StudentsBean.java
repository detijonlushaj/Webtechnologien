/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "students")
@SessionScoped
public class StudentsBean implements Serializable{

  private List<Student> studList;
  private int index = 1;

  public StudentsBean() {
    studList = new ArrayList<>();
    studList.add(new Student("Daisy", "Duck", 17111234));
    studList.add(new Student("Donald", "Duck", 42148007));
    studList.add(new Student("Uncle", "Dagobert", 12185561));
    studList.add(new Student("Goofy", "Disney", 32141114));
  }
  public List<Student> getStudList() {
    return studList;
  }
  
  public String changeStud(int s){
      index = s;
      return "DataTable_EditStudent.xhtml";
  }
  
  public int getIndex(){
      return index;
  }
  
 public String goBack(){
      
      return "DataTable_ShowStudents.xhtml";
  }


}
    
