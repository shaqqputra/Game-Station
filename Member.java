public class Member extends Customer {
    private String memberName;
    private String memberPhoneNumber;
    private String memberId;

    public Member() {

    }

    public Member(String memberName, String memberPhoneNumber, String memberId) {
        this.memberName = memberName;
        this.memberPhoneNumber = memberPhoneNumber;
        this.memberId = memberId;
    }

    
    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhoneNumber() {
        return this.memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

}
