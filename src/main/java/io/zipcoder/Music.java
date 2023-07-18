package io.zipcoder;

public class Music {
    private String[] playList;
    public Music(String[] playList) {
        this.playList = playList;
    }
    public Integer selection(Integer startIndex, String selection) {

        int i = startIndex;
        int j = startIndex;
        int counterUp = 0;
        int counterDown = 0;

        while (!playList[i].equals(selection)) {
            if (i == playList.length - 1) {
                i = 0;}
            else {i++;}

            counterUp++;
        }
        while (!playList[j].equals(selection)) {
            if (j == 0) {
                j = playList.length - 1;}
            else {j--;}

            counterDown++;
        }
        if (counterDown < counterUp) {

            return counterDown;
        }
        return counterUp;
    }
}