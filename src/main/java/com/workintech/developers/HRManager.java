package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    // Constructor
    public HRManager(int id, String name, double salary, int juniorDevCapacity, int midDevCapacity, int seniorDevCapacity) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorDevCapacity];
        this.midDevelopers = new MidDeveloper[midDevCapacity];
        this.seniorDevelopers = new SeniorDeveloper[seniorDevCapacity];
    }
    public HRManager(int id, String name, double salary) {
        this(id, name, salary, 3, 3, 3); // Default capacities
    }

    // JuniorDeveloper ekleme
    public void addEmployee(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Junior Developers.");
                return;
            }
        }
        System.out.println("Junior Developers team is full!");
    }

    // MidDeveloper ekleme
    public void addEmployee(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Mid Developers.");
                return;
            }
        }
        System.out.println("Mid Developers team is full!");
    }

    // SeniorDeveloper ekleme
    public void addEmployee(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Senior Developers.");
                return;
            }
        }
        System.out.println("Senior Developers team is full!");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is an HR Manager and managing employees.");
    }


}
