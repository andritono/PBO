*Person*
- name: String
- address: String

+ Person(name: String, address: String)
+ getName(): String
+ getAddress(): String
+ setAddress(address: String): void
+ toString(): String
"name (address)"

*Student* (extends Person)
- numCourses: int = 0
- courses: String[] = {}
- grades: int[] = {}

+ Student(name: String, address: String)
+ addCourseGrade(course: String, grade: int): void
+ printGrades(): void
+ getAverageGrade(): double
+ toString(): String

*Teacher* (extends Person)
- numCourses: int = 0
- courses: String[] = {}

+ Teacher(name: String, address: String)
+ addCourse(course: String): boolean
+ removeCourse(course: String): boolean
+ toString(): String
Return false if the course already existed
Return false if the course does not exist
