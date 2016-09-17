import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.muc.jxd.cluster.Cluster;
import edu.muc.jxd.distance.ImageDistence;
import edu.muc.jxd.item.ImageItemVector;
import edu.muc.jxd.tools.ToImageVec;

public class Main {

	@Test
	public void domain() {
		ImageItemVector<Number> item1 = new ImageItemVector<>();
		Integer[] data1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		item1.setData(data1);
		Integer[] data2 = { 0, 2, 1, 3, 4, 3, 6, 6, 1, 9 };
		ImageItemVector<Number> item2 = new ImageItemVector<>();
		item2.setData(data2);

		List<ImageItemVector<Number>> list = new ArrayList<>();
		list.add(item1);
		list.add(item2);

		ImageDistence distance = new ImageDistence();
		Cluster cluster = new Cluster(list, distance);
		System.out.println(cluster.getDelta().toString());
	}

	@Test
	public void testData() {
		ImageDistence distance = new ImageDistence();
		List<ImageItemVector<Number>> itemList = ToImageVec.getImageVec();
		System.out.println(itemList);
		Cluster cluster = new Cluster(itemList, distance);
		System.out.println("ItemList");
		System.out.println(cluster.getItemList().toString());
		System.out.println("p");
		System.out.println(cluster.getP().toString());
		System.out.println("Delta");
		System.out.println(cluster.getDelta().toString());
	}
}
