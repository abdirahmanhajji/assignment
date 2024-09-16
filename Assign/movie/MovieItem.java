package movie;
class movieItem {
    // Private fields
    private String title;
    private String author;
    protected movieItem(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
