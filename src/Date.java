public class Date {
    private int day;
    private int month;
    private int year;


    public String getDay() {
        if (day > 0 && day < 10) {
            return "0" + day;

        } else if (day >= 10 && day < 32) {
            return day + "";

        } else {
            return "/error/";
        }
    }

    public void setDay(int day) {
        this.day = day;
    }


    public String getMonth() {
        if (month > 0 && month < 10) {
            return "0" + month;

        } else if (month >= 10 && month < 13) {
            return "" + month;

        } else {
            return "/error/";

        }
    }



        public void setMonth(int month){
            this.month = month;
        }


        public String getYear() {
            if (year < 0) {
                return "Koison rodnoy bizdin zamanga chein zhashagansynby?";
            } else if (year > 2022) {
                return "/error/";
            } else {
                return year + "";
            }
        }


            public void setYear(int year){
                this.year = year;
            }
        }

