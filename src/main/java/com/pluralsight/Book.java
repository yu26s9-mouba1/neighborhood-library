package com.pluralsight;

public class Book {

    //Creating the book properties
    private int bookID;
    private String bookIsbn;
    private String bookTittle;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Constructors
    public Book(int bookID, String bookIsbn, String bookTittle, boolean isCheckedOut, String checkedOutTo) {
        this.bookID = bookID;
        this.bookIsbn = bookIsbn;
        this.bookTittle = bookTittle;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }


    //Created setters and getters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

//    public void setCheckedOut(boolean checkedOut) {
//        isCheckedOut = checkedOut;
//    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

//    public void setCheckedOutTo(String checkedOutTo) {
//        this.checkedOutTo = checkedOutTo;
//    }

    public void checkOut(String name){
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    public void checkIn(){
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }
}









