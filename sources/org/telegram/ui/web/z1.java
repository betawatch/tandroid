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
import k7.b6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Timer.Task b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Timer d;
    public final /* synthetic */ h2 e;
    public final /* synthetic */ Utilities.Callback f;

    public /* synthetic */ z1(Timer.Task task, boolean[] zArr, Timer timer, h2 h2Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = task;
        this.c = zArr;
        this.d = timer;
        this.e = h2Var;
        this.f = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Timer.Task task = this.b;
                boolean[] zArr = this.c;
                Timer timer = this.d;
                h2 h2Var = this.e;
                Utilities.Callback callback = this.f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = h2Var.a;
                    final z1 z1Var = new z1(start, zArr, timer, h2Var, callback, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.D1;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        Activity findActivity = AndroidUtilities.findActivity(context);
                        if (findActivity != null) {
                            View rootView = findActivity.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                z1Var.run(null);
                                break;
                            } else {
                                final b2 b2Var = new b2(context);
                                ((ViewGroup) rootView).addView(b2Var);
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
                                webView.setWebViewClient(new c2(h2Var, inputStream));
                                webView.setWebChromeClient(new d2());
                                b2Var.addView(webView, b6.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        AndroidUtilities.runOnUIThread(new b0(zArr2, webView, b2Var, str2, z1Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            z1Var.run(null);
                            break;
                        }
                    } else {
                        z1Var.run(null);
                        break;
                    }
                }
                break;
            default:
                Timer.Task task2 = this.b;
                boolean[] zArr3 = this.c;
                Timer timer2 = this.d;
                h2 h2Var2 = this.e;
                Utilities.Callback callback2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        h2Var2.c = h2Var2.i(h2Var2.a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(h2Var2);
                    TLRPC.TL_webPage tL_webPage = h2Var2.c;
                    if (tL_webPage != null) {
                        h2.e.put(tL_webPage, h2Var2);
                    }
                    Timer.finish(timer2);
                    break;
                }
                break;
        }
    }
}
