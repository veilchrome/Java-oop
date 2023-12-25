
public class Team {
	Member member;
	public Team(Member member) { // Siapa yang ada di Tim?
		this.member = member; // satu 'anggota/member' di dalam team.
	}
	
	
	// dibawah line code ini adalah Main Method
	public static void main(String args[]) {
		Member myMember = new Member("Selamet", "Light", 5, 2);
		Team myTeam = new Team(myMember);
		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
		
		
		
		// Team 2
	}
}

class Member {
	private String name;
	private String type;
	private int level; // data type di sini
	private int rank; // ini juga tipe data sama kek atas
	
	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	
	// Setter and Getter
	
}
