# Scala-Profile-Picture-Assignment


**!!! Problem Statement !!!**

We want to change our profile picture on Facediary. Now Facediary has
some restriction over the dimension of picture that we can upload.



Minimum dimension of the picture can be L x L, where L is the length of the side of square. Now we have photos of various dimensions. Dimension of a photo is denoted as W x H where W - width of the photo and H - height of the photo.


When any photo is uploaded following events may occur:

    If any of the width or height is less than L, user is prompted to upload another one. Print  in this case.
    If width and height, both are large enough and if the photo is already square then it is accepted. Print  in this case. Else user is prompted to crop it. Print  in this case.



Given L, N, W and H as input, print appropriate text as output.

Sample Input: L = 180, W = 640, H = 480
Sample Output: CROP IT


**!!! Solution !!!**

```

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
```

**!!! OUTPUT !!!**

![Screenshot from 2023-03-09 17-33-51](https://user-images.githubusercontent.com/125438911/224017848-128cb7ed-32cb-4220-a474-d581aec44d45.png)

