//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Kotlin has type inference
    val inmutable = 10
    var mutable = 5
    mutable = 10

    val customers = 10
    println("There are $customers customers")
    //customers = "hola" <- Cant be done
    println("There are ${customers + 1} customers")

    //Declare without initialization
    val d: Int

    //Collections: Lists, Sets, Maps
    // ========= LIST =========
    val readOnlyList = listOf("this", "is", "read-only") //read-only
    println(readOnlyList)
    val mutableList = mutableListOf("this", "is", "mutable") //mutable list
    val mutableListMultiType = mutableListOf("this", 10, "mutable") //mutable list with multiples types
    println(mutableListMultiType)
    val mutableListType: MutableList<String> = mutableListOf("this", "is", "mutable")
    val mutableListType2 = mutableListOf<String>("this", "is", "mutable")

    //Casting
    val mutableListLocked = listOf(readOnlyList)
    val mutableListLocked2: List<String> = mutableList

    //Length and check elements inside
    println("mutableList has ${mutableList.count()} elements")
    println("read-only" in mutableList)

    //Add and remove
    mutableList.add("new")
    mutableList.remove("new")


    // ========= SET =========
    //Same extension functions, different declarations
    val readOnlySet = setOf("read-only", "set")
    val mutableSet = mutableSetOf("mutable", "set")


    // ========= MAP =========
    val readOnlyMap = mapOf("apple" to 10, "kiwi" to 4, "orange" to 9)
    val mutableMap = mutableMapOf("apple" to 10, "kiwi" to 4, "orange" to 9)
    //Add and remove
    mutableMap.put("strawberry", 6)
    mutableMap["melon"] = 6
    mutableMap.remove("strawberry")

    //keys and values
    println("keys ${mutableMap.keys}")
    println("mutableMap has apple? ${mutableMap.containsKey("apple")}")
    println("values ${mutableMap.values}")


    // ================ CONTROL FLOW ================
    // ========= IF =========
    val e: Int
    val check = true
    if (check) {
        e = 1
    } else {
        e = 2
    }

    //Can be rewriten as
    val f = if (check) {
        1
    } else {
        2
    }

    val a = 1; val b = 2
        println(if (a > b) a else b)

    // ========= WHEN =========
    val caseWhen = "case1"

    when (caseWhen) {
        "case1" -> print("case1")
        "case2" -> print("case2")
        "case3" -> print("case3")
        else -> {
            println("other case")
        }
    }

    when (caseWhen) {
        "case1" -> print("case1")
        "case2" -> print("case2")
        "case3" -> print("case3")
        else -> {
            println("other case")
        }
    }

    //Assign variables using when
    val temperature = 19
    val desc = when {
        temperature < 0 -> "cold"
        temperature < 10 -> "less cold"
        temperature < 20 -> "warm"
        else -> "hot"
    }

    // ========= RANGES =========
    //From 1 to 4: 1..4
    //Without including end value: 1..<4
    //Reverse order: 4 downTo 1
    //With a step: 1..5 step 2
    //Can do orders with Char
        //'a'..'d' ...

    // ========= FOR =========
    for (number in 1..5)
        println(number)

    val list = listOf("item1", "item2", "item3")
    for (elem in list) {
        println(elem)
    }

    // ========= WHILE =========
    var number = 0
    while (number < 3) {
        print("number + 1")
        number++
    }


    // ========= DO-WHILE =========
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}