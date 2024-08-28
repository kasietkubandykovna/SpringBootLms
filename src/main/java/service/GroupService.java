package service;

import entity.Company;
import entity.Group;

import java.util.List;

public interface GroupService {
    void saveCompany (Group group);
    List<Group> getAllGroups();
    Group getById(int id);
    void deleteGroup(int id);
    void updateGroup(Long id,Group group);
}
