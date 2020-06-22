package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> setBook = new HashSet<>();
        setBook.add(new Book("author1", "title1", 2000, "1"));
        setBook.add(new Book("author2", "title2", 2001, "2"));
        setBook.add(new Book("author3", "title3", 2002, "3"));
        setBook.add(new Book("author4", "title4", 2003, "4"));
        setBook.add(new Book("author5", "title5", 2004, "5"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(setBook);
        //Then
        assertEquals(2002,median);
    }
}
