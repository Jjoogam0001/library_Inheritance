package Model;



  public class TeenageBook extends Book{
      private String Title;

      public static TeenageBook [] teenageBooks = new TeenageBook[4];

      static {
          teenageBooks [0] = new TeenageBook("Martin","Comic","1994","Hell and Back");
          teenageBooks [1] = new TeenageBook("Lenon","Romance","2018","Glory Days");
          teenageBooks [2] = new TeenageBook("Richard","Thriller","2010","Beyond the sea");
          teenageBooks [3] = new TeenageBook("Benny","Comic","200","Amen");
      }


      public TeenageBook(String author, String category, String year , String title) {
          super(author, category, year);
          Title = title;
      }

      public TeenageBook(){

      }


      public String getTitle() {
          return Title;
      }

      public TeenageBook [] getTeenBooks(){
      return teenageBooks;

    }

       public String searchTeenageBook(String title){
        if (title == this.getTitle()){
            return this.getYear() + this.getAuthor() ;
        }
        return "Books doesnt Exist";


    }


  }
