/**
 * Funció main principal que executa el programa
 *
 * @author raimonizard
 * @since 1.0
 */
fun main(){
    val ROWS: Int = 10
    val COLS: Int = 9

    val picture1: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    picture1[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture1[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    picture1[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture1[3] = intArrayOf(0,0,0,1,1,1,0,0,0)
    picture1[4] = intArrayOf(0,0,1,0,1,0,1,0,0)
    picture1[5] = intArrayOf(0,1,0,0,1,0,0,1,0)
    picture1[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture1[7] = intArrayOf(0,0,0,1,0,1,0,0,0)
    picture1[8] = intArrayOf(0,0,1,0,0,0,1,0,0)
    picture1[9] = intArrayOf(0,1,0,0,0,0,0,1,0)

    val picture2: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    picture2[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture2[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    picture2[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture2[3] = intArrayOf(0,1,1,1,1,1,0,0,0)
    picture2[4] = intArrayOf(0,0,0,0,1,0,1,0,0)
    picture2[5] = intArrayOf(0,0,0,0,1,0,0,1,0)
    picture2[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture2[7] = intArrayOf(0,0,0,1,0,1,0,0,0)
    picture2[8] = intArrayOf(0,0,1,0,0,0,1,0,0)
    picture2[9] = intArrayOf(0,1,0,0,0,0,0,1,0)

    val picture3: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    picture3[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture3[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    picture3[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture3[3] = intArrayOf(0,0,0,1,1,1,0,0,0)
    picture3[4] = intArrayOf(0,0,1,0,1,0,1,0,0)
    picture3[5] = intArrayOf(0,1,0,0,1,0,0,1,0)
    picture3[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    picture3[7] = intArrayOf(0,0,0,1,0,1,1,1,0)
    picture3[8] = intArrayOf(0,0,1,0,0,0,0,0,0)
    picture3[9] = intArrayOf(0,1,0,0,0,0,0,0,0)

    printPicture(picture1)
    printPicture(picture2)
    printPicture(picture3)
}

/**
 * Funció que serveix per imprimir i visualitzar els fotogrames en blanc i negre
 *
 * @author raimonizard
 * @param fotograma Paràmetre d'entrada de tipus matriu d'arrays Array<IntArray>
 * @since 1.0
 */
fun printPicture(fotograma: Array<IntArray>){
    val RESET: String = "\u001b[0m"
    val WHITE_BOLD: String = "\u001b[1;37m"
    val BLACK_BACKGROUND: String = "\u001b[40m"

    print("   ")
    for (i in 0 until fotograma[0].size)
        print("[$i]")

    println("")

    for (f in 0 until fotograma.size) {
        print("[$f]")
        for (c in 0 until fotograma[f].size) {
            if (fotograma[f][c] == 1) {
                print("" + BLACK_BACKGROUND + WHITE_BOLD + String.format("%2s ", fotograma[f][c]) + RESET)
            }
            else {
                print(String.format("%2s ",fotograma[f][c]))
            }

        }
        println("")
    }
}

/**
 * Funció que rep dos fotogrames per paràmetre i comprova si algun píxel ha canviat
 *
 * @param f1 Paràmetre que representa una matriu de 2D de tipus Array<IntArray>
 * @param f2 Paràmetre que representa una matriu de 2D de tipus Array<IntArray>
 * @author el teu nom
 * @since 2.0
 */
fun checkMovement(f1: Array<IntArray>, f2: Array<IntArray>): Boolean{
    var movimentDetectat: Boolean = false

    //TODO: Completar la funció


    return movimentDetectat
}