package com.example.Algoritms.arraylist;

import com.example.Algoritms.exceptions.InvalidIndexException;
import com.example.Algoritms.exceptions.NullItemException;
import com.example.Algoritms.exceptions.StorageIsFullException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList list = new MyArrayList();

    String[] mas = new String[]{"A", "B", "C", "D", "E"};


    @BeforeEach
    void setUp() {
        for (String s : mas) {
            list.add(s);
        }
    }

    @AfterEach
    void tearDown() {
        list.clear();
//        service.getAll().forEach(question -> service.remove(question.getQuestion(), question.getAnswer()));
    }

    @Test
    public void addElementTest() {
        String expected = "F";
        String actual = list.add("F");
        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isEqualTo(list.get(5));
        assertThat(actual).isIn(list.toArray());
    }

    @Test
    void addElementIndexAndItemTest() {
        String expectedItem = "F";
        String actualItem = list.add(list.size(), "F");
        assertThat(actualItem).isEqualTo(expectedItem);
        String expected = "WWWW";
        String actual = list.add(2, "WWWW");
        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isEqualTo(list.get(2));
        assertThat(actual).isIn(list.toArray());
    }

    @Test
    void addValidateSizeException() {
        assertThatExceptionOfType(StorageIsFullException.class)
                .isThrownBy(() -> {
                    list.add("YYYY");
                    list.add("XXXX");
                    list.add("QQQQ");
                });
    }

    @Test
    void addValidateNullItemException() {
        assertThatExceptionOfType(NullItemException.class)
                .isThrownBy(() -> {
                    list.add(null);
                });
    }

    @Test
    void addValidatevalidateIndexException() {
        assertThatExceptionOfType(InvalidIndexException.class)
                .isThrownBy(() -> list.add(6, "BBBB"));
    }


    @Test
    void setElementTest() {
        assertThat(list.set(2, "NNNN")).isEqualTo("NNNN");
    }

    @Test
    void removeElementTest() {
        assertThat(list.remove(1)).isEqualTo("B");
        assertThat(list.remove(2)).isNotIn("C");
    }

    @Test
    void contains() {
        assertThat(list.contains("A")).isTrue();
    }

    @Test
    void indexOfElementTest() {
        assertThat(list.indexOf("C")).isEqualTo(2);
    }

    @Test
    void lastIndexOfElementTest() {
        assertThat(list.lastIndexOf("B")).isEqualTo(1);
    }

    @Test
    void get() {
        assertThat(list.get(0)).isEqualTo("A");
    }

    @Test
    void testEquals() {
        assertThat(list.equals(list)).isTrue();
    }


    @Test
    void sizeDataTest() {
        assertThat(list.size()).isEqualTo(5);
    }

    @Test
    void isEmptyTest() {
        assertThat(list.isEmpty()).isFalse();
    }

    @Test
    void clearTest() {
        list.clear();
        assertThat(list.isEmpty()).isTrue();
    }

    @Test
    void toArrayTest() {
        assertThat(list.toArray()).isEqualTo(mas);
    }
}