object CurryingSample {
  def cubicVolume(x: Int)(y: Int)(z: Int): Int = x * y * z

  def curryplus(x:Int)(y:Int) : Int = x+y

  def curryminus(x:Int)(y:Int) : Int = x-y
}
