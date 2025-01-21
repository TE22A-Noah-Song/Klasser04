public class Book {
        public String name;
        public int pages;
        public int currentPage=0;
        public void turnPage(){
            currentPage++;
            System.out.println("You turned a page, current page is:" + currentPage);
        }
        public Book(String name, int pages){
            this.name = name;
            this.pages = pages;
        }

    }
