package sbtry.greeting;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 13.11.2014
 */
public class Greeting {

  private final long id;
  private final String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
