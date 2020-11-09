class Temperature{
		public static float temp(float c){
			float f=(c*9/5)+32;
			return f;
		}
		public static void main(String []args){
			float c = 37.0f;
			float t = Temperature.temp(c);
			System.out.println("temperature is "+" "+t);
		}
}