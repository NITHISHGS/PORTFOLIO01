@Entity
public class Project {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String certificateUrl;

    // Getters and Setters
}
