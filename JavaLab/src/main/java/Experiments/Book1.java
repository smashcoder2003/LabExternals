package Experiments;

public class Book1 {
        private static String Name;
        private static String ISBN;
        private static String Author;
        private static String Publisher;

        public Book1(String name, String isbn, String author, String publisher) {
            Name = name;
            ISBN = isbn;
            Author = author;
            Publisher = publisher;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getName() {
            return this.Name;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public String getISBN() {
            return this.ISBN;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }

        public String getAuthor() {
            return this.Author;
        }

        public void setPublisher(String Publisher) {
            this.Publisher = Publisher;
        }

        public String getPublisher() {
            return this.Publisher;
        }

        public static String getBookInfo()// Method used to display details
        {
            return "Name :" + Name + " " + "Isbn: " + ISBN + " " + "Author: " + Author + " " + "Publisher: "
                    + Publisher;
        }
    }

