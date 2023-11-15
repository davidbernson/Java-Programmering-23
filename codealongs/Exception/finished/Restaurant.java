package codealongs.Exception.finished;

public class Restaurant {
    private double rating;
    
    public void setRating(double rating) {
        if (rating < 0) throw new IllegalArgumentException("ERROR: Ratings cannot be negative.");
        if (rating > 5.0) throw new IllegalArgumentException("ERROR: Ratings cannot be higher than 5.0.");
        this.rating = rating;
        System.out.println("New rating: " + rating);
    }

    public static void main(String[] args) {
        Restaurant benkesKorvKiosk = new Restaurant();

        try {benkesKorvKiosk.setRating(-0.3);}
        catch (IllegalArgumentException e) {System.out.println(e.getMessage());}

        try {benkesKorvKiosk.setRating(6.2);}
        catch (IllegalArgumentException e) {System.out.println(e.getMessage());}

        try {benkesKorvKiosk.setRating(3.8);}
        catch (IllegalArgumentException e) {System.out.println(e.getMessage());}

    }
}

