
class User {
        private String name = "A";
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

        void display(String message) {

                System.out.print(message);
        }
}

class Demo {

        public static void main(String[] args) {

                String name = "ABC";
                Isliongton obj = new Isliongton();
                obj.display("1");
                obj.display("5");

        }
}