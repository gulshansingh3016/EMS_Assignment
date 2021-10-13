package com.knoldus.Ems

 class CheckSalary {
  def check(salary: Double):Boolean={
    if(salary < 0){
      return false
    }
    true
  }
}
