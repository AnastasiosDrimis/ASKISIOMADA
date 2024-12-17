public class Airline {
    //δημιουργία πεδιών
    private String username;
    private String password;
    private String airplanes;
    private String airports;
    private boolean flag;
    //κατασκευαστής για την αρχικοποίηση των τιμών
    public Airline( String username, String password, String airplanes, String airports) {
        this.username = username;
        this.password = password;
        this.airplanes = airplanes;
        this.airports = airports;
        flag = false;
    }
    do {
        public String Login( String username, String password) {
            if username = 'smal' && password = '123456' {
                return 'Σωστά στοιχεία';
                flag = true;
            } else {
                return 'Λάθος στοιχεία. Ξανά προσπάθησε'
            }
        }
    }
    while (flag = true);
     public String getUsername() {
         return username;
     }
     public String getPassword() {
            return password;
     }
    public String getPassword() {
        return password;
    }
    public String getAirports() {
        return airports;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAirports(String airports) {
        this.airports = airports;
    }
    public void setAirplanes(String airplanes) {
        this.airplanes = airplanes;
    }
}
