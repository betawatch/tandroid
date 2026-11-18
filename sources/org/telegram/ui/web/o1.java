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
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ tz d;
    public final /* synthetic */ v1 e;
    public final /* synthetic */ x10 f;

    public /* synthetic */ o1(sz szVar, boolean[] zArr, tz tzVar, v1 v1Var, x10 x10Var, int i7) {
        this.a = i7;
        this.b = szVar;
        this.c = zArr;
        this.d = tzVar;
        this.e = v1Var;
        this.f = x10Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                sz szVar = this.b;
                boolean[] zArr = this.c;
                tz tzVar = this.d;
                v1 v1Var = this.e;
                x10 x10Var = this.f;
                InputStream inputStream = (InputStream) obj;
                tz.a(szVar);
                if (!zArr[0]) {
                    sz d = tz.d(tzVar, "readHTML");
                    String str = v1Var.a;
                    final o1 o1Var = new o1(d, zArr, tzVar, v1Var, x10Var, 1);
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
                sz szVar2 = this.b;
                boolean[] zArr3 = this.c;
                tz tzVar2 = this.d;
                v1 v1Var2 = this.e;
                x10 x10Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                tz.a(szVar2);
                if (!zArr3[0]) {
                    sz d2 = tz.d(tzVar2, "parseJSON");
                    try {
                        v1Var2.c = v1Var2.i(v1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        tz.c(tzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    tz.a(d2);
                    x10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.c;
                    if (tL_webPage != null) {
                        v1.e.put(tL_webPage, v1Var2);
                    }
                    tz.b(tzVar2);
                    break;
                }
                break;
        }
    }
}
