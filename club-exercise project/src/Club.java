import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author Morgan dale
 * @version 1.0.0
 */
public class Club {
    // Define any necessary fields here ...
    private ArrayList<Member> members;

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        // Initialise any fields here ...
        members = new ArrayList<Member>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * 
     * @param member The member object to be added.
     */
    public void join(Member newMember) {
        members.add(newMember);
        System.out.println("New member added: " + newMember.getName());
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        return members.size();
    }

    public int joiedInMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        }

        int count = 0;
        for (Member member : members) {
            if (member.getMonth() == month) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Member> removedMembers (int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        }

        ArrayList<Member> removedMembers = new ArrayList<Member>();
        for (Member member : members) {
            if (member.getMonth() == month && member.getYear() == year) {
                removedMembers.add(member);
            }
        }

        members.removeAll(removedMembers);

        return removedMembers;
    }
}
