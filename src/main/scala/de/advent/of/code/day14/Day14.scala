package de.advent.of.code.day14

import de.advent.of.code.utils.{FileReader, StopWatch}

object Day14 {

  def main(args: Array[String]): Unit = {
    val input = FileReader.asStrings("day14/puzzle.txt")

    puzzleOne(input)
  }

  private def puzzleOne(input: Vector[String]): Unit = {
    val result = StopWatch.measure(() => DockingComputer.initializeProgramMemory(input))
    println(s"Result = '${result.result}' - took ${result.executionTime} ms")
  }
}
