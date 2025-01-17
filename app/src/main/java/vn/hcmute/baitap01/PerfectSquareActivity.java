package vn.hcmute.baitap01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PerfectSquareActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfect_square);

        // Khởi tạo các View
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        // Set sự kiện cho Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy chuỗi từ EditText
                String input = editText.getText().toString();
                if (input.isEmpty()) {
                    Toast.makeText(PerfectSquareActivity.this, "Vui lòng nhập một chuỗi", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Đảo ngược chuỗi
                String reversedString = new StringBuilder(input).reverse().toString();

                // Hiển thị chuỗi đảo ngược trong TextView
                textView.setText("Chuỗi đảo ngược: " + reversedString);
            }
        });
    }
}
