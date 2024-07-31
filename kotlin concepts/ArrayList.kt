fun main() {
    var arr = arrayListOf<String>()
    arr.add("kanjariya")
    arr.add("rahul")
    arr.add("mca")
    arr.add(3,"jamnagar")
    println(arr)

    println(arr.contains("rahul"))
    arr.remove("mca")
    println(arr)
    println(arr.contains("mca"))
    arr.set(2,"New value")
    println(arr)




}