class Raindrops {

    def convert(num) {

        if (num % 3 == 0) {
            "Pling"
        } else if (num % 5 == 0) {
            "Plang"
        } else if (num % 7 == 0) {
            "Plong"    
        } else {
            num.toString();
        }
    }

}
