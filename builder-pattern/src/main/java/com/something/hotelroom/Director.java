package com.something.hotelroom;

public class Director {
	HotelRoomBuilder roomBuilder;
	
	public Director(HotelRoomBuilder roomBuilder){
		super();
		this.roomBuilder = roomBuilder;
	}
	
	public HotelRoomBuilder getBuilder(){
		return roomBuilder;
	}
	
	public void setBuilder(HotelRoomBuilder roomBuilder){
		this.roomBuilder = roomBuilder;
	}
	
	public void build(String cityCode, String cityName, String countryCode, String countryName, String hotelcode,
			String hotelName, String roomCode, String roomName, String roomPrice){
		this.roomBuilder.buildRoom(cityCode, cityName, countryCode, countryName, hotelcode, hotelName,
				roomCode, roomName, roomPrice);
	}
}
