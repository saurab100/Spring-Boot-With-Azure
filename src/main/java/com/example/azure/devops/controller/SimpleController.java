@RestController
public class SimpleController {

    @GetMapping
    public String hello() {
        return "Hello World i'm build in Azure Pipelines!";
    }
}