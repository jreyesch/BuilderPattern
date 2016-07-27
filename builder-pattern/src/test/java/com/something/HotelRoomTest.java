package com.something;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import com.something.hotelroom.HotelRoomBuilder;
import com.something.hotelroom.Room;
import com.something.hotelroom.RoomBuilder;

public class HotelRoomTest {

	@Test
	public void test() {
		HotelRoomBuilder builder = new RoomBuilder();
		builder.setCityCode("SFO").setCityName("San Francisco").setCountryCode("US").setCountryName("United States")
				.setHotelCode("A12B").setHotelName("Holiday Inn").setRoomCode("C54ABC12")
				.setRoomName("Presidential Suite").setRoomPrice("123456").buildRoom();

		Room room = builder.buildRoom();
		assertEquals("SFO", room.getCityCode());
		assertEquals("San Francisco", room.getCityName());
		assertEquals("US", room.getCountryCode());
		assertEquals("United States", room.getCountryName());
		assertEquals("A12B", room.getHotelCode());
		assertEquals("Holiday Inn", room.getHotelName());
		assertEquals("C54ABC12", room.getRoomCode());
		assertEquals("Presidential Suite", room.getRoomName());
		BigDecimal expected = new BigDecimal("1234.56");
		assertEquals(expected, room.getRoomPrice());
	}

}
