public class Main {
    public static void main(String[] args) {
        String phone = "+960 415-37-74";
        phone = phone.replace("-","");
        phone = phone.replace(" ","");
        phone = phone.replace("+","");
        if (phone.length() == 10) {
            //phone = "7" + phone;

        } else if (phone.length() > 11) {
            throw new RuntimeException("телефон длинный");
        } else if (phone.length() < 10) {
           throw new RuntimeException("телефон короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("номер не на 7");
            
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604153774";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

    }
}