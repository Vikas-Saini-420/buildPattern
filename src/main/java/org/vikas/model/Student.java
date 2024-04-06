package org.vikas.model;

import lombok.Getter;

@Getter
public class Student {
    // create final variables firstname, lastname , age, rollno, gender, marks, grade, address, phone, email, dob, photo, fathername, mothername, parentphone, parentemail, parentaddress, parentphoto, class, section, facebookprofilelink, instagramprofilelink, twitterprofilelink, linkedinprofilelink, website, created_at, updated_at

    private final String firstname;
    private final String lastname;
    private final String age;
    private final String rollno;
    private final String gender;
    private final String marks;
    private final String grade;
    private final String address;
    private final String phone;
    private final String email;
    private final String dob;
    private final String photo;
    private final String fathername;
    private final String mothername;
    private final String parentphone;
    private final String parentemail;
    private final String parentaddress;
    private final String parentphoto;
    private final String classs;
    private final String section;
    private final String facebookprofilelink;
    private final String instagramprofilelink;
    private final String twitterprofilelink;
    private final String linkedinprofilelink;
    private final String website;
    private final String created_at;
    private final String updated_at;

    // create toString()
    public String toString() {
        return "firstname : "+ this.firstname +
                "lastname :" + this.lastname +
                "age :" + this.age +
                "rollno :" + this.rollno +
                "gender :" + this.gender +
                "marks :" + this.marks +
                "grade :" + this.grade +
                "address :" + this.address +
                "phone :" + this.phone +
                "email :" + this.email +
                "dob :" + this.dob +
                "photo :" + this.photo +
                "fathername :" + this.fathername +
                "mothername :" + this.mothername +
                "parentphone :" + this.parentphone +
                "parentemail :" + this.parentemail +
                "parentaddress :" + this.parentaddress +
                "parentphoto :" + this.parentphoto +
                "class :" + this.classs +
                "section :" + this.section +
                "facebookprofilelink :" + this.facebookprofilelink +
                "instagramprofilelink :" + this.instagramprofilelink +
                "twitterprofilelink :" + this.twitterprofilelink +
                "linkedinprofilelink :" + this.linkedinprofilelink +
                "website :" + this.website +
                "created_at :" + this.created_at +
                "updated_at :" + this.updated_at;
    }
    // implement builder pattern to instantiate the object

    private Student(StudentBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.rollno = builder.rollno;
        this.gender = builder.gender;
        this.marks = builder.marks;
        this.grade = builder.grade;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.dob = builder.dob;
        this.photo = builder.photo;
        this.fathername = builder.fathername;
        this.mothername = builder.mothername;
        this.parentphone = builder.parentphone;
        this.parentemail = builder.parentemail;
        this.parentaddress = builder.parentaddress;
        this.parentphoto = builder.parentphoto;
        this.classs = builder.classs;
        this.section = builder.section;
        this.facebookprofilelink = builder.facebookprofilelink;
        this.instagramprofilelink = builder.instagramprofilelink;
        this.twitterprofilelink = builder.twitterprofilelink;
        this.linkedinprofilelink = builder.linkedinprofilelink;
        this.website = builder.website;
        this.created_at = builder.created_at;
        this.updated_at = builder.updated_at;
    }
    public static class StudentBuilder {
        private String firstname;
        private String lastname;
        private String age;
        private String rollno;
        private String gender;
        private String marks;
        private String grade;
        private String address;
        private String phone;
        private String email;
        private String dob;
        private String photo;
        private String fathername;
        private String mothername;
        private String parentphone;
        private String parentemail;
        private String parentaddress;
        private String parentphoto;
        private String classs;
        private String section;
        private String facebookprofilelink;
        private String instagramprofilelink;
        private String twitterprofilelink;
        private String linkedinprofilelink;
        private String website;
        private String created_at;
        private String updated_at;

        public StudentBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public StudentBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public StudentBuilder withRollno(String rollno) {
            this.rollno = rollno;
            return this;
        }

        public StudentBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder withMarks(String marks) {
            this.marks = marks;
            return this;
        }

        public StudentBuilder withGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder withDob(String dob) {
            this.dob = dob;
            return this;
        }

        public StudentBuilder withPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public StudentBuilder withFathername(String fathername) {
            this.fathername = fathername;
            return this;
        }

        public StudentBuilder withMothername(String mothername) {
            this.mothername = mothername;
            return this;
        }

        public StudentBuilder withParentphone(String parentphone) {
            this.parentphone = parentphone;
            return this;
        }

        public StudentBuilder withParentemail(String parentemail) {
            this.parentemail = parentemail;
            return this;
        }

        public StudentBuilder withParentaddress(String parentaddress) {
            this.parentaddress = parentaddress;
            return this;
        }

        public StudentBuilder withParentphoto(String parentphoto) {
            this.parentphoto = parentphoto;
            return this;
        }

        public StudentBuilder withClasss(String classs) {
            this.classs = classs;
            return this;
        }

        public StudentBuilder withSection(String section) {
            this.section = section;
            return this;
        }

        public StudentBuilder withFacebookprofilelink(String facebookprofilelink) {
            this.facebookprofilelink = facebookprofilelink;
            return this;
        }

        public StudentBuilder withInstagramprofilelink(String instagramprofilelink) {
            this.instagramprofilelink = instagramprofilelink;
            return this;
        }

        public StudentBuilder withTwitterprofilelink(String twitterprofilelink) {
            this.twitterprofilelink = twitterprofilelink;
            return this;
        }

        public StudentBuilder withLinkedinprofilelink(String linkedinprofilelink) {
            this.linkedinprofilelink = linkedinprofilelink;
            return this;
        }

        public StudentBuilder withWebsite(String website) {
            this.website = website;
            return this;
        }

        public StudentBuilder withCreated_at(String created_at) {
            this.created_at = created_at;
            return this;
        }

        public StudentBuilder withUpdated_at(String updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Student build() {
            Student student = new Student(this);

            // validate firstname, lastname, fathername, mothername, age, class, section, rollno
            if (student.getFirstname().isBlank()) {
                throw new IllegalStateException("firstname cannot be blank");
            }
            if (student.getLastname().isBlank()) {
                throw new IllegalStateException("lastname cannot be blank");
            }
            if (student.getFathername().isBlank()) {
                throw new IllegalStateException("fathername cannot be blank");
            }
            if (student.getMothername().isBlank()) {
                throw new IllegalStateException("mothername cannot be blank");
            }
            if (student.getAge().isBlank()) {
                throw new IllegalStateException("age cannot be blank");
            }
            if (student.getClasss().isBlank()) {
                throw new IllegalStateException("class cannot be blank");
            }
            if (student.getSection().isBlank()) {
                throw new IllegalStateException("section cannot be blank");
            }
            if (student.getRollno().isBlank()) {
                throw new IllegalStateException("rollno cannot be blank");
            }

            return student;
        }
    }

}
