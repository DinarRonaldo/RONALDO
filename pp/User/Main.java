public class Main {
	public static void main(String args[]) {
		User user1 = new User("Динар", UserRole.ADMIN, 19);
		User user2 = new User("Камиль Муртазин", UserRole.MODERATOR, 19);
		User user3 = new User("Азамат", UserRole.USER, 18);
		
		Action action = new Action() {
			@Override
			public void execute(User temp) {
				try {
					temp.checkAge();
					switch(temp.getUserRole()) {
						case MODERATOR:
							System.out.println("Имеет права модератора (старше 18 лет)");
							break;
						case ADMIN:
							System.out.println("Имеет права админа (старше 18 лет)");
							break;
						case USER:
							System.out.println("Имеет права обычного пользователя (старше 18 лет)");
							break;
					}
				}
				catch (IllegalArgumentException e) {
					System.out.println(temp.getUsername() + ": " + e.getMessage());
				}
			}
		};
		
		action.execute(user1);
		action.execute(user2);
		action.execute(user3);
	}
}