package vn.hcmute.baitap01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Tìm Button và thiết lập sự kiện nhấn
        Button button = findViewById(R.id.button); // ID của Button
        // Tạo các button cho các Activity
        Button primeButton = findViewById(R.id.buttonPrime);
        Button perfectSquareButton = findViewById(R.id.buttonPerfectSquare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
                Intent intent = new Intent(MainActivity.this, AnThanhTieuDeAndroid.class);
                startActivity(intent);
            }
        });
        // Sự kiện click cho nút "Số nguyên tố"
        primeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến PrimeNumberActivity
                Intent intent = new Intent(MainActivity.this, PrimeNumberActivity.class);
                startActivity(intent);
            }
        });

        // Sự kiện click cho nút "Số chính phương"
        perfectSquareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến PerfectSquareActivity
                Intent intent = new Intent(MainActivity.this, PerfectSquareActivity.class);
                startActivity(intent);
            }
        });
    }
}