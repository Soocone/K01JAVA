package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle_t
{
    int width;  //가로길이
    int height; //세로길이
    
    //멤버변수가 2개이므로 인자가 2개인 생성자가 필요
    public Rectangle_t(int wi, int he) {
    	width = wi;
    	height = he;
    }
    
    //직사각형의 면적을 출력
    public void ShowAreaInfo(){
    	System.out.println("직사각형면적: "+(width * height));
    }
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square_t extends Rectangle_t
{
	/*
	 정사각형은 직사각형의 일종이고, 가로세로의 길이가
	 동일하므로 하나의 값으로 두개의 멤버변수를 초기화할 수 있다.
	 따라서 자식에서 멤버변수에 대한 확장도 필요없다.
	 */
    public Square_t(int width) {
    	super(width, width);
    }
    
    @Override
    public void ShowAreaInfo()
    {
    	System.out.println("정사각형면적: "+(width * height));
    }
} 

class QuRectangleMain_t {
	public static void main(String[] args) {
	   	Rectangle_t rec = new Rectangle_t(4, 3);
	   	rec.ShowAreaInfo();
	
		Square_t sqr = new Square_t(7);
	   	sqr.ShowAreaInfo();
 	}
}
