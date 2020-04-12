package ge.msda.recyclerview

import androidx.annotation.DrawableRes

data class Product(
    val id: Int,
    val Company: String,
    val Price: String,
    @DrawableRes
    val Image: Int
) {
    fun getInfo() : String {
        return "$Company - $Price"
    }
}