// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  x -= y
  y += x
  x = y - x
  println(x)
  println(y)
}