package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        books.add(new Book("Andrzej Sapkowski", "Sezon burz", 2014, "014"));
        books.add(new Book("Petter V Brett", "Malowany czlowiek", 2004, "004"));
        books.add(new Book("Mario Puzo", "Ojciec chrzestny", 1969, "69"));

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2004, median);
    }
}
