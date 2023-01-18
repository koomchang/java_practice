package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList = Arrays.asList(new Customer[]{new Customer("챈들러", 50), new Customer("레이첼", 42), new Customer("모니카", 20), new Customer("벤자민", 18), new Customer("제임스", 5)});
        customerList.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);
    }
}

class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
