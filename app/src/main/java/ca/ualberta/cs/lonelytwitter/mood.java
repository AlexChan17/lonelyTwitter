package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class mood {

    String currentMood;

    Date date;

    public void setDate(Date moodDate) {

        date = moodDate;
    }

    public Date getDate() {

        return date;
    }
}
