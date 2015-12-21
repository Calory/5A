/* D0280286 */


/*
 * 
 * （Lab）在考試系統中，一個試卷可以只有一個題目，也可以包含其他試卷的題目，利用 Composite 如何來設計？
 * 假設一個題目的類別如下：
 * class Question {
 * String description;
 * public Question(String desc) {
 *    this.description = desc;
 *    }
 *    public void print() {
 *        System.out.println(desc);
 *     }      
 * }
 * 下載 https://www.sourcetreeapp.com/ 版本管理工具，並在 https://github.com 
中建立一個 open source 的專案，把你的程式碼 checkin 到你的 GitHub 中，注意必須
有超過 3 次的 commit。 
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

abstract class Questions {
	abstract void print();
}

public class Question extends Questions {

	public Question() {
		// TODO Auto-generated constructor stub
	}

	String description;

	public Question(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}

class exam extends Questions {
	private ArrayList<Questions> list;

	public exam() {
		list = new ArrayList<Questions>();
	}

	public void addQuestion(Questions questions) {
		list.add(questions);
	}

	public void print() {
		Iterator<Questions> iterator = list.iterator();
		while (iterator.hasNext()) {
			Questions c = iterator.next();
			c.print();
		}
	}

	
}
//client
class main{
	// TODO Auto-generated method stub
	void m1(Questions[] cc){
		for(Questions c : cc){
			c.print();
		}
	}
}