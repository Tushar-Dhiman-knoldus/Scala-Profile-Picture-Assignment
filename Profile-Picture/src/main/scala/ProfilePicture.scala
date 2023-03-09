
class CheckDimensions {

  private var length = 0
  private var width = 0
  private var height = 0

  def inputDimensions(): Unit = {

    println("Enter the Length")
    this.length = scala.io.StdIn.readInt()

    println("Enter the Height")
    this.height = scala.io.StdIn.readInt()

    println("Enter the Width")
    this.width = scala.io.StdIn.readInt()
  }

  def verifyDimensions(): String = {

    if (height == length && width == length) {
      "Accepted"
    }
    else {
      if (height > length && width > length) {
        if (height == width) {
          "Accepted!"
        }
        else {
          "Crop It!"
        }
      }
      else {
        "Upload Another One"
      }
    }
  }
}

object ProfilePicture extends App {

  private val checkDimensions_object = new CheckDimensions()

  try {
    checkDimensions_object.inputDimensions()
    println(checkDimensions_object.verifyDimensions())
  }
  catch {
    case exception: Exception => {
      println(exception.getMessage)
    }
  }
}
