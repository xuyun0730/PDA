package cn.starhelix.material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import cn.starhelix.material.data.CacheData;
import cn.starhelix.material.util.PreferenceUtil;
import cn.starhelix.material.util.StrUtil;

public class MainActivity extends AppCompatActivity {

    public TextView totalMixBtn;
    public TextView premixBtn;
    public TextView logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalMixBtn = findViewById(R.id.totalMixBtn);
        premixBtn = findViewById(R.id.premixBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        totalMixBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, BatchListActivity.class);
            intent.putExtra("type", "overallFeed");
            startActivity(intent);
        });

        premixBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, BatchListActivity.class);
            intent.putExtra("type", "premixFeed");
            startActivity(intent);
        });

        logoutBtn.setOnClickListener(view -> {
            PreferenceUtil.getInstance().removeToken(this);
            PreferenceUtil.getInstance().removeAccountInfo(this);
            CacheData.getInstance().clearToken();
            CacheData.getInstance().clearAccountInfo();
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}