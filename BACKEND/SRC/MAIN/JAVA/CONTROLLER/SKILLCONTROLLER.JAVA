@RestController
@RequestMapping("/api/skill")
@CrossOrigin
public class SkillController {
    @Autowired
    private SkillService service;

    @GetMapping
    public List<Skill> getAll(){ return service.getAll(); }

    @PostMapping
    public Skill save(@RequestBody Skill s){ return service.save(s); }
}
