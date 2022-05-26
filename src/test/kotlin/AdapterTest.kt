import structural.adapter.PromoAdapter
import structural.adapter.RawSMS
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterTest {

    @Test
    fun smsChecker(){
        val rawSMS = RawSMS("PROMO MESSAGE")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertEquals("PROMO MESSAGE", promoProcessing.message)
    }
}