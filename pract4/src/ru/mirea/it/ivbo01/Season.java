package ru.mirea.it.ivbo01;

public enum Season
{

    Весна( 15,"Весна"),
    Лето( 25,"Лето") {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    Осень(10,"Осень"),
    Зима( -5,"Зима");
    public final int Midtemp;
    public final String  name;
    private Season(int Midtemp, String name )
    {
        this.Midtemp = Midtemp;
        this.name = name;
    }
    public String getDescription() {
        return "Холодное время года";
    }



}
