package org.example;

class iPhones implements Smartphones, iOS {

        public void call() {

            System.out.println("Calling from iPhone...");

        }

        public void sms() {

            System.out.println("Sending SMS from iPhone...");

        }

        public void internet() {

            System.out.println("Browsing internet from iPhone...");

        }

        public void icloud() {

            System.out.println("Using iCloud from iPhone...");

        }

    }
