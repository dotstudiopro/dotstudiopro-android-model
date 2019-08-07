package com.dotstudioz.dotstudioPRO.models.dto;

import java.io.Serializable;

/**
 * Created by mohsin on 11-08-2017.
 */

public class MidRollDTO implements Serializable {

    private int midRollTime;
    private int noOfMidRollsToPlay;

    public int getMidRollTime() {
        return midRollTime;
    }

    public void setMidRollTime(int midRollTime) {
        this.midRollTime = midRollTime;
    }

    public int getNoOfMidRollsToPlay() {
        return noOfMidRollsToPlay;
    }

    public void setNoOfMidRollsToPlay(int noOfMidRollsToPlay) {
        this.noOfMidRollsToPlay = noOfMidRollsToPlay;
    }
}
