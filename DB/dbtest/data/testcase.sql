BEGIN
  pkg_core.add_testcase(p_code => 'TESTCASE_01',
                        p_description => 'Sample testcase 01',
                        p_query => 'SELECT dummy FROM dual',
                        p_expected_result => XMLTYPE(q'[<ROWSET>
    <ROW>
        <DUMMY>X</DUMMY>
    </ROW>
</ROWSET>]'),
                        p_enabled => 'Y');
END;
/
