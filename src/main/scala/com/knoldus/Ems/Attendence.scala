package com.knoldus.Ems


class Attendence extends ConsultantTrait with ManagerTrait with SeniorManagerTrait with PresidentTrait {

  case class EmpType(profiles: String)

  override def Consultant(FirstName: String, LastName: String, Salary: Double, id: String): Unit = {}
  override def Manager(FirstName: String, LastName: String, Salary: Double, id: String): Unit = {}
  override def SeniorManager(FirstName: String, LastName: String, Salary: Double, id: String): Unit = {}
  override def President(FirstName: String, LastName: String, Salary: Double, id: String): Unit = {}

  def empAttendence(emp: EmpType, StartTime: Double, EndTime: Double): Unit = {
    println(s"$emp, $StartTime, $EndTime")
  }

  //val a = new EmpConsultant().Consultant("a", "b", 12.0, "46")


  def empAttendence(emp: ConsultantTrait, startTime: Double = 9.45 , endTime: Double = 6.45): Unit = {


  }

}

object test{
  def main(args: Array[String]): Unit = {
    val call = new Attendence
    call.empAttendence(call.EmpType("Consultant"), 9.45, 6.45)



  }
}