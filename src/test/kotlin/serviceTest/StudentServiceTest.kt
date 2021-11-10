package serviceTest

import model.Student
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import service.StudentService

internal class StudentServiceTest {




    @Test

    fun findStudentTest() {

        val findStudent = StudentService()

        val estudante = Student("1001", "Gabriel Santos", "Gabriel.Santos@teste.com", null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("1001"))
    }
    }


