package com.test.lab2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linLayout, btnLayout;
    Button a, b, c;
    ListView myListView;
    EditText eT;
    LinearLayout.LayoutParams linLayoutParam, btnLayoutParam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        linLayout = new LinearLayout(this);
        linLayout.setOrientation(LinearLayout.VERTICAL);
        linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        btnLayout = new LinearLayout(this);
        btnLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btnLayoutParam.gravity = Gravity.CENTER;
        linLayout.addView(btnLayout);
        eT = new EditText(this);
        linLayout.addView(eT);
        myListView = new ListView(this);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);
        linLayout.addView(myListView, linLayoutParam);
        a = new Button(this);
        a.setText("Add");
        btnLayout.addView(a, btnLayoutParam);
        b = new Button(this);
        b.setText("Edit");
        btnLayout.addView(b,btnLayoutParam);
        c = new Button(this);
        c.setText("Remove");
        btnLayout.addView(c, btnLayoutParam);

        this.setContentView(linLayout);

    }
}