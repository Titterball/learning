public class Evaluate{
	public static void main(String[] args){
		Stack<String> ops=new Stack<String>();
		Stack<Double> vals=new Stack<Double>();
		while(!StdIn.isEmpty()){	//读取字符
			String s=StdIn.readString();
			if(s.equals("(")  ;
			else if(s.equals("+"))  ops.push(s);
			else if(s.equals("-"))  ops.push(s);
			else if(s.equals("*"))  ops.push(s);
			else if(s.equals("/"))  ops.push(s);
			else if(s.equals("sqrt"))  ops.push(s);
			else if(s.equals(")")){
				//如果为")"则弹出运算符和操作数，计算结果并压栈
				String op=ops.pop();
				Double v=vals.pop();
				if(op.equals("+"))  v=vals.pop()+v;
				else if(op.equals("-"))  v=vals.pop-v;
				else if(op.equals("*"))  v=vals.pop*v;
				else if(op.equals("/"))  v=vals.pop/v;
				else if(op.equals("sqrt"))  v=Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));//如果不是符号则将它作为double值压入栈
		}
		StdOut.println(vals.pop());
	}
}