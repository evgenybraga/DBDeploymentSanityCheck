package dbcheck.model.dao;

import dbcheck.model.domain.TestcaseBean;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestcaseSqlMapDao extends SqlMapClientDaoSupport implements ITestcaseDAO {

    private static final String NAMESPACE = "Testcase.";
    private static final String GET_TESTCASE = NAMESPACE + "getTestcase";
    private static final String GET_TESTCASE_ACTUAL_RESULT = NAMESPACE + "getTestcaseActualResult";

    @Override
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("testcaseCode", code);
        getSqlMapClientTemplate().queryForObject(GET_TESTCASE, params);
        return (List<TestcaseBean>) params.get("testcaseBody");
    }

    @Override
    public List<TestcaseBean> getTestcaseActualResult(String query) throws IOException, SQLException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("testcaseQuery", query);
        getSqlMapClientTemplate().queryForObject(GET_TESTCASE_ACTUAL_RESULT, map);
        return (List<TestcaseBean>) map.get("actualResult");
    }

}
