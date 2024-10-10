package ait.reader.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
@EqualsAndHashCode(of = "id")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ReaderDto {
    private int id;
    @Setter
    private String name;
    private int birthYear;
    @Singular
    private Set<String> lovedBooks;

   // @JsonIgnore
    public String getMostLovedBook() {
        return lovedBooks.stream().findFirst().orElse("Call a back");
    }
}
