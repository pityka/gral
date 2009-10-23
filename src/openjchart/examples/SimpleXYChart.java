package openjchart.examples;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import openjchart.charts.ScatterPlot;
import openjchart.data.DataMapper;
import openjchart.data.DataTable;

public class SimpleXYChart extends JFrame {

	public SimpleXYChart() {
		super("OpenJChartTest");
		/*final DataTable data = new DataTable(Integer.class, Integer.class);
		data.add(1, 1);
		data.add(2, 3);
		data.add(3, 2);
		data.add(4, 6);
		data.add(5, 4);
		data.add(6, 8);
		data.add(7, 9);
		data.add(8, 11);*/
		final DataTable data = new DataTable(Double.class, Double.class);
		/*data.add(-8.0, 2.07944154168);
		data.add(-7.0, 1.94591014906);
		data.add(-6.0, 1.79175946923);
		data.add(-5.0, 1.60943791243);
		data.add(-4.0, 1.38629436112);
		data.add(-3.0, 1.09861228867);
		data.add(-2.0, 0.69314718056);
		data.add(-1.0, 0.0);*/
		data.add(1.0, 0.0);
		data.add(2.0, 0.69314718056);
		data.add(3.0, 1.09861228867);
		data.add(4.0, 1.38629436112);
		data.add(5.0, 1.60943791243);
		data.add(6.0, 1.79175946923);
		data.add(7.0, 1.94591014906);
		data.add(8.0, 2.07944154168);
		DataMapper mapper = new DataMapper();
		mapper.put(DataMapper.X, 0);
		mapper.put(DataMapper.Y, 1);

		ScatterPlot chart = new ScatterPlot();
		// Custom shape
		//chart.setShape(new Ellipse2D.Double(-5.0, -5.0, 10, 10));
		// Custom shape coloring
		//chart.setShapeColor(Color.RED);
		// Grid disabled
		//chart.setGridEnabled(false);
		// Custom y-axis renderer
		//chart.setAxisXRenderer(new LogarithmicRenderer2D());
		//chart.setAxisYRenderer(new LogarithmicRenderer2D());
		final JComponent plotArea = chart.getChartRenderer(data, mapper);
		plotArea.setBorder(new EmptyBorder(20, 20, 20, 20));
		getContentPane().add(plotArea, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
	}

	public static void main(String[] args) {
		SimpleXYChart test = new SimpleXYChart();
		test.setVisible(true);
	}
}
