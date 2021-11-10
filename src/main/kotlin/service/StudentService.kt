package service

import java.util.HashMap
import model.Course
import model.Student as Student1

class StudentService {
    private val students: MutableMap<String?, Student1> = HashMap()
    fun subscribeStudent(student: Student1) {
        students[student.id] = student
    }

    fun findStudent(studentId: String?): Student1? {
        return if (students.containsKey(studentId)) {
            students[studentId]
        } else null
    }

    fun isSubscribed(studentId: String?): Boolean {
        return students.contains(studentId)

    }

    fun showSummary() {

        println(students.toList())

    }

    fun enrollToCourse(studentId: String?, course: Course?) {
        if (students.containsKey(studentId)) {
            students[studentId]!!.enrollToCourse(course)
        }
    }
}