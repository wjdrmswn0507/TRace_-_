public class TRace_Thread implements Runnable{

    private int[] temp;
	
    public TRace_Thread(){
    	temp = new int[20];
		
		for(int start=0;start<temp.length;start++){
			temp[start]=start;
		}
    }
	
    //�ź��� �����̴°� (��üȮ��) �����ϱ⤤
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
			//���๮
    		
			System.out.println("�������̸�:"+Thread.currentThread().getName());
			System.out.println("temp value :"+start);
    		
		}
    }
}