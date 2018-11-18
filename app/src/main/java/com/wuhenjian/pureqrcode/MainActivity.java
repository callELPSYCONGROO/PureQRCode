package com.wuhenjian.pureqrcode;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wuhenjian.pureqrcode.contants.RequestResultCodeContant;
import com.wuhenjian.pureqrcode.subactivity.AnalysisQRActivity;
import com.wuhenjian.pureqrcode.subactivity.CreateQRActivity;

/**
 * 首页
 */
public class MainActivity extends Activity {

    /** 创建按钮 */
    private Button createBtn;

    /** 解析按钮 */
    private Button analysisBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context mainActivity = this;
        // 获取创建按钮
        createBtn = findViewById(R.id.analysisQRImageButton);
        // 绑定点击事件
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 只做跳转
                startActivityForResult(new Intent(mainActivity, CreateQRActivity.class), RequestResultCodeContant.CREATE_REQUEST_CODE);
            }
        });
        // 获取解析按钮
        analysisBtn = findViewById(R.id.createQRImageButton);
        // 绑定点击事件
        analysisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(mainActivity, AnalysisQRActivity.class), RequestResultCodeContant.ANALYSIS_REQUEST_CODE);
            }
        });
    }

    /**
     * 接受其他页面的返回值
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            // 创建回调
            case RequestResultCodeContant.CREATE_REQUEST_CODE:
                if (resultCode == RequestResultCodeContant.CREATE_RESULT_CODE) {
                    String createQR = data.getStringExtra("createQR");
                    System.out.println(createQR);
                }
                break;
            // 解析回调
            case RequestResultCodeContant.ANALYSIS_REQUEST_CODE:
                if (resultCode == RequestResultCodeContant.ANALYSIS_RESULT_CODE) {
                    String analysisQR = data.getStringExtra("analysisQR");
                    System.out.println(analysisQR);
                }
                break;
            default:
                System.out.println("发生错误");
                break;
        }

    }
}
