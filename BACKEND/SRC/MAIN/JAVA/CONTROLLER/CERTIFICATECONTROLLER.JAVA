@RestController
@RequestMapping("/api/certificate")
@CrossOrigin
public class CertificateController {
    @Autowired
    private CertificateService service;

    @GetMapping
    public List<Certificate> getAll(){ return service.getAll(); }

    @PostMapping
    public Certificate save(@RequestBody Certificate c){ return service.save(c); }
}
