package structural.adapter

class RawSMS(var message: String = "") {
    var transactionID: String = ""
    var timestamp: String = ""
    var shortcode: String = ""
    var recipient: String = ""
    var sender: String = ""
}