package dbcheck;

import dbcheck.model.domain.TestcaseBean;
import dbcheck.model.service.ITestcaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.sql.SQLException;

public class TestcaseExecute {
    public static void main(String[] args)
            throws IOException, SQLException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITestcaseService service = (ITestcaseService) ctx.getBean("testcaseService");


        TestcaseBean tc = service.getTestcase("TESTCASE_01").get(0);

        System.out.println("Target result: " + tc.toString());
    }

}
