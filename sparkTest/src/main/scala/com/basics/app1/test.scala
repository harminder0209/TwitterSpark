package com.basics.app1


import org.apache.spark.{SparkConf, SparkContext}

import org.apache.spark.SparkContext._
 
object ScalaWordCount {
 def main(args: Array[String]) {

 
val sparkConf = new SparkConf().setAppName("Spark Word Count").setMaster("local[*]")
 
val sc = new SparkContext(sparkConf)

val lp= Array(1,2,3,4,5,6)

val p =sc.parallelize(lp)

println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy")

println("ddddddddddddd")
//println(p.collect())


 

 }
}
