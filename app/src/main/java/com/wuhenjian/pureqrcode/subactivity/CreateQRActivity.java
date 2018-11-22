package com.wuhenjian.pureqrcode.subactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.wuhenjian.pureqrcode.R;
import com.wuhenjian.pureqrcode.contants.RequestResultCodeContant;

/**
 * 创建二维码页面
 */
public class CreateQRActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        findViewById(R.id.createQRBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取文本框内容
                EditText editText = findViewById(R.id.createQREditText);
                String input = editText.getText().toString();
                Intent data = new Intent();
                data.putExtra(RequestResultCodeContant.CREATE_QR_KEY, input);
                setResult(RequestResultCodeContant.CREATE_RESULT_CODE, data);
                // 关闭当前页面
                finish();
            }
        });
    }
}
