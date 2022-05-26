package structural.adapter

class RawSMS(message: String) {
    var transactionID: String = ""
    var timestamp: String = ""
    var message: String = ""
    var shortcode: String = ""
    var recipient: String = ""
    var sender: String = ""

    init {
        this.message = message
    }
}