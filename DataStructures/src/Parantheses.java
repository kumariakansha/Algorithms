
public class Parantheses {
	
	static class stack{
		int top=1;
		char array[] = new char[100];
		void push(char x){
			if(top==99){
				System.out.println("The stack is full");
			}
			else{
				array[++top]=x;
			}
		}
		char pop(){
			if(top==-1){
				System.out.println("The stack is empty");
				return '\0';
			}
			else{
				char temp= array[top];
				top--;
				return temp;
				
			}
			
		}
		boolean isEmpty(){
			if(top==-1) 
				return true;
			else 
				return false;
		}
	}
		static boolean isMatchingPair(char char1, char char2){
			if(char1=='(' && char2==')')
				return true;	
			else if(char1=='{' && char2 == '}')
				return true;
			else if (char1=='[' && char2 ==']')
				return true;
			else
				return false;
			
		}
		static boolean areParaBalanced(char exp[]){
			stack st= new stack();
			for(int i=0; i<exp.length;i++){
				if(exp[i]=='('|| exp[i]=='[' || exp[i]=='{')
					st.push(exp[i]);
				else if (exp[i]==')' || exp[i]=='}' || exp[i]==']'){
					if(st.isEmpty()){
						return false;
					}
					else if (!isMatchingPair(st.pop(),exp[i]))
						return false;
				}
			}
		if(st.isEmpty())
			return true;
		else 
			return false;
		
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp[] = {'{','(',')','}','[',']'}; 
        if (areParaBalanced(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");  
	}

}
