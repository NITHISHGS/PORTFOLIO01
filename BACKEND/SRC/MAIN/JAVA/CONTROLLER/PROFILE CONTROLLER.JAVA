@RestController
@RequestMapping("/api/profile")
@CrossOrigin
public class ProfileController {
    @Autowired
    private ProfileService service;

    @GetMapping
    public List<Profile> getAll(){ return service.getAll(); }

    @PostMapping
    public Profile save(@RequestBody Profile p){ return service.save(p); }
}
