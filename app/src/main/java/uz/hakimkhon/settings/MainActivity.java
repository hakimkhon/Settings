package uz.hakimkhon.settings;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.Toast;

import uz.hakimkhon.settings.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.imgPoints.setOnClickListener(v -> {
            binding.linearLayoutSettings.setVisibility(View.VISIBLE);
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            // Set the message show for the Alert time
////            builder.setMessage("Do you want to exit ?");
//
//            // Set Alert Title
////            builder.setTitle("Alert !");
//
//            // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
//            builder.setCancelable(true);
//            builder.setPositiveButton("Settings", showToast());
//            // Create the Alert dialog
//            AlertDialog alertDialog = builder.create();
//            // Show the Alert Dialog box
//            alertDialog.show();
//            WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
//            lp.copyFrom(alertDialog.getWindow().getAttributes());
//            lp.width = 700;
//            lp.height = 500;
//            lp.x=300;
//            lp.y=-900;
//            alertDialog.getWindow().setAttributes(lp);
        });
    }

    private DialogInterface.OnClickListener showToast() {
        Toast.makeText(MainActivity.this, "CANCEL", Toast.LENGTH_SHORT).show();
        return null;
    }
}

/*
WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

lp.copyFrom(alertDialog.getWindow().getAttributes());
lp.width = 150;
lp.height = 500;
lp.x=-170;
lp.y=100;
alertDialog.getWindow().setAttributes(lp);
 */