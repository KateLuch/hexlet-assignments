package exercise;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

class App {
    // BEGIN

//    TASK 1 -----------------------------------

    public static String buildList(String[] array) {
        StringBuilder resultingList = new StringBuilder();
        if (array.length == 0) {
            return resultingList.toString();
        }
        resultingList.append("<ul>\n");
        for (String arrayValue : array) {
            resultingList.append("  <li>" + arrayValue + "</li>" + "\n");
        }
        resultingList.append("</ul>");
        return resultingList.toString();
    }

//  public static void main(String[] args) {
//        String[] array = {"dogs", "cats", "birds"};
//        System.out.println(buildList(array));

//    TASK 2 --------------------------------------

    public static String getUsersByYear(String[][] arrayUsers, int year) {
        StringBuilder resultingUsersList = new StringBuilder();

        resultingUsersList.append("<ul>\n");
        for (String[] arrayValue : arrayUsers) {
            if (LocalDate.parse(arrayValue[1]).getYear() == year) {
                resultingUsersList.append("  <li>" + arrayValue[0] + "</li>" + "\n");
            }
        }
        resultingUsersList.append("</ul>");
        if (resultingUsersList.toString().equals("<ul>\n</ul>")) {
            return "";
        }
        return resultingUsersList.toString();
    }


//        TASK 2 - ALTERNATIVE SOLUTION -------------------------------

//        public static String getUsersByYear (String[][]arrayUsers,int year){
//            StringBuilder resultingUsersList = new StringBuilder();
//            resultingUsersList.append("<ul>\n");
//            for (String[] arrayValue : arrayUsers) {
//                if (Integer.valueOf(arrayValue[1].split("-")[0]) == year) {
//                    resultingUsersList.append("  <li>" + arrayValue[0] + "</li>" + "\n");
//                }
//            }
//            resultingUsersList.append("</ul>");
//            return resultingUsersList.toString();
//        }


//    public static void main(String[] args) {
//        String[][] arrayUsers = {
//                {"Andrey Petrov", "1990-11-23"},
//                {"Aleksey Ivanov", "1995-02-15"},
//                {"John Smith", "1990-03-11"},
//        };
//        int year = 1990;
//        System.out.println(getUsersByYear(arrayUsers, year));

// END


    public static String getYoungestUser(String[][] users, String date) throws Exception {
        // BEGIN
        Date date1 = new SimpleDateFormat("dd MMM yyyy").parse(date);
        String youngestUser = " ";
        Date youngestUserDate = null;

        for (String[] arrayValue : users) {
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(arrayValue[1]);
            if (date2.before(date1)) {
                if (youngestUser.equals(" ")) {
                    youngestUser = arrayValue[0];
                    youngestUserDate = date2;
                }
            } else {
                if (youngestUserDate.before(date2)) {
                    youngestUserDate = date2;
                    youngestUser = arrayValue[0];
                }
            }
        }
        return youngestUser;
    }

//    public static void main(String[] args) throws Exception{
//        String[][] usersl = {
//                {"Andrey Petrov", "1990-11-23"},
//                {"Aleksey Ivanov", "2000-02-15"},
//                {"Anna Sidorova", "1996-09-09"},
//        };
//        String datel = "14 Sep 1992";
//        System.out.println(getYoungestUser(usersl, datel));
//    }
    // END
}

