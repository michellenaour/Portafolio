package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }
    @Test
    public void test(){
        Printer p=new Printer();
        Student student= new Student("Camila López", "Los Volcanes 405",10001);
        Employee employee= new Employee("Adolfo Sepúlveda","Las Camelias 384",20001);
        Course course= new Course("Cálculo I",6);
        p.printer(student);
        p.printer(employee);
        p.printer(course);


    }
    @org.junit.After
    public void tearDown() throws Exception {
    }
}