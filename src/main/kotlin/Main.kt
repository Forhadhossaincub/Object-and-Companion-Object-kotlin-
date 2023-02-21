fun main(args: Array<String>) {

    Database.connect()
    Calculator.pi
}
object  Database{
    fun connect(){
    }
}
class  Calculator{

    companion object Constant{

        val pi = 3.1416
        val radian =0.0174

    }

}

