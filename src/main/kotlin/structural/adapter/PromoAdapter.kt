package structural.adapter

//public class PromoAdapter extends Promo implements PromoProcessing{

class PromoAdapter(private val rawSMS: RawSMS) : Promo(), PromoProcessing{

    override fun registerPromo() {
        this.message = rawSMS.message
    }
}