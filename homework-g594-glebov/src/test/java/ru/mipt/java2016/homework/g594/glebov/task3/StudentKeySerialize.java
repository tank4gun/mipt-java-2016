package ru.mipt.java2016.homework.g594.glebov.task3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import ru.mipt.java2016.homework.g594.glebov.task2.MySerializer;
import ru.mipt.java2016.homework.tests.task2.Student;
import ru.mipt.java2016.homework.tests.task2.StudentKey;

/**
 * Created by daniil on 16.11.16.
 */
public class StudentKeySerialize implements MySerializer<StudentKey> {
    @Override
    public void streamSerialize(StudentKey object, DataOutputStream output) throws IOException {
        output.writeInt(object.getGroupId());
        output.writeUTF(object.getName());
    }

    @Override
    public StudentKey streamDeserialize(DataInputStream input) throws IOException {
        Integer groupId = input.readInt();
        String name = input.readUTF();
        StudentKey student = new StudentKey(groupId, name);
        return student;
    }

    @Override
    public void streamSerialize(StudentKey object, RandomAccessFile output) throws IOException {
        output.writeInt(object.getGroupId());
        output.writeUTF(object.getName());
    }

    @Override
    public StudentKey streamDeserialize(RandomAccessFile input) throws IOException {
        Integer groupId = input.readInt();
        String name = input.readUTF();
        StudentKey student = new StudentKey(groupId, name);
        return student;
    }

    @Override
    public int typeSize() {
        return STRING.typeSize() + INT.typeSize();
    }
}
