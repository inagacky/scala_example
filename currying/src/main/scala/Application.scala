object Application {
  def main(args: Array[String]): Unit = {

    val cubicVolume_X = CurryingSample.cubicVolume(2)_

    println(cubicVolume_X)
    val cubicVolume_XY = cubicVolume_X(3)
    println(cubicVolume_XY)
    val cubicVolumeResult = cubicVolume_XY(4)
    println(cubicVolumeResult)

   val plus1 = CurryingSample.curryplus(10)_
   println(plus1(10))

    val plus2 = CurryingSample.curryminus(10)_
    println(plus2(10))
  }
}
