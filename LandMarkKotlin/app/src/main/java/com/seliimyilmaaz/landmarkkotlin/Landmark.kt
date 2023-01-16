package com.seliimyilmaaz.landmarkkotlin

class Landmark {

    var name : String? = null
    var definitionOfLandmark : String? = null
    var imageNumber : Int = 0

    constructor(name: String?, definitionOfLandmark: String?, imageNumber: Int) {
        this.name = name
        this.definitionOfLandmark = definitionOfLandmark
        this.imageNumber = imageNumber
    }

}