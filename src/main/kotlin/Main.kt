fun main(args: Array<String>) {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000
    val discountBigest = 10_000
    var regularPurchaser = true;

    val totalPrice = itemPrice * itemCount

    if (totalPrice <= discountStart) {
        if (regularPurchaser) {
            val result = totalPrice - (totalPrice / 100)
            println(result)
        } else {
            val result = totalPrice
            println(result)
        }

    } else if (totalPrice > discountStart && totalPrice <= discountBigest) {
        if (regularPurchaser) {
            val result = (totalPrice - (totalPrice - discount)) - (totalPrice / 100)
            println(result)
        } else {
            val result = totalPrice - discount
            println(result)
        }

    } else if (totalPrice > discountBigest) {
        if (regularPurchaser) {
            val result = (totalPrice - ((totalPrice / 100) * 5)) - (totalPrice / 100)
            println(result)
        } else {
            val result = (totalPrice - ((totalPrice / 100) * 5))
            println(result)

        }
    }
}