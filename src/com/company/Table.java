package com.company;



public class Table {

    private int n=7;
    private Offitem[] itemSets = new Offitem[n];  /*массив с набором officeitems*/
    private Offitem[][] employeesSets = new Offitem[5][n];  /*массив наборов*/
    private String[] emplist = new String[5];   /*список сотрудников*/


    public void addItem (String na, int p) {
        Offitem item = new Offitem ();
        item.setName(na);
        item.setPrice(p);
        for(int i=0;i<n;i++) {
            if (itemSets[i]==null) {
                itemSets[i]=item;
                //System.out.println("Ввендено - Название - " + itemSets[i].getName() + " Цена - " + itemSets[i].getPrice() + " " +i);
                break;
            }

        }

        }
        public void wrightEmployeeSet(int e) { /* запись набора, индекс соотвествует индексу работника из emplist */
        int i = e-1;
        for (int j=0; j<n; j++) {
            if(itemSets[j]!=null) {
            employeesSets[i][j]=itemSets[j];
            //System.out.println(itemSets[j].getPrice());
                }
        }
        }
        public void setEmpName(String s) {   /*запись в список сотрудников*/
        for (int i=0; i<5 ;i++) {
            if (emplist[i]==null) {emplist[i]=s;
            System.out.println(emplist[i]);
            break;}

        }
        }


    public int countPrice () {
        int cost = 0;
        int i=0;

        for (i=0; i<n; i++) {
            if (itemSets[i]!=null) {
            //System.out.println(itemSets[i].getPrice());

            cost += itemSets[i].getPrice();
            //System.out.println(cost + " " +i);
            //System.out.println(itemSets[i].getPrice());
        }
        }
        System.out.println("Цена набора - " + cost);
        return cost;
    }
    public void deletItem(int d) {
        itemSets[d-1]=null;

    }

    public static void main(String[] args) {   /*здесь можно навесить пользовательский ввод, аналогично выполненному в задании 1.6*/

        Table t=new Table();
        t.addItem("nnn",8);
        t.addItem("ttt", 5);
        t.addItem("aaa", 4);
        t.addItem("zzz", 200);
        t.deletItem(4);
        t.setEmpName("Вася");
        t.countPrice();
        t.wrightEmployeeSet(1);
        t.addItem("yyyy", 10);
        t.setEmpName("Коля");
        t.countPrice();
        t.wrightEmployeeSet(2);


    }
}
