package ru.leventel8.lessons;

public class SortedList {

    private Link first;                             //Переменная приватного типа, поле Link


    /**
     * Конструктор при инициализации
     * присвает ссылке first значение null
     */
    public SortedList(){

        first = null;

    }

    /**
     * метод возвращает true
     * @return true
     *  если список пуст
     */
    public boolean isEmpty(){


        return (first==null);                       // проверка на пустоту
    }


    /**
     * вставка в список
     * @param key
     */
    public void insert(long key){                  // реализация алгоритма вставки

        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while(current !=null && key>current.dData){

            previous = current;
            current = current.next;

        }
        if(previous==null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;

    }//end insert()

    /**
     * удаление из списка
     * @return temp
     */
    public Link remove(){

        Link temp = first;              // временная переменная temp
        first = first.next;
        return temp;

    }//end remove()

    /**
     * вывод содержимого Листа
     */
    public void displayList(){

        System.out.print("Список (первый--->последний)");
        Link current = first;
        while(current !=null){                          // пока не ноль,выводить


            current.displayLink();
            current = current.next;

        }
        System.out.println("");

    }//end displayList()
}//end class SortedList
