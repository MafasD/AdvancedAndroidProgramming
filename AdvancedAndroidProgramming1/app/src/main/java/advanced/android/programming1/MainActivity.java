package advanced.android.programming1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] COUNTRIES = new String[] {
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola",
                "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia",
                "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas (the)", "Bahrain",
                "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin",
                "Bermuda", "Bhutan", "Bolivia (Plurinational State of)", "Bonaire,",
                " Sint Eustatius and Saba", "Bosnia and Herzegovina", "Botswana", "Bouvet Island",
                "Brazil", "British Indian Ocean Territory (the)", "Brunei Darussalam",
                "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon",
                "Canada", "Cayman Islands (the)", "Central African Republic (the)", "Chad",
                "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands (the)", "Colombia",
                "Comoros (the)", "Congo (the Democratic Republic of the)", "Congo (the)",
                "Cook Islands (the)", "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus",
                "Czechia", "Côte d'Ivoire", "Denmark", "Djibouti", "Dominica",
                "Dominican Republic (the)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea",
                "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Falkland Islands (the) [Malvinas]",
                "Faroe Islands (the)", "Fiji", "Finland", "France", "French Guiana",
                "French Polynesia", "French Southern Territories (the)", "Gabon", "Gambia (the)",
                "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada",
                "Guadeloupe"
        };
        ListView myListView = (ListView) findViewById(R.id.list_view);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);
    }
}
