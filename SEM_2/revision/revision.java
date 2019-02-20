import javax.jws.soap.SOAPBinding.Use;

import com.sun.beans.introspect.PropertyInfo.Name;

class User {
        private String name = "B";
        private String profile;
        private String cover;
        private String add;
        String contact;

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        User(String name, String profile, String cover) {
                this.name = name;
                this.profile = profile;
                this.cover = cover;
                this.add = "";
                this.contact = "";
        }

}

class NewPerson extends User {

        NewPerson() {
                super("name", "profile", "cover");
                System.out.print(super.getName());
                System.out.print(super.contact);

        }
}

class Isliongton extends User {
        Isliongton() {
                super("name", "profile", "cover");
        }

        void display() {

                System.out.print("This is islington");
        }
}

class Demo {

        public static void main(String[] args) {

                Isliongton obj = new Isliongton();
                obj.display();

        }
}