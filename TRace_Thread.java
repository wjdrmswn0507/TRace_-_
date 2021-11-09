public class TRace_Thread implements Runnable{

    private int[] temp;
	
    public TRace_Thread(){
    	temp = new int[20];
		
		for(int start=0;start<temp.length;start++){
			temp[start]=start;
		}
    }
	
    //거북이 움직이는거 (물체확인) 구현하기ㄴ
    @Override
    public void run() {
	// TODO Auto-generated method stub
    	for(int start:temp){
    		try {
    			Thread.sleep(1000);
				
    		} catch (InterruptedException ie) {
    			ie.printStackTrace();
    			// TODO: handle exception
    		}
			//실행문
    		
			System.out.println("스레드이름:"+Thread.currentThread().getName());
			System.out.println("temp value :"+start);
    		
		}
    }
}