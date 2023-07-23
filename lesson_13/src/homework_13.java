public class homework_13 {



    interface LinuxOS {

        void openSource();

    }


    interface iOS {

        void icloud();

    }


    static class Androids implements Smartphones, LinuxOS {

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


    static class iPhones implements Smartphones, iOS {

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
}
