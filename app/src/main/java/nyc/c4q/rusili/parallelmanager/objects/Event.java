package nyc.c4q.rusili.parallelmanager.objects;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class Event {
    public class Basics {
        String name = null;
        String venue = null;
        String host = null;
        String eventID = null;

        public void setName (String name) {
            this.name = name;
        }

        public void setVenue (String venue) {
            this.venue = venue;
        }

        public void setHost (String host) {
            this.host = host;
        }

        public void setEventID (String eventID) {
            this.eventID = eventID;
        }
    }

    public class Date {
        Date startDate = null;
        Date startTime = null;

        public void setStartDate (Date startDate) {
            this.startDate = startDate;
        }

        public void setStartTime (Date startTime) {
            this.startTime = startTime;
        }
    }

    public class Location {
        String address = null;
        String city = null;
        int zipcode = 0;
        int radius = 0;

        public void setAddress (String address) {
            this.address = address;
        }

        public void setCity (String city) {
            this.city = city;
        }

        public void setZipcode (int zipcode) {
            this.zipcode = zipcode;
        }

        public void setRadius (int radius) {
            this.radius = radius;
        }
    }

    public class Modules{
        boolean PROFILES = false;
        boolean QUESTIONS = false;
        boolean ATTENDEES = false;
        boolean MAINCHATROOM = false;
        boolean MULTIPLECHATROOMS = false;
        boolean DIRECTMESSAGES = false;
        boolean FLOORPLAN = false;
        boolean PINPOINT = false;

        public void setPROFILES (boolean PROFILES) {
            this.PROFILES = PROFILES;
        }

        public void setQUESTIONS (boolean QUESTIONS) {
            this.QUESTIONS = QUESTIONS;
        }

        public void setATTENDEES (boolean ATTENDEES) {
            this.ATTENDEES = ATTENDEES;
        }

        public void setMAINCHATROOM (boolean MAINCHATROOM) {
            this.MAINCHATROOM = MAINCHATROOM;
        }

        public void setMULTIPLECHATROOMS (boolean MULTIPLECHATROOMS) {
            this.MULTIPLECHATROOMS = MULTIPLECHATROOMS;
        }

        public void setDIRECTMESSAGES (boolean DIRECTMESSAGES) {
            this.DIRECTMESSAGES = DIRECTMESSAGES;
        }

        public void setFLOORPLAN (boolean FLOORPLAN) {
            this.FLOORPLAN = FLOORPLAN;
        }

        public void setPINPOINT (boolean PINPOINT) {
            this.PINPOINT = PINPOINT;
        }

        Uri floorPlan = null;
        List<Questions> listofQuestions = new ArrayList <>();
        List<String> listofChatrooms = new ArrayList <>();

        public void setFloorPlan (Uri floorPlan) {
            this.floorPlan = floorPlan;
        }

        public void setListofQuestions (List <Questions> listofQuestions) {
            this.listofQuestions = listofQuestions;
        }

        public void setListofChatrooms (List <String> listofChatrooms) {
            this.listofChatrooms = listofChatrooms;
        }
    }

}
