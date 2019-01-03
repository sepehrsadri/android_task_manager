package project.com.maktab.hw_6.database;

public class TaskDbSchema {

    public static final String NAME = "tasks.db";
    public static final int VERSION = 1;

    public static final class TaskTable {

        public static final String NAME = "task";

        public static final class Cols {

            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DESCRIPTION = "description";
            public static final String DATE = "date";
            public static final String TYPE = "type";

        }


    }


}