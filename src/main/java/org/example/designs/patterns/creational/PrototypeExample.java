package org.example.designs.patterns.creational;


import lombok.Setter;

/**
 * *
 * * @author Pratyay
 */
class PrototypeExample {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setId("10001");
        fullTimeEmployee.setName("Alex");
        fullTimeEmployee.setDepartment("Accounts");
        Prototype clone = fullTimeEmployee.clone();
    }
}

interface Prototype {
    Prototype clone();
}

class FullTimeEmployee implements Prototype {
    @Setter
    private String id;
    @Setter
    private String name;
    @Setter
    private String department;

    // default constructor
    FullTimeEmployee() {
    }

    // copy constructor part
    FullTimeEmployee(FullTimeEmployee source) {
        this.id = source.id;
        this.name = source.name;
        this.department = source.department;
    }

    @Override
    public Prototype clone() {
        return new FullTimeEmployee(this);
    }
}


class ContractualEmployee implements Prototype {
    @Setter
    private String id;
    @Setter
    private String name;
    @Setter
    private long expiry;

    // default constructor
    ContractualEmployee() {
    }

    ContractualEmployee(ContractualEmployee source) {
        this.id = source.id;
        this.name = source.name;
        this.expiry = source.expiry;
    }


    @Override
    public Prototype clone() {
        return new ContractualEmployee(this);
    }
}
