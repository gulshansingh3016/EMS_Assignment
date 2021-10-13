package com.knoldus.EmsTest
import com.knoldus.Ems.{CheckID, CheckSalary, EmpConsultant}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeTest extends AnyFlatSpec{

 val chcksal = new CheckSalary()
 val checkId = new CheckID()
 val salary = 10000.0
  val negSalary = -10000.0

  val id = "CONS1614"


  behavior of " Employee Info"
  it should " return full information" in {
    val testobj = new EmpConsultant()
    testobj.Consultant("Gulshan", "Singh", salary, "1614")
    assert(chcksal.check(salary))

  }

     "Employee Salary " should "be positive number" in {
       val testobj1 = new EmpConsultant()
       testobj1.Consultant("Gulshan", "Singh", negSalary, "1614")
      // require(testobj1.Consultant("Gulshan", "Singh", 10, "1614"))
      assert(chcksal.check(negSalary))



     }

  "Employee ID " should "Match" in {
    val testobj1 = new EmpConsultant()
    testobj1.Consultant("Gulshan", "Singh", 120000, id)

    assert(checkId.check(id))



  }

}

