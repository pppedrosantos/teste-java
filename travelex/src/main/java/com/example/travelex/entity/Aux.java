package com.example.travelex.entity;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

public abstract class Aux {
    @NotBlank
    private String name;

    public Aux(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou Nome não pode ser vazio.");
        }
        this.name = name.trim();
    }

    public String getFirstName() {
        return this.name.split(" ")[0];
    }

    public String getLastName() {
        ArrayList<String> fullName = new ArrayList(List.of(this.name.split(" ")));
        return String.join(" ", fullName.subList(1 ,fullName.size()));
    }

    public String getAbreviateName() {
        String[] names = this.name.split(" ");
        char letter = names[1].charAt(0);
        String response = "";

        if (Character.isLowerCase(letter)) {
            char letterUpperCase = names[2].charAt(0);
            response = String.format("%s %s %c.", names[0], names[1], letterUpperCase);;
        }
        else {
            ArrayList<String> fullName = new ArrayList(List.of(this.name.split(" ")));

            return String.format("%s %c.", names[0], letter)
                    + " "
                    + String.join(" ",fullName.subList(2, fullName.size()));
        }
        return response;
    }

    public String separationNames() {
        ArrayList<String> fullName = new ArrayList(List.of(this.name.split(" ")));

        return " " + String.join(" ", fullName.subList(2 ,fullName.size()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou Nome não pode ser vazio.");
        }
        this.name = name.trim();
    }


}
