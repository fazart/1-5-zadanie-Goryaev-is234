fun main() {
    // 1. Создание и вывод элементов
    val array1 = arrayOf(1, 2, 3, 4, 5)
    println("Array1: ${array1.joinToString()}")

    // 2. Сумма элементов массива
    val sum = array1.sum()
    println("Sum of elements: $sum")

    // 3. Максимальное и минимальное значение
    val array2 = arrayOf(10, 23, 5, 67, 34, 89, 12, 45, 78, 56)
    val max = array2.maxOrNull()
    val min = array2.minOrNull()
    println("Max: $max, Min: $min")

    // 4. Сортировка массива
    val sortedArray = array2.sortedArray()
    println("Sorted Array: ${sortedArray.joinToString()}")

    // 5. Уникальные элементы
    val uniqueElements = array2.distinct()
    println("Unique Elements: ${uniqueElements.joinToString()}")

    // 6. Четные и нечетные числа
    val evenNumbers = array2.filter { it % 2 == 0 }
    val oddNumbers = array2.filter { it % 2 != 0 }
    println("Even Numbers: ${evenNumbers.joinToString()}")
    println("Odd Numbers: ${oddNumbers.joinToString()}")

    // 7. Реверс массива
    val reversedArray = array2.reversedArray()
    println("Reversed Array: ${reversedArray.joinToString()}")

    // 8. Поиск элемента
    val elementToFind = 67
    val index = array2.indexOf(elementToFind)
    if (index != -1) {
        println("Element $elementToFind found at index $index")
    } else {
        println("Element $elementToFind not found")
    }

    // 9. Копирование массива
    val copiedArray = array2.copyOf()
    println("Copied Array: ${copiedArray.joinToString()}")

    //10. Сумма четных чисел
    val sumEvenNumbers = evenNumbers.sum()
    println("Sum of Even Numbers: $sumEvenNumbers")

    //11. Пересечение массивов
    val anotherArray = arrayOf(23, 34, 100)
    val intersection = array2.intersect(anotherArray.toSet())
    println("Intersection: ${intersection.joinToString()}")

    //12. Перестановка элементов
    fun swapElements(array: Array<Int>, index1: Int, index2: Int) {
        if (index1 in array.indices && index2 in array.indices) {
            val temp = array[index1]
            array[index1] = array[index2]
            array[index2] = temp
        }
    }
    swapElements(array2, 0, 9)
    println("Swapped Array: ${array2.joinToString()}")

    //13. Заполнение случайными числами
    val randomArray = Array(20) { (1..100).random() }
    println("Random Array: ${randomArray.joinToString()}")

    //14. Числа Прокопенко (делятся на три)
    val divisibleByThree = randomArray.filter { it % 3 == 0 }
    println("Divisible by Three: ${divisibleByThree.joinToString()}")

    //15. Проверка на палиндром
    fun isPalindrome(array: Array<Int>): Boolean {
        return array.contentEquals(array.reversedArray())
    }
    println("Is Palindrome? ${isPalindrome(arrayOf(1, 2, 3, 2, 1))}")

    //16. Конкатенация двух массивов
    val concatenatedArray = randomArray + anotherArray
    println("Concatenated Array: ${concatenatedArray.joinToString()}")

    //17. Сумма и произведение всех элементов массива
    fun sumAndProduct(array: Array<Int>): Pair<Int, Int> {
        return Pair(array.sum(), if (array.isNotEmpty()) array.reduce { acc, i -> acc * i } else null ?:0)
    }
    val (sumAllElements, productAllElements) = sumAndProduct(randomArray)
    println("Sum of all elements: $sumAllElements")
    println("Product of all elements: $productAllElements")

//18.Группировка чисел по пять элементов в группе
    val groupedArrays= randomArray.toList().chunked(5)
    groupedArrays.forEachIndexed{index,list->println ("Group $index:${list.joinToString ()}")}

    //19.Слияние двух отсортированных массивов
    fun mergeSortedArrays(arrA:Array<Int>,arrB:Array<Int>):List<Int>{
        return(arrA+arrB).sorted ()
    }
    val mergedSortedArrays=mergeSortedArrays(sortedArray,arrayOf(11 ,22 ,33))
    println ("Merged Sorted Arrays:${mergedSortedArrays .joinToString ()}")

    //20.Арифметическая прогрессия
    fun arithmeticProgression(start:Int,difference:Int,size:Int):List<Int>{return List(size){start+it*difference}
    }
    val arithmeticProgression=arithmeticProgression (3 ,5 ,10 )
    println ("Arithmetic Progression:${arithmeticProgression .joinToString ()}")

    //21 .Удаление элемента
    fun removeElement(array:Array<Int>,element:Int):List<Int>{
        return array.filter{it!=element}
    }
    val removedElement=removeElement(randomArray ,randomArray [0])
    println ("Removed Element:${removedElement .joinToString ()}")

    //22 .Поиск второго максимального элемента
    fun secondMax(array:Array <Int>):Int?{
        return if(array.size<2)null else{array.sortedDescending ()[1]}
    }
    val secondMaximum=secondMax(randomArray )
    println ("Second Maximum:$secondMaximum ")

    //23 .Объединение нескольких массивов
    fun mergeMultipleArrays(vararg arrays:Array <Int>):List <Int>{
        return arrays.flatMap{it.asList()}
    }
    val mergedMultipleArrays=mergeMultipleArrays(randomArray ,anotherArray )
    println ("Merged Multiple Arrays:${mergedMultipleArrays .joinToString ()}")

    //24 .Транспонирование матрицы
    fun transposeMatrix(matrix:Array<Array <Int>>):List<List <Int>>{
        return matrix[0].indices.map{i->matrix.map{row->row[i]}}
    }
    val matrix=arrayOf(
        arrayOf(1 ,2 ,3),
        arrayOf(4 ,5 ,6),
        arrayOf(7 ,8 ,9))
    val transposedMatrix=transposeMatrix(matrix )
    transposedMatrix.forEach{row->println(row.joinToString ())}

    //25 .Линейный поиск с возвратом Bool-значения
    fun linearSearch(array:Array <Int>,element:Int):Boolean{
        return element in array
    }
    println ("Linear Search for element '67':${linearSearch(randomArray ,67)} ")

    //26.Среднее арифметическое всех чисел в массиве
    fun average(array:Array <Int>):Double{
        return if(array.isNotEmpty())array.average()else Double.NaN
    }
    println ("Average of Random Array:${average(randomArray )} ")

    //27.Максимальная последовательность одинаковых элементов
    fun maxSequenceLength(array:Array <Int>):Pair <Int?,Int>{
        var maxCount=0;var currentCount=0;var currentValue:Int?=null;var maxValue:Int?=null;
        for(i in array.indices){
            if(currentValue==array[i]){
                currentCount++
            }else{
                currentValue=array[i];currentCount=1;
            }
            if(currentCount>maxCount){
                maxCount=currentCount;maxValue=currentValue;
            }}
        return Pair(maxValue,maxCount)
    }
    val(maxSeqValue,maxSeqLength)=maxSequenceLength(randomArray )
    println ("Max Sequence Value:$maxSeqValue with Length:$maxSeqLength ")

//28.Ввод и вывод массива от пользователя
    print ("Enter numbers separated by space:")
    val userInput=readLine()?:""
    val userInputArr=userInput.split(' ').mapNotNull{it.toIntOrNull()}.toTypedArray ()
    println ("User Input Array:${userInputArr .joinToString ()}")

    //29.Нахождение медианы в массиве
    fun findMedian(array:Array <Int>):Double{
        val sorted=array.sorted ()
        return if(sorted.size%2==0)(sorted[sorted.size/2-1]+sorted[sorted.size/2])/2.toDouble()else sorted[sorted.size/2].toDouble ()
    }
    println ("Median of Random Array:${findMedian(randomArray )} ")

//30 .Распределение по группам из ста целых чисел на десять групп по десять элементов в каждой группе
    val largeRandomArr=(1..100).map{(1..100).random ()}.toTypedArray ()
    val groupedLargeRandomArr=largeRandomArr.toList ().chunked (10 )
    groupedLargeRandomArr.forEachIndexed {index,list->println ("Group$index :${list.joinToString ()}")}

}