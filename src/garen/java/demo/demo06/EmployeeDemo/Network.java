package garen.java.demo.demo06.EmployeeDemo;
/*
 *  描述的是网络维护工程师
 *  属于维护部的员工,继承维护部类
 */
public class Network extends Maintainer {
    @Override
    public void work() {

        System.out.println("网络工程师检查网络是否畅通" + super.getName() + "..." + super.getId());

    }
}