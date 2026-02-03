@Entity
public class Profile {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String bio;
    private String imageUrl;

    // Getters and Setters
}
