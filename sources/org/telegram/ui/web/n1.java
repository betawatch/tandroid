package org.telegram.ui.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b8.mf;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ sz d;
    public final /* synthetic */ u1 e;
    public final /* synthetic */ u10 f;

    public /* synthetic */ n1(rz rzVar, boolean[] zArr, sz szVar, u1 u1Var, u10 u10Var, int i3) {
        this.a = i3;
        this.b = rzVar;
        this.c = zArr;
        this.d = szVar;
        this.e = u1Var;
        this.f = u10Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                boolean[] zArr = this.c;
                sz szVar = this.d;
                u1 u1Var = this.e;
                u10 u10Var = this.f;
                InputStream inputStream = (InputStream) obj;
                sz.a(rzVar);
                if (!zArr[0]) {
                    rz d = sz.d(szVar, "readHTML");
                    String str = u1Var.a;
                    final n1 n1Var = new n1(d, zArr, szVar, u1Var, u10Var, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.K1;
                        if (context == null) {
                            context = org.telegram.messenger.t0.b;
                        }
                        Activity W = org.telegram.messenger.g0.W(context);
                        if (W != null) {
                            View rootView = W.findViewById(R.id.content).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                n1Var.a(null);
                                break;
                            } else {
                                final yg0 yg0Var = new yg0(context, 16);
                                ((ViewGroup) rootView).addView(yg0Var);
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
                                webView.setWebViewClient(new p1(u1Var, inputStream));
                                webView.setWebChromeClient(new q1());
                                yg0Var.addView(webView, mf.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() { // from class: org.telegram.ui.web.WebInstantView$4
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        org.telegram.messenger.g0.h3(new y(zArr2, webView, yg0Var, str2, n1Var, 6));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                                break;
                            }
                        } else {
                            n1Var.a(null);
                            break;
                        }
                    } else {
                        n1Var.a(null);
                        break;
                    }
                }
                break;
            default:
                rz rzVar2 = this.b;
                boolean[] zArr3 = this.c;
                sz szVar2 = this.d;
                u1 u1Var2 = this.e;
                u10 u10Var2 = this.f;
                JSONObject jSONObject = (JSONObject) obj;
                sz.a(rzVar2);
                if (!zArr3[0]) {
                    rz d10 = sz.d(szVar2, "parseJSON");
                    try {
                        u1Var2.c = u1Var2.i(u1Var2.a, jSONObject);
                    } catch (Exception e10) {
                        sz.c(szVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    sz.a(d10);
                    u10Var2.a(u1Var2);
                    TLRPC.TL_webPage tL_webPage = u1Var2.c;
                    if (tL_webPage != null) {
                        u1.e.put(tL_webPage, u1Var2);
                    }
                    sz.b(szVar2);
                    break;
                }
                break;
        }
    }
}
