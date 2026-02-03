@Service
public class SkillService {
    @Autowired
    private SkillRepository repo;

    public Skill save(Skill s){ return repo.save(s); }
    public List<Skill> getAll(){ return repo.findAll(); }
}
