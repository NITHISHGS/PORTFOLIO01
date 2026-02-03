@Service
public class AdminService {
    @Autowired
    private AdminRepository repo;

    public Admin login(String username, String password){
        Admin admin = repo.findByUsername(username);
        if(admin != null && admin.getPassword().equals(password)){
            return admin;
        }
        return null;
    }
}
