package page;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by dznor on 15.02.2017.
 */
public class Record implements Serializable {
    private long id;
    private String name;
    private String telephoneNumber;
    private LocalDate createDate;

    public Record(long id, String name, String telephoneNumber, LocalDate createDate) {
        this.id = id;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
