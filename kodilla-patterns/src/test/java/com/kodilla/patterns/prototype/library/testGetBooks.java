package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class testGetBooks {
    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        Library library = new Library("abc");
        library.getBooks().add(new Book("Wiedzmin", "Sapkowski", LocalDate.of(1987,10,10)));
        library.getBooks().add(new Book("Malowany czlowiek", "Petter V Btett", LocalDate.of(2008,10,10)));
        library.getBooks().add(new Book("Sherlock Holmes", "Arthur Conan Doyle", LocalDate.of(1887,10,10)));

        Library copiedLibrary = library.shallowCopy();

        library.getBooks().remove(new Book("Sherlock Holmes", "Arthur Conan Doyle", LocalDate.of(1887,10,10)));

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, copiedLibrary.getBooks().size());
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException {
        Library library = new Library("abc");
        library.getBooks().add(new Book("Wiedzmin", "Sapkowski", LocalDate.of(1987,10,10)));
        library.getBooks().add(new Book("Malowany czlowiek", "Petter V Btett", LocalDate.of(2008,10,10)));
        library.getBooks().add(new Book("Sherlock Holmes", "Arthur Conan Doyle", LocalDate.of(1887,10,10)));

        Library copiedLibrary = library.deepCopy();

        library.getBooks().remove(new Book("Sherlock Holmes", "Arthur Conan Doyle", LocalDate.of(1887,10,10)));

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(3, copiedLibrary.getBooks().size());
    }
}
