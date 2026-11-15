package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ja;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.wz;
import org.telegram.messenger.xz;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ xz d;
    public final /* synthetic */ v1 e;
    public final /* synthetic */ z10 f;

    public /* synthetic */ o1(wz wzVar, boolean[] zArr, xz xzVar, v1 v1Var, z10 z10Var, int i7) {
        this.a = i7;
        this.b = wzVar;
        this.c = zArr;
        this.d = xzVar;
        this.e = v1Var;
        this.f = z10Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                wz wzVar = this.b;
                boolean[] zArr = this.c;
                xz xzVar = this.d;
                v1 v1Var = this.e;
                z10 z10Var = this.f;
                InputStream inputStream = (InputStream) obj;
                xz.a(wzVar);
                if (!zArr[0]) {
                    wz d = xz.d(xzVar, "readHTML");
                    String str = v1Var.a;
                    final o1 o1Var = new o1(d, zArr, xzVar, v1Var, z10Var, 1);
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
                                final eh0 eh0Var = new eh0(context, 16);
                                ((ViewGroup) rootView).addView(eh0Var);
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
                                eh0Var.addView(webView, ja.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.g0.h3(new x(zArr2, webView, eh0Var, str2, o1Var, 6));
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
                wz wzVar2 = this.b;
                boolean[] zArr3 = this.c;
                xz xzVar2 = this.d;
                v1 v1Var2 = this.e;
                z10 z10Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                xz.a(wzVar2);
                if (!zArr3[0]) {
                    wz d2 = xz.d(xzVar2, "parseJSON");
                    try {
                        v1Var2.c = v1Var2.i(v1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        xz.c(xzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    xz.a(d2);
                    z10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.c;
                    if (tL_webPage != null) {
                        v1.e.put(tL_webPage, v1Var2);
                    }
                    xz.b(xzVar2);
                    break;
                }
                break;
        }
    }
}
