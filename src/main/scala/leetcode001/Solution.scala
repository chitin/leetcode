package leetcode001

import scala.util.control.Breaks

/**
  * Created by denglingang on 2017/6/29.
  */
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var i=0
    var j=0
    var result = new Array[Int](2)
    val loop = new Breaks
    loop.breakable {
      for (i <- 0 to nums.length-2) {
        for (j <- i+1 to nums.length-1) {
          if(nums(i) + nums(j) == target) {
            result = Array(i, j)
            loop.break()
          }
        }
      }
    }
    return result
  }

  def main(args: Array[String]): Unit = {
    var nums = Array[Int](2, 7, 11, 15)
    var result = twoSum(nums, 9)
    for(x <- result) {
      println(x)
    }


  }
}
