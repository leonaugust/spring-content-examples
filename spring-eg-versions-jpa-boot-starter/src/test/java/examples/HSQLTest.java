package examples;

import com.github.paulcwarren.ginkgo4j.Ginkgo4jSpringRunner;
import examples.versioning.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import tests.versioning.VersioningTests;

@RunWith(Ginkgo4jSpringRunner.class)
//@Ginkgo4jConfiguration(threads=1)
@SpringBootTest(classes = Application.class)
public class HSQLTest extends VersioningTests {

//    @Autowired
//    private VersionedDocumentAndVersioningRepository repo;
//
//    @Autowired
//    private LockingService lockingService;
//
//    {
//        FIt("deadlock tests", () -> {
//            ExecutorService executor = Executors.newFixedThreadPool(5);
//            for (int i = 0; i < 5; i++) {
//                Runnable worker = new ThreadTest(i, repo);
//                executor.execute(worker);
//            }
//            executor.shutdown();
//            while (!executor.isTerminated()) {
//            }
//        });
//    }
}