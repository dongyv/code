package abstractFactory.abs_linjian;
/**
 *   �����Ƿ���ʵ���˹�����
 * @author Administrator
 *
 */
public abstract class Factory {
	public static Factory getFactory(String classname){
		Factory factory = null;
		try{
			factory = (Factory)Class.forName(classname).newInstance();
		}catch(ClassNotFoundException e){
			System.err.println("û���ҵ�"+classname +"��");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public abstract Link createLink(String caption,String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title,String author);
}