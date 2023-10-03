/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Users;

import Controller.Employee.Employee;
import Controller.Role.Role;
import Controller.WorkQueue.WorkQueue;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class Users {
    private String firstname,lastname,sex,mailId,address,city,state,dob;
    private String emergencycontactname,ngoid,eventname,status,relation;
    private Users MHWR;
    private Employee employee;
    private Role role;
    
    private WorkQueue workQueue;

    public Users() {
        workQueue = new WorkQueue();
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private int zipcode;
    private Long phone,emergencycontactnumber,ssnno;
    
    private String username;
    private String password;

    public String getNgoid() {
        return ngoid;
    }

    public void setNgoid(String ngoid) {
        this.ngoid = ngoid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmergencycontactname() {
        return emergencycontactname;
    }

    public void setEmergencycontactname(String emergencycontactname) {
        this.emergencycontactname = emergencycontactname;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getEmergencycontactnumber() {
        return emergencycontactnumber;
    }

    public void setEmergencycontactnumber(Long emergencycontactnumber) {
        this.emergencycontactnumber = emergencycontactnumber;
    }

    public Long getSsnno() {
        return ssnno;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Users getMHWR() {
        return MHWR;
    }

    public void setMHWR(Users MHWR) {
        this.MHWR = MHWR;
    }

    
    public void setSsnno(Long ssnno) {
        this.ssnno = ssnno;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String toFullname() {
        return firstname+" "+lastname;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}