package jp.techacademy.norio.masuda.kotlinlog2nd

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int


    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }


    abstract fun say()
}