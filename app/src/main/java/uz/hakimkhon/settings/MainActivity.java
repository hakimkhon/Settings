package uz.hakimkhon.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import uz.hakimkhon.settings.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}