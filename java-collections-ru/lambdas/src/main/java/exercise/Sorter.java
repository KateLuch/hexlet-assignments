package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN

//class User {
//    String name;
//    String birthday;
//    String gender;
//
//    User(String name, String birthday, String gender) {
//        this.name = name;
//        this.birthday = birthday;
//    }
//    public String toString() {
//        return this.name + ", "+ this.birthday;
//    }
////}

class Sorter {
        public static List<String> takeOldestMans(List<Map<String, String>> users) {

                return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparingLong(user -> LocalDate.parse(user.get("birthday")).toEpochDay()))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
//
    }
//LocalDate.parse((users.get("birthday")).toEpochDay())
//    .sorted(Comparator.comparingLong(map2 -> LocalDate.parse(map2.get("birthday")).toEpochDay()))



    public static void main(String[] args) {
        List<Map<String, String>> users = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        System.out.println(takeOldestMans(users));
    }
}


// END
