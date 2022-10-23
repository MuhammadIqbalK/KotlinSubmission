package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
/*
berikut adalah contoh sederhana penggunaan try catch untuk menangani indexoutofbound dimana ketika array yang dipanggil tidak ada/belum ada


 */
    try {
        val array = arrayOf("satu", "dua")
        println(array[3])
    }
    catch (a :IndexOutOfBoundsException){
        println("nilai tidak ditemukan\n"+a)
    }
    finally{

        println("finally block selalu dijalankan")
    }

//println(array)

}