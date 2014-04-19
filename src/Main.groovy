/**
 * Created by nicolas on 19/04/14.
 */
class Main {

    static main(args) {
        println "hello, world"

        def list = [1, 2, 3]
        for (i in list) { println i }

        def mySalut = new Salut(salut: "Wesh")

        println mySalut.saySalut("Nico")
    }


}
