package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import g7.e6;
import java.io.File;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Timer.Task task = (Timer.Task) this.b;
                boolean[] zArr = (boolean[]) this.c;
                Timer timer = (Timer) this.d;
                d2 d2Var = (d2) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = d2Var.a;
                    final v1 v1Var = new v1(start, zArr, timer, d2Var, callback, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.C1;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        Activity findActivity = AndroidUtilities.findActivity(context);
                        if (findActivity != null) {
                            View rootView = findActivity.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                v1Var.run(null);
                                break;
                            } else {
                                final x1 x1Var = new x1(context);
                                ((ViewGroup) rootView).addView(x1Var);
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
                                webView.setWebViewClient(new y1(d2Var, inputStream));
                                webView.setWebChromeClient(new z1());
                                x1Var.addView(webView, e6.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        AndroidUtilities.runOnUIThread(new y(zArr2, webView, x1Var, str2, v1Var));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            v1Var.run(null);
                            break;
                        }
                    } else {
                        v1Var.run(null);
                        break;
                    }
                }
                break;
            case 1:
                Timer.Task task2 = (Timer.Task) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                Timer timer2 = (Timer) this.d;
                d2 d2Var2 = (d2) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        d2Var2.c = d2Var2.i(d2Var2.a, jSONObject);
                    } catch (Exception e10) {
                        Timer.log(timer2, "error: " + e10);
                        FileLog.e(e10);
                    }
                    Timer.done(start2);
                    callback2.run(d2Var2);
                    TLRPC.TL_webPage tL_webPage = d2Var2.c;
                    if (tL_webPage != null) {
                        d2.e.put(tL_webPage, d2Var2);
                    }
                    Timer.finish(timer2);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new fh.k1((y0) this.b, (File) obj, (org.telegram.ui.ActionBar.c2) this.c, (String) this.d, (String) this.e, (String) this.f, 22, false));
                break;
        }
    }
}
