package com.company.prac6;

public class Student
{
        private int id;
        private String  name;
        private String  group;
        private int age;

        public int getId()
        {
            return id;
        }

        public void setId()
        {
            id = (int)(1 + Math.random()*40);
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group)
        {
            this.group = group;
        }

        public Integer getAge()
        {
            return age;
        }

        public void setAge(Integer age)
        {
            this.age = age;
        }

        public String toString()
        {
            return "Student{ " +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", group='" + group + '\'' +
                    ", age=" + age +
                    " }";
        }

    static String[] names = new String[] { "Андрей", "Владислав", "Ульяна", "Алексей", "Илья", "Виктория" };
    static String[] groups  = new String[] { "IKBO-03", "IKBO-04", "IKBO-05" };

    public static Student[] getSamples()
    {
        var students = new Student[6];

        for (int i = 0; i < 6; i++)
        {
            var student = new Student();
            student.setName(names[i % names.length]);
            student.setGroup(groups[i % groups.length]);
            student.setAge(16 + i);
            student.setId();

            students[i] = student;
        }

        return students;
    }
}
