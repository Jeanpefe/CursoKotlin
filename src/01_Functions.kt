
fun subtract(x: Int, y: Int): Int {
    return x - y
}

fun add(x: Int, y: Int = 3): Int { // Default values
    return x + y
}

fun sum(x:Int, y:Int) = x + y // Single-expression functions

fun main() {
    println(subtract(y = 3, x = 5))
    println(add(2))
    println(add(2, 3))


    // ================ LAMBDA EXPRESSIONS ================
    println({string: String -> string.uppercase()} ("hello")) //params -> function

    //Asign lambda expression to a variable
    val upperCase = {string: String -> string.uppercase()}
    println("Uppercase with lambda ${upperCase("hola")}")

    //Pass to another function
    val numbers = listOf(1, 2, -5, 7)
    val positiveNumbersParenthesis = numbers.filter ({x -> x > 0})
    println(positiveNumbersParenthesis)
    val positiveNumbers = numbers.filter {x -> x > 0} //We can get rid of parenthesis
    val doubledNumbers = numbers.map {x -> x*2}

    // ========= FUNCTION TYPES =========
    //When defining lambdas in variables -> declare types
    val upperCase2 = {string: String -> string.uppercase()}
    val upperCase3: (String) -> String = {string -> string.uppercase()}

    //We can return lambda functions like this:
    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    val hourToSec = toSeconds("hour")
    val hours = listOf(1, 5, 10)
    val hoursInSec = hours.map(hourToSec)
    println(hoursInSec)

    // Exercise 1
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { x -> prefix + "/" + id + "/" + x}
    val urlsExampleSol = actions.map { action -> "$prefix/$id/$action" }
    println(urls)

    //Exercise 2
    fun repeatN(n: Int, action: () -> Unit) {
        for (number in 1..n) {
            action()
        }
    }

    repeatN(5, { println("Hello") })
    repeatN(5) { println("Hello") } //Better practise
}