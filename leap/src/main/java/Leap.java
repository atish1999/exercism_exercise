class Leap {

    boolean isLeapYear(int year) {
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");

        if (year % 4 == 0) {
            return year % 400 == 0 ? true : year % 100 == 0  ? false : true;
        } else {
            return false;
        }
    }

}
