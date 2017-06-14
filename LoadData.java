import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LoadData {
	public static void main(String[] args) {
		DataSource ds = new DataSource("dataset/titanic.arff");
		Instances data = source.getDataSet();
		System.out.println(data.numInstancces() + " instances loaded.");
		System.out.println(data.toString());
	}
}