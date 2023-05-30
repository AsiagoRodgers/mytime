
fun main(){

//    grade students

    var hours = 45

    if (hours >=0 && hours <=5){
        println(" GoodNight")
    }else if (hours >=5 && hours <=11){
        println("Good Morning")
    }else if(hours>=11 && hours <=13){
        println("Noon")
    }
    else if (hours >=13 && hours <=17){
        println("Good Afternoon")
    }else if (hours >=17 && hours<=24){
        println(" Good Evening")
    }else{
        print("unrecognised time")
    }
}