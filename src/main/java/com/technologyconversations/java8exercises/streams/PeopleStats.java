package com.technologyconversations.java8exercises.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStats {

    private PeopleStats() {
    }

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int min = people.get(0).getAge();
        int max = 0;
        for (Person person : people) {
            int age = person.getAge();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }
    
    /*
    Get people statistics: average age, count, maximum age, minimum age and sum of all ages.
    */
    public static IntSummaryStatistics getStats(List<Person> people) {
    	return people.stream()
   		     .mapToInt(Person::getAge)
   		     .summaryStatistics();
}

}
