package id.infinitelearning.KotlinSubmission.exercise5

import id.infinitelearning.KotlinSubmission.exercise1.myProfile

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val Hero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    Hero.setProfile("Icha", 20, 155)



    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    Hero.profile()



    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Group 7: jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    fun Group1(){
        Hero.jalan(5)
        Hero.lari(2)
        Hero.makan(3)
        Hero.minum(1)
        Hero.lompat(3)
        Hero.duduk(1)
    }
    fun Group2(){
        Hero.jalan(2)
        Hero.lari(2)
        Hero.makan(1)
        Hero.minum(3)
        Hero.lompat(1)
        Hero.duduk(2)
    }
    fun Group3(){
        Hero.jalan(3)
        Hero.lari(1)
        Hero.makan(5)
        Hero.minum(1)
        Hero.lompat(5)
        Hero.duduk(3)
    }
    fun Group4(){
        Hero.jalan(5)
        Hero.lari(4)
        Hero.makan(4)
        Hero.minum(4)
        Hero.lompat(3)
        Hero.duduk(2)
    }
    fun Group5(){
        Hero.jalan(4)
        Hero.lari(1)
        Hero.makan(3)
        Hero.minum(5)
        Hero.lompat(5)
        Hero.duduk(3)
    }
    fun Group6(){
        Hero.jalan(2)
        Hero.lari(4)
        Hero.makan(2)
        Hero.minum(2)
        Hero.lompat(7)
        Hero.duduk(4)
    }
    fun Group7(){
        Hero.jalan(1)
        Hero.lari(3)
        Hero.makan(1)
        Hero.minum(1)
        Hero.lompat(2)
        Hero.duduk(1)
    }




    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    Group1()
    println("---------------------------")
    Group2()
    println("---------------------------")
    Group3()
    println("---------------------------")
    Group4()
    println("---------------------------")
    Group5()
    println("---------------------------")
    Group6()
    println("---------------------------")
    Group7()
    println("---------------------------")
    Hero.profile()


}