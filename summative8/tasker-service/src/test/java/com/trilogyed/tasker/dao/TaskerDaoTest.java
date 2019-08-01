package com.trilogyed.tasker.dao;

import com.trilogyed.tasker.model.Task;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskerDaoTest {

    @Autowired
    protected TaskerDao taskerDao;

    @Before
    public void setUp() throws Exception {

        List<Task> tList = taskerDao.getAllTasks();

        tList.stream()
                .forEach(task -> taskerDao.deleteTask(task.getId()));
    }

    @Test
    public void createGetDeleteTask() {
        Task task = new Task();
        task.setDescription("desc12");
        task.setCreateDate(LocalDate.of(1989, 4, 21));
        task.setDueDate(LocalDate.of(2012, 6, 22));
        task.setCategory("cata");

        task = taskerDao.createTask(task);

        Task task2 = taskerDao.getTask(task.getId());
        assertEquals(task, task2);

        taskerDao.deleteTask(task.getId());

        task2 = taskerDao.getTask(task.getId());

        assertNull(task2);

    }

    @Test
    public void getAllTasks() {
        Task task = new Task();
        task.setDescription("desc1");
        task.setCreateDate(LocalDate.of(1976, 5, 12));
        task.setDueDate(LocalDate.of(2013, 5, 12));
        task.setCategory("cat12");

        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("desc2");
        task.setCreateDate(LocalDate.of(1978, 4, 5));
        task.setDueDate(LocalDate.of(2017, 6, 6));
        task.setCategory("cater");

        taskerDao.createTask(task);
        List<Task> taskList = taskerDao.getAllTasks();

        assertEquals(taskList.size(), 2);

    }

    @Test
    public void getTasksByCategory() {
        Task task = new Task();
        task.setDescription("descro");
        task.setCreateDate(LocalDate.of(2003, 3, 11));
        task.setDueDate(LocalDate.of(2011, 7, 17));
        task.setCategory("cater");

        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("stuff");
        task.setCreateDate(LocalDate.of(2008, 6, 12));
        task.setDueDate(LocalDate.of(2011, 4, 15));
        task.setCategory("things");

        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("hi");
        task.setCreateDate(LocalDate.of(2004, 3, 5));
        task.setDueDate(LocalDate.of(2014, 3, 19));
        task.setCategory("yo");

        taskerDao.createTask(task);

        List<Task> tList = taskerDao.getTasksByCategory("things");
        assertEquals(2, tList.size());

        tList = taskerDao.getTasksByCategory("yo");
        assertEquals(1, tList.size());
    }

    @Test
    public void updateTask() {
        Task task = new Task();
        task.setId(15);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2010, 10, 05));
        task.setDueDate(LocalDate.of(2014, 4, 10));
        task.setCategory("cata");

        task = taskerDao.createTask(task);

        task = new Task();
        task.setId(12);
        task.setDescription("Description1");
        task.setCreateDate(LocalDate.of(2001, 1, 11));
        task.setDueDate(LocalDate.of(2011, 5, 5));
        task.setCategory("cat1");

        task = taskerDao.createTask(task);

        taskerDao.updateTask(task);
        Task task2 =  taskerDao.getTask(task.getId());
        assertEquals(task2, task);
    }
}