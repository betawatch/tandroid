package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Timer.Task b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Timer d;
    public final /* synthetic */ k2 e;
    public final /* synthetic */ Utilities.Callback f;

    public /* synthetic */ c2(Timer.Task task, boolean[] zArr, Timer timer, k2 k2Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = task;
        this.c = zArr;
        this.d = timer;
        this.e = k2Var;
        this.f = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Timer.Task task = this.b;
                boolean[] zArr = this.c;
                Timer timer = this.d;
                k2 k2Var = this.e;
                Utilities.Callback callback = this.f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = k2Var.a;
                    final c2 c2Var = new c2(start, zArr, timer, k2Var, callback, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.G1;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        Activity findActivity = AndroidUtilities.findActivity(context);
                        if (findActivity != null) {
                            View rootView = findActivity.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                c2Var.run(null);
                                break;
                            } else {
                                final e2 e2Var = new e2(context);
                                ((ViewGroup) rootView).addView(e2Var);
                                final WebView webView = new WebView(context);
                                WebSettings settings = webView.getSettings();
                                settings.setAllowContentAccess(false);
                                settings.setDatabaseEnabled(false);
                                settings.setAllowFileAccess(false);
                                settings.setJavaScriptEnabled(true);
                                settings.setSaveFormData(false);
                                settings.setGeolocationEnabled(false);
                                settings.setDomStorageEnabled(false);
                                settings.setAllowFileAccessFromFileURLs(false);
                                settings.setAllowUniversalAccessFromFileURLs(false);
                                webView.setWebViewClient(new f2(k2Var, inputStream));
                                webView.setWebChromeClient(new g2());
                                e2Var.addView(webView, a6.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        AndroidUtilities.runOnUIThread(new b0(zArr2, webView, e2Var, str2, c2Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            c2Var.run(null);
                            break;
                        }
                    } else {
                        c2Var.run(null);
                        break;
                    }
                }
                break;
            default:
                Timer.Task task2 = this.b;
                boolean[] zArr3 = this.c;
                Timer timer2 = this.d;
                k2 k2Var2 = this.e;
                Utilities.Callback callback2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        k2Var2.c = k2Var2.i(k2Var2.a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(k2Var2);
                    TLRPC.TL_webPage tL_webPage = k2Var2.c;
                    if (tL_webPage != null) {
                        k2.e.put(tL_webPage, k2Var2);
                    }
                    Timer.finish(timer2);
                    break;
                }
                break;
        }
    }
}
