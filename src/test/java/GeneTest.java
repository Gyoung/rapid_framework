import cn.org.rapid_framework.generator.GeneratorFacade;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by GYOUNG on 2016/1/31.
 */
public class GeneTest {

    @Test
    public void test() throws Exception{
        GeneratorFacade facade = new GeneratorFacade();
//        facade.getGenerator().setIncludes(getIncludes(args,1));
        facade.getGenerator().addTemplateRootDir(new File("template"));
        facade.deleteOutRootDir();
        facade.generateByTable("Country");
    }
}
