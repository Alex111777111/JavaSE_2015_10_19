package genericexample;

import java.util.Date;

public class StoreExample
{
    public static void main(String[] args) {
        {
            Store st = new Store();
            Date d1 = new Date();
            st.put(d1);
            Date d2 = (Date) st.get();
        }
        {
            Store<Date> st = new Store<>();
            Date d1 = new Date();
            st.put(d1);
            Date d2 = st.get();
        }
    }
}
