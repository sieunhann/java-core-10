package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BalanceAlert {
    private int id;
    private LocalDate date;
    private String description;
    private String balance;
    private long amount;

    @Override
    public String toString() {
        return id + " - " + date +
                " - " + description +
                " - " + balance +
                " - " + amount ;
    }
}
