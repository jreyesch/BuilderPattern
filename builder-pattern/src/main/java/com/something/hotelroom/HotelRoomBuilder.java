package com.something.hotelroom;

/**
 * @author Jorge Reyes Chavez
 *
 *         22/07/2016
 */
public interface HotelRoomBuilder {
	public RoomBuilder setCityCode(String cityCode);
	public RoomBuilder setCityName(String cityName);
	public RoomBuilder setCountryCode(String countryCode);
	public RoomBuilder setCountryName(String countryName);
	public RoomBuilder setHotelCode(String hotelCode);
	public RoomBuilder setHotelName(String hotelName);
	public RoomBuilder setRoomCode(String roomCode);
	public RoomBuilder setRoomName(String roomName);
	public RoomBuilder setRoomPrice(String roomPrice);

	public Room buildRoom();
}
