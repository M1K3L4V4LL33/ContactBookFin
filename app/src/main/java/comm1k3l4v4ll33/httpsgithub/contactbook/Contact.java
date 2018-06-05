package comm1k3l4v4ll33.httpsgithub.contactbook;import android.widget.EditText;

public class Contact
{
    private String name;
    private String phone;
    private String email;

    public Contact()
    {
        name = "";
        phone = "";
        email = "";
    }

    public Contact(String nameInput, String phoneInput, String emailInput)
    {
        String name = nameInput;
        String phone = phoneInput;
        String email = emailInput;
    }

    public String getName ()
    {
        return name;
    }

    public String getPhone ()
    {
        return phone;
    }

    public String getEmail ()
    {
        return email;
    }
}







