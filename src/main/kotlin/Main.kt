fun main() {
    val catFuzz = Cat("Fuzzy Fuzz")
    val catKatzu = Cat("Katzu")
    val fishFinny = Cat("Finny")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatzu)
    petVet.treat(fishFinny)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatzu, 29)

    val topCat = catContest.getWinners().first()
    println("Winner cat: ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 40)
    petContest.addScore(fishFinny, 54)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is: ${topPet.name}")

    val fishContest = Contest<Fish>(petVet) // this is possible because of "in T" in Contest class

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer() // this is possible because of "out T" in Retailer interface
    petRetailer.sell()

}