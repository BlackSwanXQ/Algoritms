package com.example.Algoritms;
import com.example.Algoritms.arraylist.MyArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AlgoritmsApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(AlgoritmsApplication.class, args);
//	}

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList(8);
		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("C");
		myArrayList.add("D");
		myArrayList.add("E");
//        myArrayList.add("F");
//        myArrayList.add("G");

		myArrayList.set(1, "QQQ");
		myArrayList.add(3, "WW");
		myArrayList.add(5, "XX");
		myArrayList.remove("E");
		myArrayList.remove(1);

		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		}

		System.out.println(myArrayList.size());



	}
	}




