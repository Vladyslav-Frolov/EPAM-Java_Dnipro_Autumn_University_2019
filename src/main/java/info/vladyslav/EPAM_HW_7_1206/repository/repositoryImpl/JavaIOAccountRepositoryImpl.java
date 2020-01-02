package info.vladyslav.EPAM_HW_7_1206.repository.repositoryImpl;

import info.vladyslav.EPAM_HW_7_1206.auxiliary.AccountStatus;
import info.vladyslav.EPAM_HW_7_1206.model.Account;
import info.vladyslav.EPAM_HW_7_1206.repository.AccountRepository;

import java.io.*;
import java.util.*;


public class JavaIOAccountRepositoryImpl implements AccountRepository {

    private String fileName = "D:\\Documents\\Workspace\\EPAM\\src\\main\\resources\\accounts.txt";

    @Override
    public void create(Account account) throws IOException {
        List<Account> accounts = getAll();
        accounts.add(account);

        List<String> serializedForSaveToFile = new ArrayList<>();
        for (Account accountForSaveToFile : accounts) {
            String stringForSaveToFile = "id = " + accountForSaveToFile.getId() +
                    " | accountName = " + accountForSaveToFile.getAccountName() +
                    " | status = " + accountForSaveToFile.getStatus();
            serializedForSaveToFile.add(stringForSaveToFile);
        }
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String s : serializedForSaveToFile) {
                writer.println(s);
            }
        } catch (IOException e) {
            System.out.println("can`t write file " + fileName);
        }
    }

    @Override
    public Account getById(Long aLong) {
        return null;
    }

    @Override
    public Long getLastId() throws IOException {
        List<Account> accounts = getAll();
        return (long) accounts.size();
    }

    @Override
    public List<Account> getAll() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<Account> accounts = new ArrayList<>();
        String supportForAccountsArrayList;

        Long id = null;
        String data = null;
        AccountStatus status = null;

        while ((supportForAccountsArrayList = reader.readLine()) != null) {

            String[] tokens = supportForAccountsArrayList.split(" \\| ");
            for (String token : tokens) {
                if (token.startsWith("id = ")) {
                    id = Long.parseLong(token.substring(5));
                }
                if (token.startsWith("accountName = ")) {
                    data = token.substring(14);
                }
                if (token.startsWith("status = ")) {
                    status = AccountStatus.valueOf(token.substring(9));
                }
            }
            accounts.add(new Account(id, data, status));
        }

        return accounts;
    }

    @Override
    public void update(Long idForUpdate, Account accountForUpdate) throws IOException {
        List<Account> collectionForUpdate = getAll();

        List<String> serializedForSaveToFile = new ArrayList<>();

        for (Account accountForUpdateAndSave : collectionForUpdate) {
            if (accountForUpdateAndSave.getId().equals(idForUpdate)) {
                accountForUpdateAndSave = accountForUpdate;
            }
            String stringForSaveToFile = "id = " + accountForUpdateAndSave.getId() +
                    " | accountName = " + accountForUpdateAndSave.getAccountName() +
                    " | status = " + accountForUpdateAndSave.getStatus();
            serializedForSaveToFile.add(stringForSaveToFile);
        }
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String s : serializedForSaveToFile) {
                writer.println(s);
            }
        } catch (IOException e) {
            System.out.println("can`t write file " + fileName);
        }


    }


//    public static void main(String[] args) throws IOException {
//        JavaIOAccountRepositoryImpl javaIOAccountRepository = new JavaIOAccountRepositoryImpl();
//        List<Account> accounts = javaIOAccountRepository.getAll();
//        System.out.println(accounts.size());
//        System.out.println(accounts);
//    }


    @Override
    public void delete(Account account) {

    }

}