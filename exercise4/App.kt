package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try{
        cekNumber("Icha")
    } catch(e:Throwable){
        println("Tipe data inputan bukanlah angka")
    }

}

fun cekNumber(x:Any){
    when(x){
        !is Int, Double, Float, Long -> throw Throwable()
    }
}