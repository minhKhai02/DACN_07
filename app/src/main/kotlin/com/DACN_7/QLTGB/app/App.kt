package com.simplemobiletools.calendar.pro

import android.os.Bundle
import androidx.multidex.MultiDexApplication
import com.simplemobiletools.commons.extensions.checkUseEnglish
import java.util.Locale

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseVietnamese()
    }

    private fun checkUseVietnamese() {
        val currentLocale = Locale.getDefault().language
        if (currentLocale == "vi") {
            // Ứng dụng đang chạy bằng tiếng Việt, thực hiện các hành động cần thiết ở đây
            // Ví dụ: Cài đặt ngôn ngữ ứng dụng thành tiếng Việt
        }
    }
}
