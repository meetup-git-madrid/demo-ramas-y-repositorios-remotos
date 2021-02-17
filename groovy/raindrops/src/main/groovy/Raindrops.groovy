class Raindrops {

    def convert(num) {
        String out = ""
        if (num % 3 == 0) {
            out  += "Pling"
        }
        if (num % 5 == 0) {
            out += "Plang"
        }
        if (num % 7 == 0) {
           out += "Plong"    
        }
        
        out ? out : num.toString()
    }

}
