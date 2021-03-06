package hr.dominikricko.rma_lv2.model

import java.io.Serializable

data class InspiringPerson(
    var name: String,
    var imageUrl: String?,
    var dateOfBirth: String,
    var dateOfDeath: String?,
    var description: String
) : Serializable {

    private val _quotes = ArrayList<String>()

    val quotes: Collection<String>
        get() = _quotes

    fun addQuote(quote: String) {
        _quotes.add(quote)
    }

    fun removeQuote(quote: String) {
        _quotes.remove(quote)
    }

}
