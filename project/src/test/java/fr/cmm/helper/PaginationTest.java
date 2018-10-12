package fr.cmm.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaginationTest {

    @Test
    public void multiple () {
        Pagination pagination = new Pagination();
        pagination.setCount(100);
        pagination.setPageSize(50);
        assertEquals(2, pagination.getPageCount());
    }

    @Test
    public void nonmultiple () {
        Pagination pagination = new Pagination();
        pagination.setCount(120);
        pagination.setPageSize(50);
        assertEquals(3, pagination.getPageCount());
    }

    @Test
    public void countnul () {
        Pagination pagination = new Pagination();
        pagination.setCount(0);
        pagination.setPageSize(10);
        assertEquals(1, pagination.getPageCount());
    }
}