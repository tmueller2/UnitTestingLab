package common;

/**
 *
 * @author jlombardo
 */
public class Customer {
    private String phone;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Customer() {
    }

    public Customer(String name, String phone) {
        this.phone = phone;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    /**
     *The phone number must be 12 characters
     * ex.  ###-###-#### 
     *      262-888-7777 
     * @param phone 
     */
    public void setPhone(String phone) {
//        try{
//            phone.length() != 12;
//        }
//        catch{
//            illegal
//        }
        if (phone.length() != 12 || phone.charAt(3) != '-' || phone.charAt(7) != '-'){
           throw new IllegalArgumentException("Phone number must be ###-###-####");
        }
        else{
            this.phone = phone;
        }
        
    }

    public String getState() {
        return state;
    }

    /**
     * The state must only be two characters
     * @param state 
     */
    public void setState(String state) {
        if (state.length() != 2 ){
            throw new IllegalArgumentException("State must be two characters ex.WI");
        }
        else{
            this.state = state;
        }
        
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        return hash;
    }

    public String toString() {
        return name + ", " + phone;
    }
}
