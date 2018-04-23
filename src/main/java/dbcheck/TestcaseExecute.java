package dbcheck;

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

        String query;
        query = service.getTestcase("TESTCASE_01").get(0).getQuery();

        System.out.println("Source query: " + query);
        System.out.println("Target result: " + service.getTestcaseActualResult(query));
    }

}
