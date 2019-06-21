class Restaurant{
		private String name;
		private String address;
		private String phone;
		public String getName(){
			return name;
		}
		public String getAddress(){
			return address;
		}
		public String getPhone(){
			return phone;
		}
		void setName(String name){
			this.name = name;
		}
		void setAddress(String address){
			this.address = address;
		}
		void setPhone(String phone){
			this.phone = phone;
		}

		public static void main(String args[]){
			Restaurant place = new Restaurant();
			place.setName("Mike's");
			place.setAddress("8100 Harry Rd");
			place.setPhone("2813388004");
			System.out.println("The new spot it called " + place.getName() + " and the address is " + place.getAddress() +
			". The phone number is " + place.getPhone());
		}

}





