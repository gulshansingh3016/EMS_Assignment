package com.knoldus.Ems

//class EmployeeModel(FirstName: String, LastName: String, Salary: Double, ID: String){
//  require(Salary>0,"Salary should be positive")
//  def getFullname = FirstName.toLowerCase.capitalize + "" + LastName.toLowerCase.capitalize

  class CheckID {
    def check(id: String):Boolean={
      if(id == "ABC"){
        return false
      }
      true
    }
  }


