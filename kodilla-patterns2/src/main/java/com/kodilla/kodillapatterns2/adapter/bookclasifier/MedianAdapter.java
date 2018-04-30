package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        int median = 0;
        for (com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            booksMap.put(new BookSignature(book.getSignature()), new com.kodilla.kodillapatterns2.adapter.bookclasifier.
                    libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
            median = medianPublicationYear(booksMap);
        }
        return median;
    }
}