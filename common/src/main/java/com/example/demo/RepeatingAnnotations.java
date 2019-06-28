package com.example.demo;

import java.lang.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


public class RepeatingAnnotations {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters{
        Filter[] value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @Repeatable(Filters.class )
    public @interface Filter{
        String value();
        String test();
    };

    @Filter( value = "filter1" ,test = "test1")
    @Filter(value = "filter2" ,test  ="test2")
    public interface Filterable{
    }

    public static void main(String[] args) {
        for (Filter filter:Filterable.class.getAnnotationsByType(Filter.class)){
            System.out.println( filter.value()+"::"+filter.test() );
        }
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("fullName is not null :"+fullName.isPresent());
        // orElse 表示如果fullname的值为控制，则他就是orelse赋予的值
        System.out.println("fullName is  :"+fullName.orElse("Hello"));
        System.out.println("fullName is  :"+fullName.map(s -> "Hey"+s+"!").orElse("Hey Stranger!"));

        List<String> list = Arrays.asList(
              "1","4","19"
        );
        //Stream
        final int sum = list.stream().mapToInt(s->Integer.parseInt(s)).sum();
        System.out.println("Sum: "+sum);

        //Clock
//        final Clock clock = Clock.systemUTC();
//        final LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        sort();

    }

    private static void sort(){
        long[] arrayOfLong = new long [ 20000 ];
        Arrays.parallelSetAll(
              arrayOfLong,
                index-> ThreadLocalRandom.current().nextInt(10000)
        );
        System.out.println("unSort");
        Arrays.stream(arrayOfLong).limit(5).forEach(
                i->System.out.print(i+",")
        );
        System.out.println();
        Arrays.parallelSort(arrayOfLong);
        System.out.println("Sort");
        Arrays.stream(arrayOfLong).limit(5).forEach(
                i->System.out.print(i+",")
        );
    }


}
