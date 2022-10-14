package TestProblem;

class Profile {
    private String name;
    private String addr;
    private String job;
    private String major;

    //1 디폴트 생성자 삽입
    public Profile() {

    }

    public Profile(String name, String addr, String job, String major) {
        this.name = name;
        this.addr = addr;
        this.job = job;
        this.major = major;
    }


    //2 모든 인자를 받는 생성자 삽입
    Profile(String all) {       //String all=" 홍길동,대구,프로그래머,컴퓨터공학 "
        //->all문자열 앞뒤 공백은 제거(trim())
        all = all.trim();     //all="홍길동,대구,프로그래머,컴퓨터공학"
        //->, 단위로 잘라내기(split(","))하여 각각의 값을
        String tmp[] = all.split(",");   //tmp = //["홍길동","대구","프로그래머","컴퓨터공학"]
        // tmp[0] == "홍길동", tmp[1] == "대구", tmp[2] == "프로그래머", tmp[3] == "컴퓨터공학",
        //name,addr,job,major에 저장할것(안되면 강사와 함께..배열을 사용..)
        name = tmp[0];
        addr = tmp[1];
        job = tmp[2];
        major = tmp[3];
    }

    boolean isContain(String findstr) {
        if (name.contains(findstr)) {
            System.out.println(findstr + "은 이름에 포함되어 있습니다.");
            return true;
        } else if (addr.contains(findstr)) {
            System.out.println(findstr + "은 주소에 포함되어 있습니다.");
            return true;
        } else if (job.contains(findstr)) {
            System.out.println(findstr + "은 직업에 포함되어 있습니다.");
            return true;
        } else if (major.contains(findstr)) {
            System.out.println(findstr + "은 전공에 포함되어 있습니다.");
            return true;
        }
        System.out.println(findstr + "은 해당 객체에 포함 X");
        return false;
        //findstr 의 문자열이 멤버인 name,addr,job,major 중 하나라도 포함되면 true 리턴
        //아니면 false 리턴
    }

    boolean isequals(String all) {
        //all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
        //name,addr,job,major 와 일치 하면 true
        //아니면 false 를 리턴
        all=all.trim();
        String tmp[] = all.split(","); // [홍길동,대구,프로그래머,컴퓨터공학]
        if (!name.equals(tmp[0])) {
            return false;
        } else if (!addr.equals(tmp[1])) {
            return false;
        } else if (!job.equals(tmp[2])) {
            return false;
        } else if (!major.equals(tmp[3])) {
            return false;
        }
        return true;
    };

    //4 toString() 재정의 코드 삽입
    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", job='" + job + '\'' +
                ", major='" + major + '\'' +
                '}';
    }


    //5 Getter and Setter 코드 삽입
    public String getName() {
        return name;
    }

    public Profile setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public Profile setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public String getJob() {
        return job;
    }

    public Profile setJob(String job) {
        this.job = job;
        return this;
    }

    public String getMajor() {
        return major;
    }

    public Profile setMajor(String major) {
        this.major = major;
        return this;
    }
}

public class Test {

    public static void main(String[] args) {
        Profile hong = new Profile(" 홍길동,대구,프로그래머,컴퓨터공학 ");

        //멤버 내용 출력
        System.out.println(hong.toString());

        System.out.println("길동 포함 여부 : " + hong.isContain("홍길동"));
        System.out.println("컴퓨터 포함 여부 : " + hong.isContain("컴퓨터"));
        System.out.println("프로필 일치 여부 : " + hong.isequals(" 홍길동,대구,프로그래머,컴퓨터공학 "));
        System.out.println("프로필 일치 여부 : " + hong.isequals(" 홍길동,울산,프로그래머,컴퓨터공학 "));
    }
}
