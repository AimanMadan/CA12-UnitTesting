package com.example.unittesting

import org.junit.Assert.*
import org.junit.Test

class MyClassTest {
  private val myClass = MyClass()
  @Test
  fun computesFactorial() {
    val n = 4
    val result = myClass.factorial(n)
    assertEquals(24,result)
  }

 @Test
 fun computesFactorialWrong() {
   val n = 4
   val result = myClass.factorial(n)
  assertEquals(20,result)
 }

 }