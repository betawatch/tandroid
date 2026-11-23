package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.na;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ sz d;
    public final /* synthetic */ w1 e;
    public final /* synthetic */ w10 f;

    public /* synthetic */ o1(rz rzVar, boolean[] zArr, sz szVar, w1 w1Var, w10 w10Var, int i7) {
        this.a = i7;
        this.b = rzVar;
        this.c = zArr;
        this.d = szVar;
        this.e = w1Var;
        this.f = w10Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                boolean[] zArr = this.c;
                sz szVar = this.d;
                w1 w1Var = this.e;
                w10 w10Var = this.f;
                InputStream inputStream = (InputStream) obj;
                sz.a(rzVar);
                if (!zArr[0]) {
                    rz d = sz.d(szVar, "readHTML");
                    String str = w1Var.a;
                    final o1 o1Var = new o1(d, zArr, szVar, w1Var, w10Var, 1);
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
                                final gh0 gh0Var = new gh0(context, 16);
                                ((ViewGroup) rootView).addView(gh0Var);
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
                                webView.setWebViewClient(new q1(w1Var, inputStream));
                                webView.setWebChromeClient(new r1());
                                gh0Var.addView(webView, na.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.g0.g3(new x(zArr2, webView, gh0Var, str2, o1Var, 6));
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
                rz rzVar2 = this.b;
                boolean[] zArr3 = this.c;
                sz szVar2 = this.d;
                w1 w1Var2 = this.e;
                w10 w10Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                sz.a(rzVar2);
                if (!zArr3[0]) {
                    rz d2 = sz.d(szVar2, "parseJSON");
                    try {
                        w1Var2.c = w1Var2.i(w1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        sz.c(szVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    sz.a(d2);
                    w10Var2.a(w1Var2);
                    TLRPC.TL_webPage tL_webPage = w1Var2.c;
                    if (tL_webPage != null) {
                        w1.e.put(tL_webPage, w1Var2);
                    }
                    sz.b(szVar2);
                    break;
                }
                break;
        }
    }
}
