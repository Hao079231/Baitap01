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
                // Lấy số phần tử từ EditText
                String input = editText.getText().toString();
                if (input.isEmpty()) {
                    Toast.makeText(PerfectSquareActivity.this, "Vui lòng nhập số phần tử", Toast.LENGTH_SHORT).show();
                    return;
                }

                int size = Integer.parseInt(input);
                ArrayList<Integer> numbers = new ArrayList<>();

                // Tạo mảng số từ 1 đến size
                for (int i = 1; i <= size; i++) {
                    numbers.add(i);
                }

                // Kiểm tra số chính phương và hiển thị
                StringBuilder result = new StringBuilder("Các số chính phương: ");
                for (int num : numbers) {
                    if (isPerfectSquare(num)) {
                        result.append(num).append(" ");
                        //Toast.makeText(PerfectSquareActivity.this, num + " là số chính phương", Toast.LENGTH_SHORT).show();
                    }
                }

                // Hiển thị kết quả trong TextView
                textView.setText(result.toString());
            }
        });
    }

    // Phương thức kiểm tra số chính phương
    private boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return sqrt == (int) sqrt;
    }
}
