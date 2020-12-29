fun main() {
    val inputArray = arrayOf(
            arrayOf('P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'I', 'N', 'G'),
            arrayOf('I', 'S'),
            arrayOf('M', 'A', 'G', 'I', 'C')
    )

    val matrix = arrayOf(inputArray.last(), inputArray.first())

    println(matrix.contentDeepToString()) // [[3, 7, 9], [0, 1, 0], [2, 4, 8]]
}