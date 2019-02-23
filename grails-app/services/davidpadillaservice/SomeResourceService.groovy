package davidpadillaservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource

class SomeResourceService {

    @Value("classpath:folder/file.txt")
    Resource fileResource

    String getFirstLine() {
        getLine(0)
    }

    String getSecondLine() {
        getLine(1)
    }

    protected String getLine(int index) {
        fileResource.file.readLines().get(index)
    }
}
