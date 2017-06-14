import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LoadData {
	public static void main(String[] args) throws Exception {
		//TODO Bajar el fichero .arff
		DataSource ds = new DataSource("dataset/titanic.arff");
		Instances data = ds.getDataSet();
		System.out.println(data.numInstances() + " instances loaded.");
		System.out.println(data.toString());
	}
}