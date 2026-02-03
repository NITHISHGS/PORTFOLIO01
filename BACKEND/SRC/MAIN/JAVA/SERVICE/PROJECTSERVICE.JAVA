@Service
public class ProjectService {
    @Autowired
    private ProjectRepository repo;

    public Project save(Project p){ return repo.save(p); }
    public List<Project> getAll(){ return repo.findAll(); }
}
