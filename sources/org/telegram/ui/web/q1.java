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
import org.telegram.messenger.k00;
import org.telegram.messenger.l00;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k00 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ l00 d;
    public final /* synthetic */ y1 e;
    public final /* synthetic */ q20 f;

    public /* synthetic */ q1(k00 k00Var, boolean[] zArr, l00 l00Var, y1 y1Var, q20 q20Var, int i10) {
        this.a = i10;
        this.b = k00Var;
        this.c = zArr;
        this.d = l00Var;
        this.e = y1Var;
        this.f = q20Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k00 k00Var = this.b;
                boolean[] zArr = this.c;
                l00 l00Var = this.d;
                y1 y1Var = this.e;
                q20 q20Var = this.f;
                InputStream inputStream = (InputStream) obj;
                l00.a(k00Var);
                if (!zArr[0]) {
                    k00 d = l00.d(l00Var, "readHTML");
                    String str = y1Var.a;
                    final q1 q1Var = new q1(d, zArr, l00Var, y1Var, q20Var, 1);
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
                                final dg0 dg0Var = new dg0(context, 17);
                                ((ViewGroup) rootView).addView(dg0Var);
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
                                dg0Var.addView(webView, b6.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.i0.g3(new x(zArr2, webView, dg0Var, str2, q1Var, 6));
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
                k00 k00Var2 = this.b;
                boolean[] zArr3 = this.c;
                l00 l00Var2 = this.d;
                y1 y1Var2 = this.e;
                q20 q20Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                l00.a(k00Var2);
                if (!zArr3[0]) {
                    k00 d10 = l00.d(l00Var2, "parseJSON");
                    try {
                        y1Var2.c = y1Var2.i(y1Var2.a, jSONObject);
                    } catch (Exception e) {
                        l00.c(l00Var2, "error: " + e);
                        f8.g(e, true);
                    }
                    l00.a(d10);
                    q20Var2.a(y1Var2);
                    TLRPC.TL_webPage tL_webPage = y1Var2.c;
                    if (tL_webPage != null) {
                        y1.e.put(tL_webPage, y1Var2);
                    }
                    l00.b(l00Var2);
                    break;
                }
                break;
        }
    }
}
