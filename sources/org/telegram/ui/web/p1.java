package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ha;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a00;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.zz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ a00 d;
    public final /* synthetic */ w1 e;
    public final /* synthetic */ c20 f;

    public /* synthetic */ p1(zz zzVar, boolean[] zArr, a00 a00Var, w1 w1Var, c20 c20Var, int i7) {
        this.a = i7;
        this.b = zzVar;
        this.c = zArr;
        this.d = a00Var;
        this.e = w1Var;
        this.f = c20Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                zz zzVar = this.b;
                boolean[] zArr = this.c;
                a00 a00Var = this.d;
                w1 w1Var = this.e;
                c20 c20Var = this.f;
                InputStream inputStream = (InputStream) obj;
                a00.a(zzVar);
                if (!zArr[0]) {
                    zz d = a00.d(a00Var, "readHTML");
                    String str = w1Var.a;
                    final p1 p1Var = new p1(d, zArr, a00Var, w1Var, c20Var, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.G1;
                        if (context == null) {
                            context = org.telegram.messenger.t0.b;
                        }
                        Activity W = org.telegram.messenger.g0.W(context);
                        if (W != null) {
                            View rootView = W.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                p1Var.a(null);
                                break;
                            } else {
                                final vq0 vq0Var = new vq0(context, 14);
                                ((ViewGroup) rootView).addView(vq0Var);
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
                                webView.setWebViewClient(new r1(w1Var, inputStream));
                                webView.setWebChromeClient(new s1());
                                vq0Var.addView(webView, ha.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.g0.h3(new x(zArr2, webView, vq0Var, str2, p1Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            p1Var.a(null);
                            break;
                        }
                    } else {
                        p1Var.a(null);
                        break;
                    }
                }
                break;
            default:
                zz zzVar2 = this.b;
                boolean[] zArr3 = this.c;
                a00 a00Var2 = this.d;
                w1 w1Var2 = this.e;
                c20 c20Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                a00.a(zzVar2);
                if (!zArr3[0]) {
                    zz d2 = a00.d(a00Var2, "parseJSON");
                    try {
                        w1Var2.c = w1Var2.i(w1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        a00.c(a00Var2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    a00.a(d2);
                    c20Var2.a(w1Var2);
                    TLRPC.TL_webPage tL_webPage = w1Var2.c;
                    if (tL_webPage != null) {
                        w1.e.put(tL_webPage, w1Var2);
                    }
                    a00.b(a00Var2);
                    break;
                }
                break;
        }
    }
}
