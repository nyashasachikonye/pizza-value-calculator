public class Pizza{
         private int cost;
         private float diameter;
         String name;
			
			public Pizza(){
			
			}
			
			public Pizza(int pizzaCost, int pizzaDiameter, String pizzaName){
			cost = pizzaCost;
			diameter = pizzaDiameter;
			name = pizzaName;
			}
			public float getValue(){
			int area = (int)(((diameter*diameter)/4)*Math.PI);
			return (cost/area);
			}
			public String getName(){
			return name;
			}
			}