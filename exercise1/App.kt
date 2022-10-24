package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */

fun myProfile() {
    val frontName: String = "Icha"
    val lastName: String = "Sinaga"
    val age: Int = 20
    //age.toString()
    var statusSingle: Boolean = true
    if (statusSingle == true) {
        println("Nama saya adalah $frontName $lastName. Umur saya $age tahun dan saya single")
    } else if (statusSingle == false) {
        println("Nama saya adalah $frontName $lastName. Umur saya $age tahun dan saya sudah taken")
    }
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Kami dari Group $groupId dengan anggota $groupMember pada sesi $session")
    return arrayOf(groupId, groupMember, session)

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val myGroupList = listOf("Adel", "Aristo", "Darma", "Deo", "Icha")
    //println("${myGroupList[4]}")
    return myGroupList[4]
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5
    val totalMentor = mentor.count()
    val total = countOfGroup + totalMentor
    return total

}

fun main() {
    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val groupDetail = groupDetail(5, listOf("Adellina", "Deo", "Darma", "Aristo", "Icha"), "Morning")
}