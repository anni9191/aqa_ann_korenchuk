package org.example;

class Androids implements Smartphones, LinuxOS {

    public void call() {

        System.out.println("Calling from Android...");

    }

    public void sms() {

        System.out.println("Sending SMS from Android...");

    }

    public void internet() {

        System.out.println("Browsing internet from Android...");

    }

    public void openSource() {

        System.out.println("Android is based on LinuxOS...");

    }

}
