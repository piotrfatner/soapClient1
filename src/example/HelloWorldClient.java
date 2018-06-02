package example;

import com.LibraryPortService;
import com.LibraryRequest;
import com.LibraryResponse;

public class HelloWorldClient {
  public static void main(String[] argv) {
      LibraryPortService service = new LibraryPortService();
      //invoke business method
      LibraryRequest libraryRequest = new LibraryRequest();
      libraryRequest.setName("Wiedzmin");
      com.LibraryPort portService = new LibraryPortService().getLibraryPortSoap11();
      LibraryResponse libraryResponse = portService.library(libraryRequest);
      System.out.println(libraryResponse.getBook().getAuthor());
  }
}
