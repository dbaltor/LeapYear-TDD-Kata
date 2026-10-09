package codingdojo

class LeapYear {
    companion object {
        fun isLeap(year: Int): Boolean {
            if (year % 400 == 0) return true
            if (year % 100 == 0) return false
            return year % 4 == 0
        }
    }
}