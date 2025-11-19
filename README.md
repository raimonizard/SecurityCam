# CCTV Security Cam Project 📹
This project simulates a CCTV security camera.

![CCTV camera](https://www.techcube.co.uk/wp-content/uploads/2017/09/cctv-camera.jpg)

It captures a frame in black and white every 30 seconds. The frames are represented as a matrix of 90 pixels with 10 rows and 9 cols with binary values of 0 being white and 1 being black.

>[!WARNING]
> Can you spot the movements between two diferent frame captures?

## First frame captured:
![first frame](screenshot/screenshot1.png)

## Second frame captured:
![second frame](screenshot/screenshot2.png)

## Third frame captured:
![third frame](screenshot/screenshot3.png)

## Check movement
Can you check if there was any movement?

Complete functions called:

1. `checkMovement()`
2. `findPixels()`

``` kotlin
fun checkMovement(f1: Array<IntArray>, f2: Array<IntArray>): Boolean{
    var movimentDetectat: Boolean = false

    //TODO: Completar la funció


    return movimentDetectat
}
```
``` kotlin
fun findPixels(f1: Array<IntArray>, f2: Array<IntArray>){
    // TODO: Troba i imprimeix per pantalla els píxels que han canviat d'un frame a l'altre
}
```
