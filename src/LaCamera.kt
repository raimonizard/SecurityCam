/**
 * Funció main principal que executa el programa
 *
 * @author raimonizard
 * @since 1.0
 */
fun main(){
    val ROWS: Int = 10
    val COLS: Int = 9

    val frame1: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    frame1[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame1[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    frame1[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame1[3] = intArrayOf(0,0,0,1,1,1,0,0,0)
    frame1[4] = intArrayOf(0,0,1,0,1,0,1,0,0)
    frame1[5] = intArrayOf(0,1,0,0,1,0,0,1,0)
    frame1[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame1[7] = intArrayOf(0,0,0,1,0,1,0,0,0)
    frame1[8] = intArrayOf(0,0,1,0,0,0,1,0,0)
    frame1[9] = intArrayOf(0,1,0,0,0,0,0,1,0)

    val frame2: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    frame2[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame2[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    frame2[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame2[3] = intArrayOf(0,1,1,1,1,1,0,0,0)
    frame2[4] = intArrayOf(0,0,0,0,1,0,1,0,0)
    frame2[5] = intArrayOf(0,0,0,0,1,0,0,1,0)
    frame2[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame2[7] = intArrayOf(0,0,0,1,0,1,0,0,0)
    frame2[8] = intArrayOf(0,0,1,0,0,0,1,0,0)
    frame2[9] = intArrayOf(0,1,0,0,0,0,0,1,0)

    val frame3: Array<IntArray> = Array(ROWS){ IntArray(COLS) }
    frame3[0] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame3[1] = intArrayOf(0,0,0,1,0,1,0,0,0)
    frame3[2] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame3[3] = intArrayOf(0,0,0,1,1,1,0,0,0)
    frame3[4] = intArrayOf(0,0,1,0,1,0,1,0,0)
    frame3[5] = intArrayOf(0,1,0,0,1,0,0,1,0)
    frame3[6] = intArrayOf(0,0,0,0,1,0,0,0,0)
    frame3[7] = intArrayOf(0,0,0,1,0,1,1,1,0)
    frame3[8] = intArrayOf(0,0,1,0,0,0,0,0,0)
    frame3[9] = intArrayOf(0,1,0,0,0,0,0,0,0)

    printPicture(frame1)
    println()
    printPicture(frame2)
    println()
    printPicture(frame3)
    println()
}

/**
 * Funció que serveix per imprimir i visualitzar els fotogrames en blanc i negre
 *
 * @author raimonizard
 * @param frame Paràmetre d'entrada de tipus matriu d'arrays Array<IntArray>
 * @since 1.0
 */
fun printPicture(frame: Array<IntArray>){
    val RESET: String = "\u001b[0m"
    val WHITE_BOLD: String = "\u001b[1;37m"
    val BLACK_BACKGROUND: String = "\u001b[40m"

    print("   ")
    for (i in 0 until frame[0].size)
        print("[$i]")

    println("")

    for (f in 0 until frame.size) {
        print("[$f]")
        for (c in 0 until frame[f].size) {
            if (frame[f][c] == 1) {
                print("" + BLACK_BACKGROUND + WHITE_BOLD + String.format("%2s ", frame[f][c]) + RESET)
            }
            else {
                print(String.format("%2s ",frame[f][c]))
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

    // TODO: Completar la funció


    return movimentDetectat
}

/**
 * Funció que rep dos fotogrames per paràmetre i que troba i imprimeix les coordenades dels píxels que han canviat
 *
 * @param f1 Paràmetre que representa una matriu de 2D de tipus Array<IntArray>
 * @param f2 Paràmetre que representa una matriu de 2D de tipus Array<IntArray>
 * @author el teu nom
 * @since 2.0
 */
fun findPixels(f1: Array<IntArray>, f2: Array<IntArray>){
    // TODO: Troba i imprimeix per pantalla els píxels que han canviat d'un frame a l'altre
}