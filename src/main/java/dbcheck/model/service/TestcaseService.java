package dbcheck.model.service;

import dbcheck.model.dao.ITestcaseDAO;
import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class TestcaseService implements ITestcaseService {

    private ITestcaseDAO testcaseSourceDao;
    private ITestcaseDAO testcaseTargetDao;

    @Override
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException {
        return  testcaseSourceDao.getTestcase(code);
    }

    @Override
    public List<TestcaseBean> getTestcaseActualResult(String query) throws IOException, SQLException {
        return  testcaseTargetDao.getTestcaseActualResult(query);
    }

    public ITestcaseDAO getTestcaseSourceDao() {
        return testcaseSourceDao;
    }

    public void setTestcaseSourceDao(ITestcaseDAO testcaseSourceDao) {
        this.testcaseSourceDao = testcaseSourceDao;
    }

    public ITestcaseDAO getTestcaseTargetDao() {
        return testcaseTargetDao;
    }

    public void setTestcaseTargetDao(ITestcaseDAO testcaseTargetDao) {
        this.testcaseTargetDao = testcaseTargetDao;
    }
}
