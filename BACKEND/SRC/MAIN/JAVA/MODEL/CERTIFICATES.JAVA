@Entity
public class Certificate {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String category; // NETWORKING, WEB, AI, PROGRAMMING, ACADEMICS
    private String fileUrl;

    // Getters and Setters
}
