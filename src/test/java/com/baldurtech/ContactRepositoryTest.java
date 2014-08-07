package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class ContactRepositoryTest extends TestCase
{
    public void test_根据指定id删除Contact()
    {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        
        contactRepository.deleteById(1L);
        
        assertEquals("DELETE FROM contact WHERE id=1", db.executeUpdateParam);
    }
    
    public void test_更新指定的contact()
    {
        DatabaseManagerMock db = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(db);
        Contact contact = new Contact();
        contact.setName("shihang");
        contact.setMobile("12345");
        contactRepository.update(contact);
        
        assertEquals("UPDATE SET contact name=shihang,mobile=12345",db.executeUpdateParam);
        
    }
}
