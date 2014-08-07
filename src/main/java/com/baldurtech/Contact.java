package com.baldurtech;

public class Contact
{
    private String name;
    private String mobile;
    private String vpmn;
    private String email;
    private String homeAddress;
    private String officeAddress;
    private String job;
    private Long jobLevel;
    private Long id;
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    public String getMobile()
    {
        return mobile;
    }
    
    public void setVpmn(String vpmn)
    {
        this.vpmn = vpmn;
    }
    public String getVpmn()
    {
        return vpmn;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void setJob(String job)
    {
        this.job = job;
    }
    public String getJob()
    {
        return job;
    }
    
    public void setJobLevel(Long jobLevel)
    {
        this.jobLevel = jobLevel;
    }
    public Long getJobLevel()
    {
        return jobLevel;
    }
    
    public void setOfficeAddress(String officeAddress)
    {
        this.officeAddress = officeAddress;
    }
    public String getOfficeAddress()
    {
        return officeAddress;
    }
    
    public void setHomeAddress(String homeAddress)
    {
        this.homeAddress = homeAddress;
    }
    public String getHomeAddress()
    {
        return homeAddress;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    public Long getId()
    {
        return id;
    }
    
}