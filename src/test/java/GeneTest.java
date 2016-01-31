import cn.org.rapid_framework.generator.GeneratorFacade;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by GYOUNG on 2016/1/31.
 */
public class GeneTest {

    @Test
    public void test() throws Exception{
        GeneratorFacade g = new GeneratorFacade();
        g.deleteOutRootDir();
        g.generateByAllTable();
    }
}
