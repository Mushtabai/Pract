package ru.mirea.it.ivbo01.n2;

public class Person {
    String firstname = "", secondname = "", patronymic = "";

    public Person(String firstname, String secondname, String patronymic) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.patronymic = patronymic;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        String name = secondname + " ";
        if (firstname != null){
            name += firstname.charAt(0) + ". ";;
        }
        if (patronymic != null){
            name += patronymic.charAt(0) + ". ";;
        }
        return name;
    }
}