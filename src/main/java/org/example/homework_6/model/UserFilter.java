package org.example.homework_6.model;

import lombok.Data;

import java.util.*;

@Data
public class UserFilter extends Notebook {
    private boolean userHere;
    private Set<Notebook> base;
    private LinkedHashMap<Integer, String> optionList;

//    private void fillNew(){
//        generateOptionList();
//        userHere = true;
//    }
//    public UserFilter(String model, Integer ramSize, Integer diskSize, String osName, String color) {
//        super(model, ramSize, diskSize, osName, color);
//        fillNew();
//    }

//    public UserFilter() {
//        super();
//        fillNew();
//    }

    public UserFilter(Set<Notebook> base) {
        super();
        generateOptionList();
        userHere = base.size() > 0;
        this.base = new LinkedHashSet<>(base);
    }


    private void generateOptionList() {
        optionList = new LinkedHashMap<>();
        optionList.put(1, "model");
        optionList.put(2, "RAM");
        optionList.put(3, "Disk");
        optionList.put(4, "OS");
        optionList.put(5, "color");
        optionList.put(0, "Exit");
    }

    private void printOptions() {
        HashMap<Integer, String> list = this.getOptionList();
        for (Object key : list.keySet()) {
            System.out.println(key + " - " + list.get(key) + ": " + getOptionValue(key));
        }
    }

    private String getOptionValueString(Object key) {
        Set resultSet = new TreeSet();
        for (Notebook item : base) {
            resultSet.add(item.getOptionValue(key));
        }


        String result = "";
        for (Object o : resultSet) {
            result += (result.isEmpty() ? "" : ", ") + o.toString();
        }
        return result;
    }


    public void askFilter() {
        printOptions();
        System.out.print("Option: ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        if (userChoice == 0) this.userHere = false;
        else if (userChoice > 5) System.out.println("Wrong option");
        else {
            askOption(userChoice);
            printFilter();
        }
    }

    private void printFilter() {
        for (Notebook item : base) {
            if (item.matchFilter(this)) {
                System.out.println(item);
            }
        }
    }

    private void askOption(int userChoice) {
        String optionName = getOptionList().get(userChoice);
        String optionList = getOptionValueString(userChoice);
        if (optionName.equals("model")) {
            optionList = "any string";
        }

        System.out.print(optionName + " (" + optionList + ") :");
        switch (userChoice) {
            case 1 -> this.setModel(askString());
            case 2 -> this.setRamSize(askInt());
            case 3 -> this.setDiskSize(askInt());
            case 4 -> this.setOsName(askString());
            case 5 -> this.setColor(askString());
            default -> throw new IllegalStateException("Unexpected value: " + userChoice);
        }

    }

    private Integer askInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private String askString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


}
