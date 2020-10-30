package length;

public class sizeController {
	

	public Float getFootLength() {
		return footLength;
	}

	public void setFootLength(Float footLength) {
		this.footLength = footLength;
	}

	public Float getHeadRound() {
		return headRound;
	}

	public void setHeadRound(Float headRound) {
		this.headRound = headRound;
	}

	public Float getTopSize() {
		return topSize;
	}

	public void setTopSize(Float topSize) {
		this.topSize = topSize;
	}

	public Float getKeyLength() {
		return keyLength;
	}

	public void setKeyLength(Float keyLength) {
		this.keyLength = keyLength;
	}

	public Float getArmLength() {
		return armLength;
	}

	public void setArmLength(Float armLength) {
		this.armLength = armLength;
	}

	public Float getBottomSize() {
		return bottomSize;
	}

	public void setBottomSize(Float bottomSize) {
		this.bottomSize = bottomSize;
	}

	public Float getHeapRound() {
		return heapRound;
	}

	public void setHeapRound(Float heapRound) {
		this.heapRound = heapRound;
	}
	private Float footLength; //발길이
	private Float headRound; //머리둘레
	private Float topSize; //일반복 상의
	private Float keyLength; //키
	private Float armLength; //팔길이
	private Float bottomSize; //일반복 하의
	private Float heapRound; //엉덩이 둘레
	 
	/*private float f_footLength = Float.parseFloat(footLength);
	private float f_headRound = Float.parseFloat(headRound);//머리둘레
	private float f_topSize = Float.parseFloat(topSize); //일반복 상의
	private float f_Length = Float.parseFloat(Length);//키
	private float f_armLength = Float.parseFloat(armLength); //팔길이
	private float f_bottomSize= Float.parseFloat(bottomSize); //일반복 하의
	private float f_heapRound = Float.parseFloat(heapRound); //엉덩이 둘레*/
	
	
	public String getHead() 
	{
		
		String Head;
		if(headRound<40) {
			Head = "맞춤(소두)";
		}else if(headRound>40 && headRound <51.5) {
			Head = "51호";
		}else if(headRound >= 51.5 && headRound < 52.5) {
			Head = "52호";
		}else if(headRound >= 52.5 && headRound < 53.5) {
			Head = "53호";
		}else if(headRound >= 53.5 && headRound < 54.5) {
			Head = "54호";
		}else if(headRound >= 54.5 && headRound < 55.5) {
			Head = "55호";
		}else if(headRound >= 55.5 && headRound < 56.5) {
			Head = "56호";
		}else if(headRound >= 56.5 && headRound < 57.5) {
			Head = "57호";
		}else if(headRound >= 57.5 && headRound < 58.5) {
			Head = "58호";
		}else if(headRound >= 58.5 && headRound < 59.5) {
			Head = "59호";
		}else if(headRound >= 59.5 && headRound < 60.5) {
			Head = "60호";
		}else if(headRound >= 60.5 && headRound < 61.5) {
			Head = "61호";
		}else {
			Head = "맞춤(대두)";
		}
		
		return Head;
	}
	
	public String getTop() 
	{
		String Top="dd";

		
 
		if(topSize==90 && keyLength <171 && armLength < 58.7) {
			Top = "90-168-M";
		}else if(topSize==90 && keyLength <171 && armLength >= 58.7) {
			Top = "95-168-M";
		}else if(topSize==95 && keyLength <171 && armLength < 58) {
			Top = "95-168-M";
		}else if(topSize==95 && keyLength <171 && armLength >= 58) {
			Top = "100-168-M";
		}else if(topSize==100 && keyLength <171 && armLength < 57.3) {
			Top = "100-168-M";
		}else if(topSize==100 && keyLength <171 && armLength >= 57.3) {
			Top = "105-168-M";
		}else if(topSize==105 && keyLength <171 && armLength < 56.6) {
			Top = "105-168-M";
		}else if(topSize==105 && keyLength <171 && armLength >= 56.6) {
			Top = "100-173-M";
		}else if(topSize==90 && keyLength >=171 && keyLength >177 && armLength < 60.3) {
			Top = "90-173-M";
		}else if(topSize==90 && keyLength >=171 && keyLength >177 && armLength >= 60.3) {
			Top = "95-173-M";
		}else if(topSize==95 && keyLength >=171 && keyLength >177 && armLength < 59.6) {
			Top = "95-173-M";
		}else if(topSize==95 && keyLength >=171 && keyLength >177 && armLength >= 59.6) {
			Top = "100-173-M";
		}else if(topSize==100 && keyLength >=171 && keyLength >177 && armLength < 58.9) {
			Top = "100-173-M";
		}else if(topSize==100 && keyLength >=171 && keyLength >177 && armLength >= 58.9) {
			Top = "105-173-M";
		}else if(topSize==105 && keyLength >=171 && keyLength >177 && armLength < 58.2) {
			Top = "105-173-M";
		}else if(topSize==105 && keyLength >=171 && keyLength >177 && armLength >= 58.3) {
			Top = "110-173-M";
		}else if(topSize==110 && keyLength >=171 && keyLength >177 && armLength < 57.5) {
			Top = "110-173-M";
		}else if(topSize==110 && keyLength >=171 && keyLength >177 && armLength >= 57.5) {
			Top = "105-178-M";
		}else if(topSize==90 && keyLength >=177 && keyLength >183 && armLength <61.9) {
			Top = "90-178-M";
		}else if(topSize==90 && keyLength >=171 && keyLength >183 && armLength >= 61.9) {
			Top = "95-178-M";
		}else if(topSize==95 && keyLength >=171 && keyLength >183 && armLength < 61.2) {
			Top = "95-178-M";
		}else if(topSize==95 && keyLength >=171 && keyLength >183 && armLength >= 61.2) {
			Top = "100-178-M";
		}else if(topSize==100 && keyLength >=171 && keyLength >183 && armLength < 60.5) {
			Top = "100-178-M";
		}else if(topSize==100 && keyLength >=171 && keyLength >183 && armLength >= 60.5) {
			Top = "105-178-M";
		}else if(topSize==105 && keyLength >=171 && keyLength >183 && armLength < 59.8) {
			Top = "105-178-M";
		}else if(topSize==105 && keyLength >=171 && keyLength >183 && armLength >= 59.8) {
			Top = "110-178-M";
		}else if(topSize==110 && keyLength >=171 && keyLength >183 && armLength < 59.1) {
			Top = "110-178-M";
		}else if(topSize==110 && keyLength >=171 && keyLength >183 && armLength >= 59.1) {
			Top = "110-185-M";
		}else if(topSize==90 && keyLength >=183 && armLength <66.1) {
			Top = "90-185-M";
		}else if(topSize==90 && keyLength >=183 && armLength >= 66.1) {
			Top = "95-185-M";
		}else if(topSize==95 && keyLength >=183 && armLength < 65.5) {
			Top = "95-185-M";
		}else if(topSize==95 && keyLength >=183 && armLength >=65.5) {
			Top = "100-185-M";
		}else if(topSize==100 && keyLength >=183&& armLength < 64.8) {
			Top = "100-185-M";
		}else if(topSize==100 && keyLength >=183&& armLength >= 64.8) {
			Top = "105-185-M";
		}else if(topSize==105 && keyLength >=183 && armLength < 64.1) {
			Top = "105-185-M";
		}else if(topSize==105 && keyLength >=183 && armLength >= 64.1) {
			Top = "110-185-M";
		}else if(topSize==110 && keyLength >=183 && armLength < 63.4) {
			Top = "110-185-M";
		}else if(topSize==110 && keyLength >=183 && armLength >= 63.4) {
			Top = "115-185-M";
		}else if(topSize==115 && keyLength >=183 && armLength < 62.7) {
			Top = "115-185-M";
		}else if(topSize==115 && keyLength >=183 && armLength >= 62.7) {
			Top = "115-185-M";
		}else {
			Top="맞춤복";
		}
		return Top;
	}
	
	public String getBottom() 
	{
		String Bottom;
		
		
		if(bottomSize==29 || bottomSize==30 && keyLength <171 && heapRound < 101) {
			Bottom = "75-168-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength <171 && heapRound >= 101) {
			Bottom = "80-168-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <171 && heapRound < 104.4) {
			Bottom = "80-168-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <171 && heapRound >= 104.4) {
			Bottom = "85-168-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <171 && heapRound < 107.8) {
			Bottom = "85-168-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <171 && heapRound >= 107.8) {
			Bottom = "90-168-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <171 && heapRound < 111.2) {
			Bottom = "90-168-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <171 && heapRound >= 111.2) {
			Bottom = "95-173-M";
		}else if(bottomSize==26 || bottomSize==27 || bottomSize==28 && keyLength <177 && heapRound < 97.9) {
			Bottom = "70-173-M";
		}else if(bottomSize==26 || bottomSize==27 || bottomSize==28 && keyLength <177 && heapRound >= 97.9) {
			Bottom = "75-168-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength <177 && heapRound < 101.2) {
			Bottom = "75-173-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength <177 && heapRound >= 101.2) {
			Bottom = "80-173-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <177 && heapRound < 104.6) {
			Bottom = "80-173-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <177 && heapRound >= 104.6) {
			Bottom = "85-173-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <177 && heapRound < 107.9) {
			Bottom = "85-173-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <177 && heapRound >= 107.9) {
			Bottom = "90-173-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength <177 && heapRound < 111.3) {
			Bottom = "90-173-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength <177 && heapRound >= 111.3) {
			Bottom = "95-173-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength <177 && heapRound < 114.6) {
			Bottom = "95-173-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength <177 && heapRound >= 114.6) {
			Bottom = "100-173-M";
		}else if(bottomSize==39 || bottomSize==40 || bottomSize==41 || bottomSize==42 ||bottomSize==43  && keyLength <177 && heapRound < 117.9) {
			Bottom = "100-173-M";
		}else if(bottomSize==39 || bottomSize==40 || bottomSize==41 || bottomSize==42 ||bottomSize==43  && keyLength <177 && heapRound >= 117.9) {
			Bottom = "105-178-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength <183 && heapRound < 101.3) {
			Bottom = "75-178-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength <183 && heapRound >= 101.3) {
			Bottom = "80-178-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <183 && heapRound < 104.7) {
			Bottom = "80-178-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength <183 && heapRound >= 104.7) {
			Bottom = "85-178-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <183 && heapRound < 108) {
			Bottom = "85-178-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength <183 && heapRound >= 108) {
			Bottom = "90-178-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength <183 && heapRound < 111.3) {
			Bottom = "90-178-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength <183 && heapRound >= 111.3) {
			Bottom = "95-178-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength <183 && heapRound < 114.7) {
			Bottom = "95-178-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength <183 && heapRound >= 114.7) {
			Bottom = "100-178-M";
		}else if(bottomSize==39 || bottomSize==40 && keyLength <183 && heapRound < 118) {
			Bottom = "100-178-M";
		}else if(bottomSize==39 || bottomSize==40 && keyLength <183 && heapRound >= 118) {
			Bottom = "105-178-M";
		}else if( bottomSize==41 || bottomSize==42 ||bottomSize==43  && keyLength <183 && heapRound < 121.3) {
			Bottom = "105-178-M";
		}else if( bottomSize==41 || bottomSize==42 ||bottomSize==43  && keyLength <183 && heapRound >= 121.3) {
			Bottom = "105-185-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength >=183 && heapRound < 101.7) {
			Bottom = "75-185-M";
		}else if(bottomSize==29 || bottomSize==30 && keyLength >=183 && heapRound >= 101.7) {
			Bottom = "80-185-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength >=183 && heapRound < 105) {
			Bottom = "80-185-M";
		}else if(bottomSize==31 || bottomSize==32 && keyLength >=183 && heapRound >= 105) {
			Bottom = "85-185-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength >=183 && heapRound < 108.4) {
			Bottom = "85-185-M";
		}else if(bottomSize==33 || bottomSize==34 && keyLength >=183 && heapRound >= 108.4) {
			Bottom = "90-185-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength >=183 && heapRound < 111.7) {
			Bottom = "90-185-M";
		}else if(bottomSize==35 || bottomSize==36 && keyLength >=183 && heapRound >= 111.7) {
			Bottom = "95-185-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength >=183 && heapRound < 115) {
			Bottom = "95-185-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength >=183 && heapRound >= 115) {
			Bottom = "100-185-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength >=183 && heapRound <118.4) {
			Bottom = "100-185-M";
		}else if(bottomSize==37 || bottomSize==38 && keyLength >=183 && heapRound >= 118.4) {
			Bottom = "100-185-M";
		}else {
			Bottom="맞춤복";
		}
		return Bottom;
	}
	public String getFoot() 
	{
		
		String Foot;
		if(footLength==225) {
			Foot = "230mm";
		}else if(footLength==230) {
			Foot = "235mm";
		}else if(footLength==235) {
			Foot = "240mm";
		}else if(footLength==240) {
			Foot = "245mm";
		}else if(footLength==245) {
			Foot = "250mm";
		}else if(footLength==250) {
			Foot = "255mm";
		}else if(footLength==255) {
			Foot = "260mm";
		}else if(footLength==260) {
			Foot = "265mm";
		}else if(footLength==265) {
			Foot = "270mm";
		}else if(footLength==270) {
			Foot = "275mm";
		}else if(footLength==275) {
			Foot = "280mm";
		}else if(footLength==280) {
			Foot = "285mm";
		}else if(footLength==285) {
			Foot = "290mm";
		}else if(footLength==290) {
			Foot = "295mm";
		}else if(footLength==295) {
			Foot = "300mm";
		}else if(footLength==300) {
			Foot = "305mm";
		}else if(footLength==305) {
			Foot = "310mm";
		}else if(footLength==310) {
			Foot = "315mm";
		}else if(footLength==315) {
			Foot = "320mm";
		}else if(footLength==320) {
			Foot = "325mm";
		}else {
			Foot = "맞춤화";
		}
		
		return Foot;
	}
	/*
	 * public String getFootLength() { return footLength; } public void
	 * setFootLength(String footLength) { this.footLength = footLength; } public
	 * String getHeadRound() { return headRound; } public void setHeadRound(String
	 * headRound) { this.headRound = headRound; } public String getTopSize() {
	 * return topSize; } public void setTopSize(String topSize) { this.topSize =
	 * topSize; } public String getArmLength() { return armLength; } public void
	 * setArmLength(String armLength) { this.armLength = armLength; } public String
	 * getBottomSize() { return bottomSize; } public void setBottomSize(String
	 * bottomSize) { this.bottomSize = bottomSize; } public String getHeapRound() {
	 * return heapRound; } public void setHeapRound(String heapRound) {
	 * this.heapRound = heapRound; } public String getKeyLength() { return
	 * keyLength; } public void setKeyLength(String keyLength) { this.keyLength =
	 * keyLength; }
	 * 
	 * private String footLength; //발길이 private String headRound; //머리둘레 private
	 * String topSize; //일반복 상의 private String keyLength; //키 private String
	 * armLength; //팔길이 private String bottomSize; //일반복 하의 private String
	 * heapRound; //엉덩이 둘레
	 * 
	 * private float f_footLength = Float.parseFloat(footLength); private float
	 * f_headRound = Float.parseFloat(headRound);//머리둘레 private float f_topSize =
	 * Float.parseFloat(topSize); //일반복 상의 private float f_Length =
	 * Float.parseFloat(Length);//키 private float f_armLength =
	 * Float.parseFloat(armLength); //팔길이 private float f_bottomSize=
	 * Float.parseFloat(bottomSize); //일반복 하의 private float f_heapRound =
	 * Float.parseFloat(heapRound); //엉덩이 둘레
	 * 
	 * 
	 * public String getHead() { float f_headRound;
	 * f_headRound=Float.parseFloat(headRound); String Head; if(f_headRound<40) {
	 * Head = "맞춤(소두)"; }else if(f_headRound>40 && f_headRound <51.5) { Head =
	 * "51호"; }else if(f_headRound >= 51.5 && f_headRound < 52.5) { Head = "52호";
	 * }else if(f_headRound >= 52.5 && f_headRound < 53.5) { Head = "53호"; }else
	 * if(f_headRound >= 53.5 && f_headRound < 54.5) { Head = "54호"; }else
	 * if(f_headRound >= 54.5 && f_headRound < 55.5) { Head = "55호"; }else
	 * if(f_headRound >= 55.5 && f_headRound < 56.5) { Head = "56호"; }else
	 * if(f_headRound >= 56.5 && f_headRound < 57.5) { Head = "57호"; }else
	 * if(f_headRound >= 57.5 && f_headRound < 58.5) { Head = "58호"; }else
	 * if(f_headRound >= 58.5 && f_headRound < 59.5) { Head = "59호"; }else
	 * if(f_headRound >= 59.5 && f_headRound < 60.5) { Head = "60호"; }else
	 * if(f_headRound >= 60.5 && f_headRound < 61.5) { Head = "61호"; }else { Head =
	 * "맞춤(대두)"; }
	 * 
	 * return Head; }
	 * 
	 * public String getTop() { String Top="dd";
	 * 
	 * float f_topSize=Float.parseFloat(topSize); float
	 * f_Length=Float.parseFloat(keyLength); float
	 * f_armLength=Float.parseFloat(armLength);
	 * 
	 * if(f_topSize==90 && f_Length <171 && f_armLength < 58.7) { Top = "90-168-M";
	 * }else if(f_topSize==90 && f_Length <171 && f_armLength >= 58.7) { Top =
	 * "95-168-M"; }else if(f_topSize==95 && f_Length <171 && f_armLength < 58) {
	 * Top = "95-168-M"; }else if(f_topSize==95 && f_Length <171 && f_armLength >=
	 * 58) { Top = "100-168-M"; }else if(f_topSize==100 && f_Length <171 &&
	 * f_armLength < 57.3) { Top = "100-168-M"; }else if(f_topSize==100 && f_Length
	 * <171 && f_armLength >= 57.3) { Top = "105-168-M"; }else if(f_topSize==105 &&
	 * f_Length <171 && f_armLength < 56.6) { Top = "105-168-M"; }else
	 * if(f_topSize==105 && f_Length <171 && f_armLength >= 56.6) { Top =
	 * "100-173-M"; }else if(f_topSize==90 && f_Length >=171 && f_Length >177 &&
	 * f_armLength < 60.3) { Top = "90-173-M"; }else if(f_topSize==90 && f_Length
	 * >=171 && f_Length >177 && f_armLength >= 60.3) { Top = "95-173-M"; }else
	 * if(f_topSize==95 && f_Length >=171 && f_Length >177 && f_armLength < 59.6) {
	 * Top = "95-173-M"; }else if(f_topSize==95 && f_Length >=171 && f_Length >177
	 * && f_armLength >= 59.6) { Top = "100-173-M"; }else if(f_topSize==100 &&
	 * f_Length >=171 && f_Length >177 && f_armLength < 58.9) { Top = "100-173-M";
	 * }else if(f_topSize==100 && f_Length >=171 && f_Length >177 && f_armLength >=
	 * 58.9) { Top = "105-173-M"; }else if(f_topSize==105 && f_Length >=171 &&
	 * f_Length >177 && f_armLength < 58.2) { Top = "105-173-M"; }else
	 * if(f_topSize==105 && f_Length >=171 && f_Length >177 && f_armLength >= 58.3)
	 * { Top = "110-173-M"; }else if(f_topSize==110 && f_Length >=171 && f_Length
	 * >177 && f_armLength < 57.5) { Top = "110-173-M"; }else if(f_topSize==110 &&
	 * f_Length >=171 && f_Length >177 && f_armLength >= 57.5) { Top = "105-178-M";
	 * }else if(f_topSize==90 && f_Length >=177 && f_Length >183 && f_armLength
	 * <61.9) { Top = "90-178-M"; }else if(f_topSize==90 && f_Length >=171 &&
	 * f_Length >183 && f_armLength >= 61.9) { Top = "95-178-M"; }else
	 * if(f_topSize==95 && f_Length >=171 && f_Length >183 && f_armLength < 61.2) {
	 * Top = "95-178-M"; }else if(f_topSize==95 && f_Length >=171 && f_Length >183
	 * && f_armLength >= 61.2) { Top = "100-178-M"; }else if(f_topSize==100 &&
	 * f_Length >=171 && f_Length >183 && f_armLength < 60.5) { Top = "100-178-M";
	 * }else if(f_topSize==100 && f_Length >=171 && f_Length >183 && f_armLength >=
	 * 60.5) { Top = "105-178-M"; }else if(f_topSize==105 && f_Length >=171 &&
	 * f_Length >183 && f_armLength < 59.8) { Top = "105-178-M"; }else
	 * if(f_topSize==105 && f_Length >=171 && f_Length >183 && f_armLength >= 59.8)
	 * { Top = "110-178-M"; }else if(f_topSize==110 && f_Length >=171 && f_Length
	 * >183 && f_armLength < 59.1) { Top = "110-178-M"; }else if(f_topSize==110 &&
	 * f_Length >=171 && f_Length >183 && f_armLength >= 59.1) { Top = "110-185-M";
	 * }else if(f_topSize==90 && f_Length >=183 && f_armLength <66.1) { Top =
	 * "90-185-M"; }else if(f_topSize==90 && f_Length >=183 && f_armLength >= 66.1)
	 * { Top = "95-185-M"; }else if(f_topSize==95 && f_Length >=183 && f_armLength <
	 * 65.5) { Top = "95-185-M"; }else if(f_topSize==95 && f_Length >=183 &&
	 * f_armLength >=65.5) { Top = "100-185-M"; }else if(f_topSize==100 && f_Length
	 * >=183&& f_armLength < 64.8) { Top = "100-185-M"; }else if(f_topSize==100 &&
	 * f_Length >=183&& f_armLength >= 64.8) { Top = "105-185-M"; }else
	 * if(f_topSize==105 && f_Length >=183 && f_armLength < 64.1) { Top =
	 * "105-185-M"; }else if(f_topSize==105 && f_Length >=183 && f_armLength >=
	 * 64.1) { Top = "110-185-M"; }else if(f_topSize==110 && f_Length >=183 &&
	 * f_armLength < 63.4) { Top = "110-185-M"; }else if(f_topSize==110 && f_Length
	 * >=183 && f_armLength >= 63.4) { Top = "115-185-M"; }else if(f_topSize==115 &&
	 * f_Length >=183 && f_armLength < 62.7) { Top = "115-185-M"; }else
	 * if(f_topSize==115 && f_Length >=183 && f_armLength >= 62.7) { Top =
	 * "115-185-M"; }else { Top="맞춤복"; } return Top; }
	 * 
	 * public String getBottom() { String Bottom;
	 * 
	 * float f_bottomSize=Float.parseFloat(bottomSize); float
	 * f_Length=Float.parseFloat(keyLength); float
	 * f_heapRound=Float.parseFloat(heapRound);
	 * 
	 * if(f_bottomSize==29 || f_bottomSize==30 && f_Length <171 && f_heapRound <
	 * 101) { Bottom = "75-168-M"; }else if(f_bottomSize==29 || f_bottomSize==30 &&
	 * f_Length <171 && f_heapRound >= 101) { Bottom = "80-168-M"; }else
	 * if(f_bottomSize==31 || f_bottomSize==32 && f_Length <171 && f_heapRound <
	 * 104.4) { Bottom = "80-168-M"; }else if(f_bottomSize==31 || f_bottomSize==32
	 * && f_Length <171 && f_heapRound >= 104.4) { Bottom = "85-168-M"; }else
	 * if(f_bottomSize==33 || f_bottomSize==34 && f_Length <171 && f_heapRound <
	 * 107.8) { Bottom = "85-168-M"; }else if(f_bottomSize==33 || f_bottomSize==34
	 * && f_Length <171 && f_heapRound >= 107.8) { Bottom = "90-168-M"; }else
	 * if(f_bottomSize==33 || f_bottomSize==34 && f_Length <171 && f_heapRound <
	 * 111.2) { Bottom = "90-168-M"; }else if(f_bottomSize==33 || f_bottomSize==34
	 * && f_Length <171 && f_heapRound >= 111.2) { Bottom = "95-173-M"; }else
	 * if(f_bottomSize==26 || f_bottomSize==27 || f_bottomSize==28 && f_Length <177
	 * && f_heapRound < 97.9) { Bottom = "70-173-M"; }else if(f_bottomSize==26 ||
	 * f_bottomSize==27 || f_bottomSize==28 && f_Length <177 && f_heapRound >= 97.9)
	 * { Bottom = "75-168-M"; }else if(f_bottomSize==29 || f_bottomSize==30 &&
	 * f_Length <177 && f_heapRound < 101.2) { Bottom = "75-173-M"; }else
	 * if(f_bottomSize==29 || f_bottomSize==30 && f_Length <177 && f_heapRound >=
	 * 101.2) { Bottom = "80-173-M"; }else if(f_bottomSize==31 || f_bottomSize==32
	 * && f_Length <177 && f_heapRound < 104.6) { Bottom = "80-173-M"; }else
	 * if(f_bottomSize==31 || f_bottomSize==32 && f_Length <177 && f_heapRound >=
	 * 104.6) { Bottom = "85-173-M"; }else if(f_bottomSize==33 || f_bottomSize==34
	 * && f_Length <177 && f_heapRound < 107.9) { Bottom = "85-173-M"; }else
	 * if(f_bottomSize==33 || f_bottomSize==34 && f_Length <177 && f_heapRound >=
	 * 107.9) { Bottom = "90-173-M"; }else if(f_bottomSize==35 || f_bottomSize==36
	 * && f_Length <177 && f_heapRound < 111.3) { Bottom = "90-173-M"; }else
	 * if(f_bottomSize==35 || f_bottomSize==36 && f_Length <177 && f_heapRound >=
	 * 111.3) { Bottom = "95-173-M"; }else if(f_bottomSize==37 || f_bottomSize==38
	 * && f_Length <177 && f_heapRound < 114.6) { Bottom = "95-173-M"; }else
	 * if(f_bottomSize==37 || f_bottomSize==38 && f_Length <177 && f_heapRound >=
	 * 114.6) { Bottom = "100-173-M"; }else if(f_bottomSize==39 || f_bottomSize==40
	 * || f_bottomSize==41 || f_bottomSize==42 ||f_bottomSize==43 && f_Length <177
	 * && f_heapRound < 117.9) { Bottom = "100-173-M"; }else if(f_bottomSize==39 ||
	 * f_bottomSize==40 || f_bottomSize==41 || f_bottomSize==42 ||f_bottomSize==43
	 * && f_Length <177 && f_heapRound >= 117.9) { Bottom = "105-178-M"; }else
	 * if(f_bottomSize==29 || f_bottomSize==30 && f_Length <183 && f_heapRound <
	 * 101.3) { Bottom = "75-178-M"; }else if(f_bottomSize==29 || f_bottomSize==30
	 * && f_Length <183 && f_heapRound >= 101.3) { Bottom = "80-178-M"; }else
	 * if(f_bottomSize==31 || f_bottomSize==32 && f_Length <183 && f_heapRound <
	 * 104.7) { Bottom = "80-178-M"; }else if(f_bottomSize==31 || f_bottomSize==32
	 * && f_Length <183 && f_heapRound >= 104.7) { Bottom = "85-178-M"; }else
	 * if(f_bottomSize==33 || f_bottomSize==34 && f_Length <183 && f_heapRound <
	 * 108) { Bottom = "85-178-M"; }else if(f_bottomSize==33 || f_bottomSize==34 &&
	 * f_Length <183 && f_heapRound >= 108) { Bottom = "90-178-M"; }else
	 * if(f_bottomSize==35 || f_bottomSize==36 && f_Length <183 && f_heapRound <
	 * 111.3) { Bottom = "90-178-M"; }else if(f_bottomSize==35 || f_bottomSize==36
	 * && f_Length <183 && f_heapRound >= 111.3) { Bottom = "95-178-M"; }else
	 * if(f_bottomSize==37 || f_bottomSize==38 && f_Length <183 && f_heapRound <
	 * 114.7) { Bottom = "95-178-M"; }else if(f_bottomSize==37 || f_bottomSize==38
	 * && f_Length <183 && f_heapRound >= 114.7) { Bottom = "100-178-M"; }else
	 * if(f_bottomSize==39 || f_bottomSize==40 && f_Length <183 && f_heapRound <
	 * 118) { Bottom = "100-178-M"; }else if(f_bottomSize==39 || f_bottomSize==40 &&
	 * f_Length <183 && f_heapRound >= 118) { Bottom = "105-178-M"; }else if(
	 * f_bottomSize==41 || f_bottomSize==42 ||f_bottomSize==43 && f_Length <183 &&
	 * f_heapRound < 121.3) { Bottom = "105-178-M"; }else if( f_bottomSize==41 ||
	 * f_bottomSize==42 ||f_bottomSize==43 && f_Length <183 && f_heapRound >= 121.3)
	 * { Bottom = "105-185-M"; }else if(f_bottomSize==29 || f_bottomSize==30 &&
	 * f_Length >=183 && f_heapRound < 101.7) { Bottom = "75-185-M"; }else
	 * if(f_bottomSize==29 || f_bottomSize==30 && f_Length >=183 && f_heapRound >=
	 * 101.7) { Bottom = "80-185-M"; }else if(f_bottomSize==31 || f_bottomSize==32
	 * && f_Length >=183 && f_heapRound < 105) { Bottom = "80-185-M"; }else
	 * if(f_bottomSize==31 || f_bottomSize==32 && f_Length >=183 && f_heapRound >=
	 * 105) { Bottom = "85-185-M"; }else if(f_bottomSize==33 || f_bottomSize==34 &&
	 * f_Length >=183 && f_heapRound < 108.4) { Bottom = "85-185-M"; }else
	 * if(f_bottomSize==33 || f_bottomSize==34 && f_Length >=183 && f_heapRound >=
	 * 108.4) { Bottom = "90-185-M"; }else if(f_bottomSize==35 || f_bottomSize==36
	 * && f_Length >=183 && f_heapRound < 111.7) { Bottom = "90-185-M"; }else
	 * if(f_bottomSize==35 || f_bottomSize==36 && f_Length >=183 && f_heapRound >=
	 * 111.7) { Bottom = "95-185-M"; }else if(f_bottomSize==37 || f_bottomSize==38
	 * && f_Length >=183 && f_heapRound < 115) { Bottom = "95-185-M"; }else
	 * if(f_bottomSize==37 || f_bottomSize==38 && f_Length >=183 && f_heapRound >=
	 * 115) { Bottom = "100-185-M"; }else if(f_bottomSize==37 || f_bottomSize==38 &&
	 * f_Length >=183 && f_heapRound <118.4) { Bottom = "100-185-M"; }else
	 * if(f_bottomSize==37 || f_bottomSize==38 && f_Length >=183 && f_heapRound >=
	 * 118.4) { Bottom = "100-185-M"; }else { Bottom="맞춤복"; } return Bottom; }
	 * public String getFoot() { float f_footLength;
	 * f_footLength=Float.parseFloat(footLength); String Foot; if(f_footLength==225)
	 * { Foot = "230mm"; }else if(f_footLength==230) { Foot = "235mm"; }else
	 * if(f_footLength==235) { Foot = "240mm"; }else if(f_footLength==240) { Foot =
	 * "245mm"; }else if(f_footLength==245) { Foot = "250mm"; }else
	 * if(f_footLength==250) { Foot = "255mm"; }else if(f_footLength==255) { Foot =
	 * "260mm"; }else if(f_footLength==260) { Foot = "265mm"; }else
	 * if(f_footLength==265) { Foot = "270mm"; }else if(f_footLength==270) { Foot =
	 * "275mm"; }else if(f_footLength==275) { Foot = "280mm"; }else
	 * if(f_footLength==280) { Foot = "285mm"; }else if(f_footLength==285) { Foot =
	 * "290mm"; }else if(f_footLength==290) { Foot = "295mm"; }else
	 * if(f_footLength==295) { Foot = "300mm"; }else if(f_footLength==300) { Foot =
	 * "305mm"; }else if(f_footLength==305) { Foot = "310mm"; }else
	 * if(f_footLength==310) { Foot = "315mm"; }else if(f_footLength==315) { Foot =
	 * "320mm"; }else if(f_footLength==320) { Foot = "325mm"; }else { Foot = "맞춤화";
	 * }
	 * 
	 * return Foot; }
	 */

}
