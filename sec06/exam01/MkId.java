package sec06.exam01;

public class MkId {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm.";
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        new_id = new_id.replaceAll("[^-_.a-z0-9]","");
        System.out.println(new_id);
        new_id = new_id.replaceAll("[.]{2,}",".");
        System.out.println(new_id);
        new_id = new_id.replaceAll("^[.]|[.]$","");
        System.out.println(new_id);
        if(new_id.length() == 0) new_id += 'a';
        System.out.println(new_id);
        new_id = new_id.substring(0, 15);
        System.out.println(new_id);
        new_id = new_id.replaceAll("[.]$","");
        System.out.println(new_id);
        if(new_id.length() < 3) {
            while(new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        System.out.println(new_id);
    }
}
