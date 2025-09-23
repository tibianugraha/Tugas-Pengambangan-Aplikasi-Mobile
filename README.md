# Tugas 2

## Modul 1: Mengenal pemrograman Kotlin dengan menggunakan Array, List, Looping dan penggunaan Konstruktor pada Class dan Setter-Getter

###Membuat Array dan List
  Pada bagian ini anda akan mencoba untuk menuliskan Array dan List kemudian menampilkannya dengan menggunakan looping. Berikut ini merupakan langkah-langkah yang dilakukan:
#### 1. Langkah pertama silahkan tulis kode program berikut ini:

```
fun main() {
    val school = listOf("mackerel", "trout", "halibut")
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    
    println(school)
    println(myList)
}
```
OUTPUT
<img width="677" height="686" alt="Screenshot 2025-09-23 214551" src="https://github.com/user-attachments/assets/5a5d226c-9fdf-4190-9f30-7075287cdeb2" />


#### 2. menampilkan looping pada program diatas.

```
fun main() {
    val school = listOf("mackerel", "trout", "halibut")
    
    val myList = mutableListOf("tuna", "salmon", "shark")
	myList.remove("shark")
    
    println(school)
    println(myList)
    
    println("Print data using Looping")
    
    var i=0
    for (element in school) {
        i++
    	println("$i: $element")
	}
    
    
}
```

OUTPUT
<img width="683" height="709" alt="image" src="https://github.com/user-attachments/assets/3383f90d-dba9-47ce-86b4-1264adff3fca" />


### Membuat Konstruktor pada Class
Pada bagian ini anda akan mencoba untuk menuliskan Konstruktor pada Class dan menambahkan setter-getter didalamnya. Berikut ini merupakan langkah-langkah yang dilakukan:

#### 1. Langkah pertama silahkan tulis kode program berikut ini:

```
class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    
}

fun main() {
        val aquarium1 = Aquarium()
        val aquarium2 = Aquarium(width = 25)
        val aquarium3 = Aquarium(height = 35, length = 110)
        val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
}
```

OUTPUT
<img width="676" height="745" alt="image" src="https://github.com/user-attachments/assets/67667ea3-fb0e-4028-ae62-9a25028ffaea" />

#### 2. Langkah selanjutnya kita akan menambahkan konstruktor dengan cara lain yakni menggunakan constructor seperti program dibawah ini.

```
class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        println("Tank: $tank")
    }
}
   
    fun main() {
        val aquarium1 = Aquarium()
        val aquarium2 = Aquarium(width = 25)
        val aquarium3 = Aquarium(height = 35, length = 110)
        val aquarium4 = Aquarium(width = 25, height = 35, length = 110)        
        val aquarium5 = Aquarium(numberOfFish = 29)
 }
```

OUTPUT
<img width="664" height="767" alt="image" src="https://github.com/user-attachments/assets/06a2b45c-b644-4490-90dc-4d5b04d7f60b" />

#### 3. Langkah selanjutnya kita akan menambahkan setter-getter seperti program dibawah ini:

```
class Aquarium (val length: Int = 100, val width: Int = 20, var height: Int = 40) {
    
    var volume: Int
    get() = width * height * length / 1000
    set(value) {
        height = (value * 1000) / (width * length)
    }
    
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }
    
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        println("Tank: $tank")
    }
    
    fun printSize() {
    	println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")
        
        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
    }
    
}
   
    fun main() {
        val aquarium1 = Aquarium()
        aquarium1.printSize()
        // default height and length
        val aquarium2 = Aquarium(width = 25)
        aquarium2.printSize()
        // default width
        val aquarium3 = Aquarium(height = 35, length = 110)
        aquarium3.printSize()
        // everything custom
        val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
        aquarium4.printSize()
        val aquarium5 = Aquarium(numberOfFish = 29)
        aquarium5.printSize()
   }
```

OUTPUT
<img width="666" height="767" alt="image" src="https://github.com/user-attachments/assets/4f6d642c-7956-45d6-bcd8-28b6f4c6922e" />

## Modul 2: Menjalankan aplikasi pada Device Android

#### 1. mebuat
butki
<img width="905" height="612" alt="Screenshot 2025-09-23 222939" src="https://github.com/user-attachments/assets/8c62e3d0-244e-4b80-b53b-03d235cd8281" />

#### 2. Buat file
bukti
<img width="907" height="609" alt="Screenshot 2025-09-23 223110" src="https://github.com/user-attachments/assets/02b8161a-3510-4199-b520-8661ba2246e0" />

## Modul 3: Mengenal struktur proyek pada pembuatan aplikasi Android

Di dalam modul ini saya belajar untuk mengenal struktur proyek pada pembuatan aplikasi android yaitu :
1. Resources: layouts, images, strings, colors as XML dan media files
2. Components: activities, services, dan helper classes dengan menggunakan bahasa Java/Kotlin
3. Manifest: Informasi terkait setting/ runtime pada apps
4. Build configuration: APK versions yang di setting pada konfigurasi Gradle

## Modul 4: Mencatat Log pada aplikasi Android

Dalam modul ini saya belajar untuk mencatat log pada android atau belajar untuk menampilkan emulator android pada android studio

## Modul 5: Membuat Interactive UI dengan View

dalam modul ini saya jadi mengetahui cara membuat proyek baru dalam contoh pada modul di proyek ini di beri nama "Hello Toast".

