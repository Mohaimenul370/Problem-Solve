import java.util.*;
public class Start {
    public static void main(String[] args)
    {

        int Op = -1;
        String emplayeeName , customerName , employeeId ;
        int salary , amount , customerId , intId , nId ;
        Bank bank = new Bank();
        Employee[] employee = new Employee[Bank.MAX_P];
        Customer[] customer = new Customer[Bank.MAX_P];
        Account[] account = new Account[Customer.MAXIMUM_ACCOUNT];
        int emIndex = 0;
        int cuIndex = 0 ;
        int accIndex = 0;
        Scanner scanner = new Scanner(System.in);
        while(Op!=5)
        {
           Menu();
            System.out.println("OPTION: ");
            Op = scanner.nextInt();

            switch (Op) {
                case 1:
                    while (Op != 0) {
                        employeeMenu();
                        System.out.print("OPTION: ");
                        Op = scanner.nextInt();
                        switch (Op) {
                            case 1:
                                System.out.print("ENTER THE NAME: ");
                                emplayeeName = scanner.next();
                                System.out.print("ENTER ID: ");
                                employeeId = scanner.next();
                                intId = Integer.parseInt(employeeId);
                                if (bank.getEmployee(intId) == null) {
                                    System.out.print("ENTER SALARY: ");
                                    salary = scanner.nextInt();
                                    employee[emIndex] = new Employee(emplayeeName, employeeId, salary);
                                    bank.insertEmployee(employee[emIndex]);
                                    emIndex++;
                                } else {
                                    System.out.println("ACCOUNT HAS BEEN ALREADY EXISTS");
                                }
                                break;
                            case 2:
                                System.out.print("ENTER ID: ");
                                employeeId = scanner.next();
                                intId = Integer.parseInt(employeeId);
                                if (bank.getEmployee(intId) != null) {
                                    bank.removeEmployee(bank.getEmployee(intId));
                                } else
                                    System.out.println("Invalid ID");
                                break;
                            case 3:
                                System.out.println();
                                bank.showAllEmployees();
                                break;
                            default:
                        }
                    }
                    break;
                case 2:
                    while (Op != 0) {
                        customerMenu();
                        System.out.print("OPTION: ");
                        Op = scanner.nextInt();
                        switch (Op) {
                            case 1:
                                System.out.print("ENTER NAME: ");
                                customerName = scanner.next();
                                System.out.print("Enter NID: ");
                                customerId = scanner.nextInt();
                                if (bank.getCustomer(customerId) == null) {
                                    customer[cuIndex] = new Customer(customerName, customerId);
                                    bank.insertCustomer(customer[cuIndex]);
                                    cuIndex++;
                                } else {
                                    System.out.println("ACCOUNT HAS BEEN ALREADY EXISTS");
                                }

                                break;
                            case 2:
                                System.out.print("ENTER ID: ");
                                customerId = scanner.nextInt();
                                if (bank.getCustomer(customerId) != null) {
                                    bank.removeCustomer(bank.getCustomer(customerId));
                                } else
                                    System.out.println("INVALID ID");
                                break;
                            case 3:
                                System.out.println();
                                bank.showAllCustomers();
                                break;
                            default:
                        }
                    }
                    break;
                case 3:
                    while (Op != 0) {
                        managementMenu();
                        System.out.print("OPTION: ");
                        Op = scanner.nextInt();
                        switch (Op) {
                            case 1:
                                System.out.print("ENTER NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    if (bank.getCustomer(nId).accountNumber != nId) {
                                        account[accIndex] = new SavingsAccount(nId, 0);
                                        bank.insertAccount(account[accIndex]);
                                        accIndex++;
                                    } else {
                                        System.out.println("ACCOUNT HAS BEEM ALREADY EXISTS");
                                    }
                                } else {
                                    System.out.println("Account DOESN'T EXISTS . PLEASE CREATE CUSTOMER ACCOUNT");
                                    Op = 0;
                                }
                                break;
                            case 2:
                                System.out.print("Enter NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    bank.removeAccount(bank.getAccount(nId));
                                } else
                                    System.out.println("ACCOUNT DOESN'T EXISTS . Please CREATE CUSTOMER ACCOUNT");
                                Op = 0;
                                break;
                            case 3:
                                System.out.println();
                                bank.showAllAccounts();
                                break;
                            default:
                                System.out.println("ERROR");
                                break;
                        }
                    }
                case 4:
                    while (Op != 0) {
                        transectionMenu();
                        System.out.print("OPTION: ");
                        Op = scanner.nextInt();
                        switch (Op) {
                            case 1:
                                System.out.print("ENTER ACCOUNT ID/NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    if (bank.getAccount(nId) != null) {
                                        System.out.print("HOW MUCH AMOUNT YOU WANT TO DEPOSIT: ");
                                        amount = scanner.nextInt();
                                        bank.getAccount(nId).deposit(amount);
                                    } else {
                                        System.out.println("PLEAE CREATE ACCOUNT FIRST");
                                        Op = 0;
                                    }
                                } else
                                    System.out.println("ERROR NID");
                                break;
                            case 2:
                                System.out.print("ENTER ACCOUNT ID/NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    if (bank.getAccount(nId) != null) {
                                        System.out.print("HOW MUCH AMOUNT YOU WANT TO WITHDRAW: ");
                                        amount = scanner.nextInt();
                                        bank.getAccount(nId).withdraw(amount);
                                    } else
                                        System.out.println("PLASE CREATE ACCOUNT FIRST");
                                    Op = 0;
                                } else
                                    System.out.println("ERROR NID");
                                break;
                            case 3:
                                System.out.print("ENTER YOUR ACCOUNT ID/NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    if (bank.getAccount(nId) != null) {
                                        int tempId = nId;
                                        System.out.print("ENTER TRANSFER ACCOUNT ID/NID: ");
                                        nId = scanner.nextInt();
                                        if (bank.getCustomer(nId) != null) {
                                            if (bank.getAccount(nId) != null) {
                                                System.out.print("HOW MUCH AMOUNT YOU WANT TO TRANSFER: ");
                                                amount = scanner.nextInt();
                                                bank.getAccount(tempId).transfer(bank.getAccount(nId), amount);
                                            } else {
                                                System.out.println("PLASE CREATE ACCOUNT FIRST");
                                            }
                                        } else {
                                            System.out.println("ERROR NID");
                                        }
                                    } else {
                                        System.out.println("PLEASE CRETE A ACCOUNT FIRST");
                                    }
                                } else {
                                    System.out.println("ERROR NID");
                                }
                                break;
                            case 4: // personal info
                                System.out.print("ENTER ACCOUNT ID/NID: ");
                                nId = scanner.nextInt();
                                if (bank.getCustomer(nId) != null) {
                                    if (bank.getAccount(nId) != null) {
                                        System.out.println("NAME   : " + bank.getCustomer(nId).name);
                                        System.out.println("ID     : " + nId);
                                        System.out.println("BALANCE: " + bank.getAccount(nId).balance);
                                    } else {
                                        System.out.println("PLEASE CREATE A ACCOUNT FIRST");
                                    }
                                } else {
                                    System.out.println("ERROR NID");
                                }
                            default:
                                break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("ERROR CHOISE");
                    break;
            }
        }
    }
    public static void Menu() {
        System.out.println("-------MAIN MENU-----------");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Account Management");
        System.out.println("4. Account Transactions");
        System.out.println("5. CLOSE");
    }

    public static void employeeMenu() {
        System.out.println("-------EMPLOYEE MENU---------");
        System.out.println("1. INSERT NEW EMPLOYEE");
        System.out.println("2. REMOVE Existing EMPLOYEE");
        System.out.println("3. SHOW ALL EMPLOYEES");
        System.out.println("0. Menu");
    }

    public static void customerMenu() {
        System.out.println("----------CUSTOMER MENU-----------");
        System.out.println("1. INSERT NEW CUSTOMER");
        System.out.println("2. REMOVE EXISTING CUSTOMER");
        System.out.println("3. SHOW ALL ACCOUNT");
        System.out.println("0. MENU");
    }

    public static void managementMenu() {
        System.out.println("-------------Account  Management--------------");
        System.out.println("1. INSERT NEW ACCOUNT");
        System.out.println("2. REMOVE EXISTING ACCOUNT");
        System.out.println("3. SHOW ALL ACCOUNT");
        System.out.println("0. MENU");
    }

    public static void transectionMenu() {
        System.out.println("----------Account TRANJECTION------------");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. TRANSFER");
        System.out.println("4. ACCOUNT INFORMATION");
        System.out.println("0. MENU");
    }

}
