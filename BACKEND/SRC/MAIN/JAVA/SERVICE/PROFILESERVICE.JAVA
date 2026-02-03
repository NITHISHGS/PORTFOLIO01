@Service
public class ProfileService {
    @Autowired
    private ProfileRepository repo;

    public Profile save(Profile p){ return repo.save(p); }
    public List<Profile> getAll(){ return repo.findAll(); }
}
