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
import org.telegram.messenger.f8;
import org.telegram.messenger.l00;
import org.telegram.messenger.m00;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l00 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ m00 d;
    public final /* synthetic */ y1 e;
    public final /* synthetic */ r20 f;

    public /* synthetic */ q1(l00 l00Var, boolean[] zArr, m00 m00Var, y1 y1Var, r20 r20Var, int i10) {
        this.a = i10;
        this.b = l00Var;
        this.c = zArr;
        this.d = m00Var;
        this.e = y1Var;
        this.f = r20Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l00 l00Var = this.b;
                boolean[] zArr = this.c;
                m00 m00Var = this.d;
                y1 y1Var = this.e;
                r20 r20Var = this.f;
                InputStream inputStream = (InputStream) obj;
                m00.a(l00Var);
                if (!zArr[0]) {
                    l00 d = m00.d(m00Var, "readHTML");
                    String str = y1Var.a;
                    final q1 q1Var = new q1(d, zArr, m00Var, y1Var, r20Var, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.I1;
                        if (context == null) {
                            context = org.telegram.messenger.w0.b;
                        }
                        Activity W = org.telegram.messenger.i0.W(context);
                        if (W != null) {
                            View rootView = W.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                q1Var.a(null);
                                break;
                            } else {
                                final bg0 bg0Var = new bg0(context, 17);
                                ((ViewGroup) rootView).addView(bg0Var);
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
                                webView.setWebViewClient(new s1(y1Var, inputStream));
                                webView.setWebChromeClient(new t1());
                                bg0Var.addView(webView, b6.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.i0.g3(new x(zArr2, webView, bg0Var, str2, q1Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            q1Var.a(null);
                            break;
                        }
                    } else {
                        q1Var.a(null);
                        break;
                    }
                }
                break;
            default:
                l00 l00Var2 = this.b;
                boolean[] zArr3 = this.c;
                m00 m00Var2 = this.d;
                y1 y1Var2 = this.e;
                r20 r20Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                m00.a(l00Var2);
                if (!zArr3[0]) {
                    l00 d10 = m00.d(m00Var2, "parseJSON");
                    try {
                        y1Var2.c = y1Var2.i(y1Var2.a, jSONObject);
                    } catch (Exception e) {
                        m00.c(m00Var2, "error: " + e);
                        f8.g(e, true);
                    }
                    m00.a(d10);
                    r20Var2.a(y1Var2);
                    TLRPC.TL_webPage tL_webPage = y1Var2.c;
                    if (tL_webPage != null) {
                        y1.e.put(tL_webPage, y1Var2);
                    }
                    m00.b(m00Var2);
                    break;
                }
                break;
        }
    }
}
