package com.knoldus.Ems

// declaring traits for all employee typee

trait ConsultantTrait {

  def Consultant(FirstName: String, LastName: String, Salary: Double, id: String)

}
trait ManagerTrait {

  def Manager(FirstName: String, LastName: String, Salary: Double, id: String)

}

trait SeniorManagerTrait {

  def SeniorManager(FirstName: String, LastName: String, Salary: Double, id: String)

}

trait PresidentTrait {

  def President(FirstName: String, LastName: String, Salary: Double, id: String)

}
