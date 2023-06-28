fun main() {
	var cash = 550
	var water = 400
	var milk = 540
	var beans = 120
	var pcups = 9

	var needCups = 1
	var needWater: Int
	var needBeans: Int
	var needCash: Int
	var needMilk: Int

	println("The coffee machine has:")
	println("$water ml of water")
	println("$milk ml of milk")
	println("$beans g of coffee beans")
	println("$pcups disposable cups")
	println("$$cash of money\n")

	loop@ while (true) {

	println("Write action (buy, fill, take): ")
	val act = readln()

	if (act == "buy") {
		println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
		val actCoffee = readln().toInt()

		if (actCoffee == 1) {
			needWater = 250
			needBeans = 16
			needCash = 4

			water -= needWater
			beans -= needBeans
			pcups -= needCups
			cash += needCash
			break@loop
		}

		if (actCoffee == 2) {
			needWater = 350
			needMilk = 75
			needBeans = 20
			needCash = 7

			water -= needWater
			milk -= needMilk
			beans -= needBeans
			pcups -= needCups
			cash += needCash
			break@loop
		}

		if (actCoffee == 3) {
			needWater = 200
			needMilk = 100
			needBeans = 12
			needCash = 6

			water -= needWater
			milk -= needMilk
			beans -= needBeans
			pcups -= needCups
			cash += needCash
			break@loop
		}

		else { 
			println("That coffee doesn't exist")
			continue@loop
		}
	}

	if (act == "fill") {
		println("Write how many ml of water you want to add: ")
		water += readln().toInt()

		println("Write how many ml of milk you want to add:")
		milk += readln().toInt()

		println("Write how many grams of coffee beans you want to add: ")
		beans += readln().toInt()

		println("Write how many disposable cups you want to add: ")
		pcups += readln().toInt()
		break@loop
	}

	if (act == "take") {
		println("I gave you $$cash")
		cash = 0
		break@loop
	}

	else {
		println("That's not an option")
		continue@loop
	}
	}

	println("The coffee machine has:")
	println("$water ml of water")
	println("$milk ml of milk")
	println("$beans g of coffee beans")
	println("$pcups disposable cups")
	println("$$cash of money\n")
	

	}