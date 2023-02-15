package com.example.myapplication;

public class Algorithm {

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод определения счастливый билет или нет
    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        int s1 = 0, s2 = 0, number = 0; // создание буферных переменных

        for(int i = 0; i < 6; i++) { // цикл разделения числа
            number = inputInt % 10;
            if (number %2 == 0){ // Условие подсчета четных
                s1 = s1 + number;
            } else {  // Условие подсчета нечетных
                s2 = s2 + number;
            }
            inputInt = inputInt / 10;
        }

        // проверка равенства
        return  (s1 == s2);
    }

    // метод определения следующего счастливого билета (чуть менее быстрый)
    public int nextHappyTicketV1(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        if(!isHappyTicket(Integer.toString(inputInt))) { // если билет не счастливый
            while (!isHappyTicket(Integer.toString(inputInt))) { // то выполняется цикл
                inputInt = inputInt + 1; // шаговой проверки следующих билетов до наступления счастливого билета
            }
            return inputInt; // возвращается найденный счастливый билет
        } else { // иначе (в случае изначально счастливого билета)
            return inputInt; // возвращается счастливый билет
        }
    }



}
