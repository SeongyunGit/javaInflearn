package construct;

public class MethodInitMain2 {


    public static void main(String[] args) {


        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);
        MemberInit member2 = new MemberInit();
        initMember(member2,"user2", 30,80);

        MemberInit[] members = {member1,member2};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 학점: " + member.grade);

        }

    }

    static void initMember(MemberInit memberInit,String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
