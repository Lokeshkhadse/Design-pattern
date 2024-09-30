package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       User user = new User.UserBuilder()
                  .setUserId("1")
                  .setUserName("ram")
                  .build();

        System.out.println(user);

        System.out.println("-------------------------------------");

        User user1 = User.UserBuilder.builder()
                .setUserName("sham")
                .setUserId("2")
                .build();

        System.out.println(user1);
    }

}
