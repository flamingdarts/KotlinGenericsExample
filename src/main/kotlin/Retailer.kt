//Using "out T" to accept subtype in place of supertype -> covariant
interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Selling cat")
        return Cat("")
    }
}

class FishRetailer: Retailer<Fish> {
    override fun sell(): Fish {
        println("Selling fish")
        return Fish("")
    }
}

class DogRetailer: Retailer<Dog> {
    override fun sell(): Dog {
        println("Selling dog")
        return Dog("")
    }
}