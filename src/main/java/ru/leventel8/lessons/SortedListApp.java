package ru.leventel8.lessons;

class SortedListApp {

    public static void main(String[] args){

        SortedList theSortedList = new SortedList(); //создание объекта SortedList
        theSortedList.insert(20);                // вставка в список
        theSortedList.insert(40);

        theSortedList.displayList();                // вывод содержимого списка

        theSortedList.insert(10);               // вставка в список
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.displayList();                // вывод содержимого списка

        theSortedList.remove();                     // удаление из списка
        theSortedList.displayList();                // вывод содержимого списка

    }//end main()

}//end class SortedListApp
