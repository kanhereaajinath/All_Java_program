import java.sql.*;
import java.util.*;

public class CarRentalApp {

    private List<Car> availableCars;
    private List<Car> rentedCars;
    private Map<Customer, List<Car>> customerRentals;
    private Connection conn;
    
    public CarRentalApp() {
        availableCars = new ArrayList<>();
        rentedCars = new ArrayList<>();
        customerRentals = new HashMap<>();
        connectToDatabase();
    }
    
    private void connectToDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/car_rental";
            String user = "root";
            String password = "password";
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addCar(Car car) {
        try {
            String query = "INSERT INTO cars (make, model, year, price) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, car.getMake());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setDouble(4, car.getPrice());
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                availableCars.add(car);
                System.out.println("Car added successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void rentCar(Customer customer, Car car) {
        if (availableCars.contains(car)) {
            try {
                String query = "INSERT INTO rentals (customer_name, customer_email, car_make, car_model, car_year, car_price) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, customer.getName());
                ps.setString(2, customer.getEmail());
                ps.setString(3, car.getMake());
                ps.setString(4, car.getModel());
                ps.setInt(5, car.getYear());
                ps.setDouble(6, car.getPrice());
                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    availableCars.remove(car);
                    rentedCars.add(car);
                    if (customerRentals.containsKey(customer)) {
                        customerRentals.get(customer).add(car);
                    } else {
                        List<Car> rentals = new ArrayList<>();
                        rentals.add(car);
                        customerRentals.put(customer, rentals);
                    }
                    System.out.println("Car rented successfully");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Sorry, the car is not available for rent");
        }
    }
    
    public void returnCar(Customer customer, Car car) {
        if (rentedCars.contains(car)) {
            try {
                String query = "DELETE FROM rentals WHERE customer_email = ? AND car_make = ? AND car_model = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, customer.getEmail());
                ps.setString(2, car.getMake());
                ps.setString(3, car.getModel());
                int rowsDeleted = ps.executeUpdate();
                if (rowsDeleted > 0) {
                    rentedCars.remove(car);
                    availableCars.add(car);
                    customerRentals.get(customer).remove(car);
                    System.out.println("Car returned successfully");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Sorry, the car was not rented by this customer");
        }
    }
    
    public List<Car> getAvailable