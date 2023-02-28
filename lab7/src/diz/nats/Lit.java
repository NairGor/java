package diz.nats;
public class Lit {
    // Идентификатор контакта
    private int sourceID;
    // Имя
    private String type;
    // Фамилия
    private String bookName;
    // Телефон
    private int year;
    // pubName
    private String pubName;

    private String note;

    public Lit() {
    }

    public Lit(int sourceID, String type, String bookName, int year, String pubName) {
        this.sourceID = sourceID;
        this.type = type;
        this.bookName = bookName;
        this.year = year;
        this.pubName = pubName;

    }

    public int getSourceID() {
        return sourceID;
    }

    public void setSourceID(int sourceID) {
        this.sourceID = sourceID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String toString() {
        return "Литература - " + "ID: " + sourceID + ", Тип литературы: " + type + ", Название: " + bookName + ", Год издательства: " + year + ", Издатель: " + pubName;
    }
}