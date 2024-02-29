package opgave02.models;

import java.time.LocalDate;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        int fine = 0;
        int days = (int) (actualDate.toEpochDay() - calculatedDate.toEpochDay());

        if (days > 0 && days <= 7) {
            fine += 10;
        } else if (days <= 14) {
            fine += 30;
        } else if (days >= 15) {
            fine += 45;
        }

        if (adult) {
            return fine * 2;
        } else {
            return fine;
        }
    }

}
