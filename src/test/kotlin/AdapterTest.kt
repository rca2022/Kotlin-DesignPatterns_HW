import structural.adapter.PromoAdapter
import structural.adapter.RawSMS
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class AdapterTest {

    @Test
    fun checkCorrectMessage(){
        val rawSMS = RawSMS("PROMO MESSAGE")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertEquals("PROMO MESSAGE", promoProcessing.message)
    }

    @Test
    fun checkMissingSpaceMessage(){
        val rawSMS = RawSMS("PROMOMESSAGE")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertNotEquals("PROMO MESSAGE", promoProcessing.message)
    }

    @Test
    fun checkCaseSensitive(){
        val rawSMS = RawSMS("Promo Message")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertNotEquals("PROMO MESSAGE", promoProcessing.message)
    }
    @Test
    fun checkSpelling(){
        val rawSMS = RawSMS("PR0M0 M3SS4G3")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertNotEquals("PROMO MESSAGE", promoProcessing.message)
    }

}