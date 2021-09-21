package library.abubakar.expandablelayoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import library.abubakar.expandablelayout.ExpandableLayout;
import library.abubakar.expandablelayoutproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.expandData.setOnClickListener(v->{
            if (binding.expandedLayout.isExpanded())
                binding.expandedLayout.collapse();
            else
                binding.expandedLayout.expand();
        });

    }
}