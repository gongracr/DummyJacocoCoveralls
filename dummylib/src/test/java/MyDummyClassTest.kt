import io.gongracr.dummylib.MyDummyClass
import junit.framework.Assert.assertEquals
import org.junit.Test

class MyDummyClassTest {
    @Test
    fun `calculates square correctly`() {
        val aSquare = MyDummyClass().calculateSquare(4)
        assertEquals(16, aSquare)
    }
}