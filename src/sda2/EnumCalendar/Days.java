package sda2.EnumCalendar;

/**
 * Created by Daniel on 2017-08-24.
 */
public enum Days {

    MON("pon"){
        public Days next(){
            return TUE;
        }
    }, TUE("wtorek"){
        public Days next(){
            return WED;
        }
    }, WED("środa"){
        public Days next(){
            return MON;
        }
    }
//    MON("Poniedziałek") {
//        public Days next() {
//            return TUE;
//        }
//    }, TUE("Wtorek") {
//        public Days next() {
//            return WED;
//        }
//    }, WED("Środa") {
//        public Days next() {
//            return WED;
//        }

    ;
//    THU("Czwartek"),
//    FRI("Piątek"),
//    SAT("Sobota"),
//    SUN("Niedziela");

    private final String days;

    Days(String days) {
        this.days = days;
    }

    String getDays() {
        return days;
    }

    public abstract Days next();


}

