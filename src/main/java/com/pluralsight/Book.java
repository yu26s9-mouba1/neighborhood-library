package com.pluralsight;

public class Book {

    //Creating the book properties
    private int bookID;
    private String bookIsbn;
    private String bookTitle;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Constructors
    public Book(int bookID, String bookIsbn, String bookTitle, boolean isCheckedOut, String checkedOutTo) {
        this.bookID = bookID;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }


    // setters and getters to read and update data
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
        return bookTitle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTitle = bookTittle;
    }

    public boolean isCheckedOut() {

        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name){
        this.isCheckedOut = true; //The book is unavailable
        this.checkedOutTo = name;  //THe person who checked it out
    }

    public void checkIn(){
        this.isCheckedOut = false;  // The book is available
        this.checkedOutTo = "";     // Nothing will be displayed

    }
}









