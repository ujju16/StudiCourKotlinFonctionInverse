fun inverse(x: String): String {
  var inv = ""
  var compteur = x.length
  while (compteur > 0) {
    inv += x[compteur - 1]
    compteur -= 1
  }
  return inv
}

fun main() {
  println(inverse("Julien Perrin"))

  val liste = listOf("Carine Laroque", "Isabelle Meugnier", "Mia Meugnier")

  for (i in liste) {
    println(inverse(i))
  }
}