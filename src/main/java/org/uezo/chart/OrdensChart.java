package org.uezo.chart;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;

@ManagedBean
public class OrdensChart implements Serializable{

	private static final long serialVersionUID = 1L;
	private HorizontalBarChartModel horizontalBarModel;
 
    @PostConstruct
    public void init() {
        createBarModel();
    }
 

     
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
        
    private void createBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
        ChartSeries ordensDeServico = new ChartSeries();
        ordensDeServico.setLabel("Ordens de Serviço");
        ordensDeServico.set("Em execução", 15);
        ordensDeServico.set("Em avaliação", 20);
        ordensDeServico.set("Em andamento", 11);
        ordensDeServico.set("Entregue", 12);
        ordensDeServico.set("Cancelado", 7);
 
        horizontalBarModel.addSeries(ordensDeServico);
         
        horizontalBarModel.setTitle("Ordens de Serviço");
        horizontalBarModel.setStacked(true);
         
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Quantidade");
        xAxis.setMin(0);
        xAxis.setMax(50);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Status");        
    }
}
