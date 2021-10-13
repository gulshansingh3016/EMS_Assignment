package com.knoldus.Ems


class EmpConsultant extends ConsultantTrait {
  private val ConsultantPrefix = "CONS"

  override def Consultant(FirstName: String, LastName: String, Salary: Double, id: String): Unit = println("The Employee First Name is " + FirstName + " last name is " + LastName + " Salary = " + Salary + " ID is " + ConsultantPrefix + id)
}

  class EmpManager extends ManagerTrait {
    private val ManagerPrefix = "MANA"

    override def Manager(FirstName: String, LastName: String, Salary: Double, id: String): Unit = println("The Employee First Name is " + FirstName + "last name is " + LastName + "Salary = " + Salary + "ID is" + ManagerPrefix + id)
  }

  class EmpSeniorManager extends SeniorManagerTrait {
    private val SeniorMangerPrefix = "SRMA"

    override def SeniorManager(FirstName: String, LastName: String, Salary: Double, id: String): Unit = println("The Employee First Name is " + FirstName + "last name is " + LastName + "Salary = " + Salary + "ID is" + SeniorMangerPrefix + id)
  }

  class EmpPresident extends PresidentTrait {
    private val PresidentPrefix = "POTC"

    override def President(FirstName: String, LastName: String, Salary: Double, id: String): Unit = println("The Employee First Name is " + FirstName + "last name is " + LastName + "Salary = " + Salary + "ID is" + PresidentPrefix + id)
  }
