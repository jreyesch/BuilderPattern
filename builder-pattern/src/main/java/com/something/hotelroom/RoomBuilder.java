package com.something.hotelroom;

import java.math.BigDecimal;

public class RoomBuilder implements HotelRoomBuilder{
	Room room;

	@Override
	public String setCityCode(String cityCode) {
		return cityCode;
	}

	@Override
	public String setCityName(String cityName) {
		return cityName;
	}

	@Override
	public String setCountryCode(String countryCode) {
		return countryCode;
	}

	@Override
	public String setCountryName(String countryName) {
		return countryName;
	}

	@Override
	public String setHotelCode(String hotelCode) {
		return hotelCode;
	}
	
	@Override
	public String setHotelName(String hotelName) {
		return hotelName;
	}

	@Override
	public String setRoomCode(String roomCode) {
		return roomCode;
	}

	@Override
	public String setRoomName(String roomName) {
		return roomName;
	}

	@Override
	public BigDecimal setRoomPrice(String roomPrice) {
		roomPrice = roomPrice.substring(0, roomPrice.length()-2) + "." + roomPrice.substring(roomPrice.length()-2);
		BigDecimal bdPrice = new BigDecimal(roomPrice);
		return bdPrice;
	}

	@Override
	public void buildRoom(String cityCode, String cityName, String countryCode, String countryName, String hotelCode,
			String hotelName, String roomCode, String roomName, String roomPrice) {
		room = new Room();
		room.setCityCode(this.setCityCode(cityCode));
		room.setCityName(this.setCityName(cityName));
		room.setCountryCode(this.setCountryCode(countryCode));
		room.setCountryName(this.setCountryName(countryName));
		room.setHotelCode(this.setHotelCode(hotelCode));
		room.setHotelName(this.setHotelName(hotelName));
		room.setRoomCode(this.setRoomCode(roomCode));
		room.setRoomName(this.setRoomName(roomName));
		room.setRoomPrice(this.setRoomPrice(roomPrice));	
	}

	@Override
	public Room getRoom() {
		return room;
	}
}
