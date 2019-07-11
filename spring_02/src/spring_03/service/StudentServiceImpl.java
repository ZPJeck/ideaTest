package spring_03.service;

public class StudentServiceImpl implements StudentService {
    @Override
    public void add() {
        System.out.println("-------hello----------");
    }

    @Override
    public void delete() {
        System.out.println("---------bye----------");
    }
}
