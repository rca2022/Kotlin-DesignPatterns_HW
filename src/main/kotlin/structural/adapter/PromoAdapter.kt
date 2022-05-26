package structural.adapter

//public class PromoAdapter extends Promo implements PromoProcessing{

class PromoAdapter(private var rawSMS: RawSMS) : Promo(), PromoProcessing{

    override fun registerPromo() {
        this.message = rawSMS.message
    }
}