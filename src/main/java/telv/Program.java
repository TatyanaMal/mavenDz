package telv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class Program {
    private String nameProgram;

    /*public Program(String nameProgram) {
        this.nameProgram = nameProgram;
    }*/

    public String getNameProgram() {
        return nameProgram;
    }

}
