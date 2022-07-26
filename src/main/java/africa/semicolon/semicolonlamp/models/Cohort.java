package africa.semicolon.semicolonlamp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cohort {
    private CohortStatus status = CohortStatus.PENDING;
    @Id
    private String id;
    private String name;
    private LocalDate localDate;
}
