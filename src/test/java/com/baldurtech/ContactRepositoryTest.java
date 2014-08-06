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
