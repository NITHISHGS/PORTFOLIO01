@Entity
public class Admin {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;

    // Getters and Setters
}
