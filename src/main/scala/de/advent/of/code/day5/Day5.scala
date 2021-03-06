package de.advent.of.code.day5

import de.advent.of.code.utils.{FileReader, StopWatch}

object Day5 {

  def main(args: Array[String]): Unit = {
    val input = FileReader.asStrings("day5/puzzle.txt")

    /*
      For time measurements, it makes no sense to run the puzzles/tasks "in a sequence". I'm not sure why but every following
      task is faster (perhaps the GarbageCollector doesn't cleanup everything and something is reused... but honestly
      I don't know). So if time should be measured, comment out the other task
    */

    puzzleOne(input)
    puzzleTwo(input)
  }

  private def puzzleOne(input: Vector[String]): Unit = {
    val result = StopWatch.measure(() => BoardingPass
      .getAll(input)
      .map(boardingPass => Seat.getSeatId(boardingPass))
      .max)
    println(s"Result = '${result.result}' - took ${result.executionTime} ms")
  }

  private def puzzleTwo(input: Vector[String]): Unit = {
    val result = StopWatch.measure(() => FindMissingSeatId.find(input))
    println(s"Result = '${result.result}' - took ${result.executionTime} ms")
  }
}
