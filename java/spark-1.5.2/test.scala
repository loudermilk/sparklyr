package sparklyr

object Test {
  def nullary() = 0

  def unaryPrimitiveInt(i : Int) = i * i
  def unaryInteger(i : Integer) = i * i
  def unaryNullableInteger(i : Integer) = Option(i) match {
    case None => -1
    case Some(j) => j * j
  }

  def unarySeq(xs : Seq[Double]) = xs.map(x => x * x).sum
  def unaryNullableSeq(xs : Seq[Double]) = Option(xs) match {
    case None => -1
    case Some(ys) => ys.map(y => y * y).sum
  }

  def infer(x: Double) = "Double"
  def infer(s: String) = "String"
  def infer(xs: Seq[Double]) = "Seq"

  def roundtrip(data: Array[_]): Array[_] = data

  def unaryArrayToClass(array: Array[_]): String = array.getClass.getName
}
