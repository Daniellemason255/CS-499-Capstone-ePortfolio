public class App {
    public static void main(String[] args) throws Exception {
        ContactService service = new ContactService();
        var contacts = service.getContacts();

        System.out.println(contacts);
    }
}
