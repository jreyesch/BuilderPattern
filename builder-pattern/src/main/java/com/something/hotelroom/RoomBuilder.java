package com.something.hotelroom;

import java.math.BigDecimal;

public class RoomBuilder implements HotelRoomBuilder {
	Room room;

	public RoomBuilder() {
		room = new Room();
	}

	@Override
	public RoomBuilder setCityCode(String cityCode) {
		room.setCityCode(cityCode);
		return this;
	}

	@Override
	public RoomBuilder setCityName(String cityName) {
		room.setCityName(cityName);
		return this;
	}

	@Override
	public RoomBuilder setCountryCode(String countryCode) {
		room.setCountryCode(countryCode);
		return this;
	}

	@Override
	public RoomBuilder setCountryName(String countryName) {
		room.setCountryName(countryName);
		return this;
	}

	@Override
	public RoomBuilder setHotelCode(String hotelCode) {
		room.setHotelCode(hotelCode);
		return this;
	}

	@Override
	public RoomBuilder setHotelName(String hotelName) {
		room.setHotelName(hotelName);
		return this;
	}

	@Override
	public RoomBuilder setRoomCode(String roomCode) {
		room.setRoomCode(roomCode);
		return this;
	}

	@Override
	public RoomBuilder setRoomName(String roomName) {
		room.setRoomName(roomName);
		return this;
	}

	@Override
	public RoomBuilder setRoomPrice(String roomPrice) {
		roomPrice = roomPrice.substring(0, roomPrice.length() - 2) + "." + roomPrice.substring(roomPrice.length() - 2);
		BigDecimal price = new BigDecimal(roomPrice);
		room.setRoomPrice(price);
		return this;
	}

	@Override
	public Room buildRoom() {
		return room;
	}
}
