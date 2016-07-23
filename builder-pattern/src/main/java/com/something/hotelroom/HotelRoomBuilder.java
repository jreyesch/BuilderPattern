package com.something.hotelroom;

import java.math.BigDecimal;

/**
 * @author Jorge Reyes Chavez
 *
 *         22/07/2016
 */
public interface HotelRoomBuilder {
	public String setCityCode(String cityCode);
	public String setCityName(String cityName);
	public String setCountryCode(String countryCode);
	public String setCountryName(String countryName);
	public String setHotelCode(String hotelCode);
	public String setHotelName(String hotelName);
	public String setRoomCode(String roomCode);
	public String setRoomName(String roomName);
	public BigDecimal setRoomPrice(String roomPrice);

	public void buildRoom(String cityCode, String cityName, String countryCode, String countryName, String hotelcode,
			String hotelName, String roomCode, String roomName, String roomPrice);

	public Room getRoom();
}
