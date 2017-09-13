import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	Scanner sc = new Scanner(System.in);

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		//Student std[]= new Student[students.length];
		//for(int i=0;i<student.length;i++)
        //{

        //}
		//return null;
		if(students==null)
            throw new IllegalArgumentException;
        else
            return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
            throw new IllegalArgumentException;
		//else
        //{
          //  for(int i=0;i<students.length.i++)
            //new Student(id,fullName,birthDate,avgMark);
        //}
        else
        {
            for(int i=0;i<students.length;i++)
            {
                this.students[i]=new Student(students[i].getId(),students[i].getFullName(),students[i].getBirthDate,students[i].getAvgMark());
            }
        }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>= students.length)
            throw new IllegalArgumentException;
        else
            return students[index];
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index].setId(student.getId());
		students[index].setFullName(student.getFullName());
		students[index].setBirthDate(student.getBirthDate());
		students[index].setAvgMark(student.getAvgMark());
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException;
        if(student.length==0)
            students[0] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
        else
        {
            for(int k= (students.length)+1 ; k>=1;k--)
            {
                students[k].setId(students[k-1].getId());
                students[k].setFullName(students[k-1].getFullName());
                students[k].setBirthDate(students[k-1].getBirthDate());
                students[k].setAvgMark(students[k-1].getAvgMark());

            }
            if(k==0)
            {
                students[0]= new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark);
            }
        }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException;
        if(student.length==0)
            students[0] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
        else
            students[students.length + 1] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
	}

	@Override
	public void add(Student student, int index){


		// Add your implementation here
		if(student==null|| index<0 || index>= students.length)
            throw new IllegalArgumentException;
		if(index==0)
            addFirst(student);
        else if(index==students.length)
            addLast(student);
        else
        {
            for(int i=index;i<students.length;i++)
            {
                students[i+1].setId(students[i].getId());
                students[i+1].setFullName(students[i].getFullName());
                students[i+1].setBirthDate(students[i].getBirthDate());
                students[i+1].setAvgMark(students[i].getAvgMark());
            }
            students[index]= new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.setAvgMark());
        }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
