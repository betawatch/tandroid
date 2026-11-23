package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ma;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ uz d;
    public final /* synthetic */ v1 e;
    public final /* synthetic */ y10 f;

    public /* synthetic */ o1(tz tzVar, boolean[] zArr, uz uzVar, v1 v1Var, y10 y10Var, int i7) {
        this.a = i7;
        this.b = tzVar;
        this.c = zArr;
        this.d = uzVar;
        this.e = v1Var;
        this.f = y10Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                tz tzVar = this.b;
                boolean[] zArr = this.c;
                uz uzVar = this.d;
                v1 v1Var = this.e;
                y10 y10Var = this.f;
                InputStream inputStream = (InputStream) obj;
                uz.a(tzVar);
                if (!zArr[0]) {
                    tz d = uz.d(uzVar, "readHTML");
                    String str = v1Var.a;
                    final o1 o1Var = new o1(d, zArr, uzVar, v1Var, y10Var, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = org.telegram.messenger.t0.b;
                        }
                        Activity W = org.telegram.messenger.g0.W(context);
                        if (W != null) {
                            View rootView = W.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                o1Var.a(null);
                                break;
                            } else {
                                final ih0 ih0Var = new ih0(context, 16);
                                ((ViewGroup) rootView).addView(ih0Var);
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
                                webView.setWebViewClient(new q1(v1Var, inputStream));
                                webView.setWebChromeClient(new r1());
                                ih0Var.addView(webView, ma.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.g0.g3(new x(zArr2, webView, ih0Var, str2, o1Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            o1Var.a(null);
                            break;
                        }
                    } else {
                        o1Var.a(null);
                        break;
                    }
                }
                break;
            default:
                tz tzVar2 = this.b;
                boolean[] zArr3 = this.c;
                uz uzVar2 = this.d;
                v1 v1Var2 = this.e;
                y10 y10Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                uz.a(tzVar2);
                if (!zArr3[0]) {
                    tz d2 = uz.d(uzVar2, "parseJSON");
                    try {
                        v1Var2.c = v1Var2.i(v1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        uz.c(uzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    uz.a(d2);
                    y10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.c;
                    if (tL_webPage != null) {
                        v1.e.put(tL_webPage, v1Var2);
                    }
                    uz.b(uzVar2);
                    break;
                }
                break;
        }
    }
}
