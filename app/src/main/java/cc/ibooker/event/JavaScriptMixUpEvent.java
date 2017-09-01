package cc.ibooker.event;

import android.util.Log;

/**
 * 解决WebView与JavaScript混淆问题
 * Created by 邹峰立 on 2017/3/21.
 */
public class JavaScriptMixUpEvent {
    public JavaScriptMixUpEvent() {
        super();
    }

    public String showSource(String result) {
        Log.d("JsonResult", result);
        return result;
    }

}
