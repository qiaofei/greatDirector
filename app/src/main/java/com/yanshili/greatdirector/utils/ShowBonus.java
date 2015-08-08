package com.yanshili.greatdirector.utils;

/**
 * Created by LaoZhuang on 2015/8/7.
 */
public class ShowBonus {
    private String bonusCatrgory;
    private String directorName;
    private int moviesCount;

    public ShowBonus(String bonusCatrgory, String directorName, int moviesCount) {
        this.bonusCatrgory = bonusCatrgory;
        this.directorName = directorName;
        this.moviesCount = moviesCount;
    }

    public String getBonusCatrgory() {
        return bonusCatrgory;
    }

    public void setBonusCatrgory(String bonusCatrgory) {
        this.bonusCatrgory = bonusCatrgory;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getMoviesCount() {
        return moviesCount;
    }

    public void setMoviesCount(int moviesCount) {
        this.moviesCount = moviesCount;
    }
}
