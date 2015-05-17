package com.myorg.javacourse.model;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.myorg.javacourse.model.Portfolio.ALGO_RECOMMENDATION;
/* this class represents a stock of stocks*/
public class Stock {

	private String symbol;
	private float ask,bid;
	private java.util.Date date;
	private ALGO_RECOMMENDATION recommendation;
	int stockQuantity;
	
	public Stock(String symbol, float ask,float bid,Date date)
	{
		this.symbol=symbol;
		this.ask=ask;
		this.bid=bid;
		this.date=date;
		this.recommendation = ALGO_RECOMMENDATION.HOLD;
		this.stockQuantity=0;
		
	}
	/* C'tors to Stock*/
	public Stock (Stock stock){
		this.setSymbol(new String (stock.getSymbol()));
		this.setAsk(stock.getAsk());
		this.setBid(stock.getBid());
		this.date=new Date(stock.getDate().getTime());
		this.recommendation=stock.getRecommendation();
		this.stockQuantity=stock.getStockQuantity();
	}
	public ALGO_RECOMMENDATION getRecommendation() {
		return recommendation;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getAsk() {
		return ask;
	}

	public void setAsk(float ask) {
		this.ask = ask;
	}

	public float getBid() {
		return bid;
	}

	public void setBid(float bid) {
		this.bid = bid;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	

	public void setRecommendation(ALGO_RECOMMENDATION recommendation) {
		this.recommendation = recommendation;
	}
public String getHtmlDescription(){
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dateStr = df.format(getDate());

		String ret= "<br>Stock symbol: </b>"+getSymbol()+" <b> ask: </b>"+getAsk()+"<b> bid: </b>"+getBid()+"<b> quantity: </b>"+getStockQuantity()+
				"<b> date: </b>"+ dateStr;
		return ret;
	
	}

	
}
