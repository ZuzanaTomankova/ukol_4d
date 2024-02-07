
import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.BookingManager;
import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995,5,5));
        Guest guest3 = new Guest("Karel Dvořák",LocalDate.of(1990,5,15));
        Guest guest4 = new Guest("Karel Dvořák",LocalDate.of(1979,1,3));
        Guest guest5 = new Guest("Karolína Tmavá",LocalDate.of(2000,1,1));

        List<Guest>guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        guestList.add(guest4);
        guestList.add(guest5);




        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true, BigDecimal.valueOf(2400));

        BookingManager bookingManager = new BookingManager();



        bookingManager.addBooking(new Booking(room1,guest1, LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26), true));
        bookingManager.addBooking(new Booking(room3,guest1,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),true));
        bookingManager.addBooking(new Booking(room3,guest2,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),true));
        bookingManager.addBooking(new Booking(room3,guest3,LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7),true));
        bookingManager.addBooking(new Booking(room2,guest4,LocalDate.of(2023,7,18),
                LocalDate.of(2023,7,21),false));

        for (int i = 1; i <= 20; i = i+2) {
            bookingManager.addBooking(new Booking(room2,guest5,LocalDate.of(2023,8,i),
                    LocalDate.of(2023,8,i+1),false));}

            bookingManager.addBooking(new Booking(room3,guest5,LocalDate.of(2023,8,1),
                    LocalDate.of(2023,8,31),false));







        List<Booking> bookingList = bookingManager.getBookings();






            for (Booking booking : bookingList) {
                if (!booking.isBusinessStay()) System.out.println("Rekreační pobyt: "+ booking.getGuest()+ " od  "
                        +booking.getStartOfStay()+ "  do  "+booking.getEndOfStay());

            }

        System.out.println("-----------------------------------------------");

        for (Booking booking : bookingList) {
            if (!booking.isBusinessStay() || booking.isBusinessStay()) System.out.println("Pobyt: "+ booking.getGuest()+booking.getRoom()+
                    " od  "   +booking.getStartOfStay()+ "  do  "+booking.getEndOfStay());

        }

        System.out.println("-----------------------------------------------");
        System.out.println("Průměrný počet rezervací na jednoho hosta: "+bookingList.size()/guestList.size());

        
    }
}