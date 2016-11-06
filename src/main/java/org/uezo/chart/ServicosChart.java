package org.uezo.chart;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
public class ServicosChart implements Serializable{

	private static final long serialVersionUID = 1L;
	private PieChartModel pieModel1;
 
    @PostConstruct
    public void init() {
        createPieModels();
    }
 
    public PieChartModel getPieModel1() {
        return pieModel1;
    }
     

     
    private void createPieModels() {
        createPieModel1();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
         
        pieModel1.set("Troca de Pneu", 540);
        pieModel1.set("Limpeza de Motor", 325);
        pieModel1.set("Pintura", 702);
        pieModel1.set("Ret�fica", 421);
         
        pieModel1.setTitle("Servi�os");
        pieModel1.setShowDataLabels(true);
        pieModel1.setLegendPosition("w");
    }
    
}
