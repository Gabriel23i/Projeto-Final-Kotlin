package serviceTest

import org.junit.Test
import org.junit.jupiter.api.Assertions
import service.CourseService


internal class CourseServiceTest {

    @Test

    fun showSummaryTest ()
    {
        var Sum = CourseService()

        Assertions.assertEquals(null, Sum.getCourse("INTRO-CS-666"))

    }

}