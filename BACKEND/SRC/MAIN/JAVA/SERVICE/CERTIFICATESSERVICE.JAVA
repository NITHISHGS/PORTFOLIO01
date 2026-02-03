@Service
public class CertificateService {
    @Autowired
    private CertificateRepository repo;

    public Certificate save(Certificate c){ return repo.save(c); }
    public List<Certificate> getAll(){ return repo.findAll(); }
}
