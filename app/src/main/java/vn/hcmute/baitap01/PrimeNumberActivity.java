package vn.hcmute.baitap01;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class PrimeNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);

        // Tạo một ArrayList chứa các số
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        // Duyệt qua các phần tử trong ArrayList
        for (int num : numbers) {
            if (isOddOrEven(num)) {
                Log.d("Even Number", num + " là số chẵn");
            } else {
                Log.d("Odd Number", num + " là số lẻ");
            }
        }
    }

    // Phương thức kiểm tra số nguyên tố
    private boolean isOddOrEven(int num) {
        return num%2==0;
    }
}
