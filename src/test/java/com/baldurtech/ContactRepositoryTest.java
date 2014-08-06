package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class ContactRepositoryTest extends TestCase
{
    public void test_����ָ��idɾ��Contact()
    {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        
        contactRepository.deleteById(1L);
        
        assertEquals("DELETE FROM contact WHERE id=1", db.executeUpdateParam);
    }
}

class DatabaseManagerMock implements DatabaseManager
{
    public String executeUpdateParam;
    public int executeUpdateShouldReturn = 0;
    
    public int executeUpdate(String sql)
    {
        executeUpdateParam = sql;
        return executeUpdateShouldReturn;
    }
}