package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(u1 u1Var, WebView webView, File file, n1 n1Var, int i3) {
        this.a = i3;
        this.b = u1Var;
        this.c = webView;
        this.d = file;
        this.e = n1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i3 = 1;
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new o1(u1Var, webView, file, (n1) this.e, 1));
                return;
            case 1:
                u1 u1Var2 = (u1) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                n1 n1Var = (n1) this.e;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new e0(i3));
                try {
                    za.p pVar = new za.p(file2);
                    u1Var2.b = pVar;
                    if (!((ArrayList) pVar.b).isEmpty()) {
                        n1Var.a(((b1) ((ArrayList) u1Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                n1Var.a(null);
                return;
            default:
                ui.j jVar = (ui.j) this.b;
                iv0 iv0Var = (iv0) this.d;
                WebView webView3 = this.c;
                d5.g gVar = (d5.g) this.e;
                String str = (String) obj;
                org.telegram.messenger.g0.r(iv0Var);
                synchronized (jVar.a) {
                    if (!jVar.u && jVar.o == webView3 && jVar.p == gVar && !jVar.r) {
                        if (!"true".equals(str)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.q();
                            return;
                        } else {
                            if (!jVar.j(webView3)) {
                                jVar.h();
                                return;
                            }
                            jVar.s = false;
                            jVar.r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            jVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ o1(ui.j jVar, iv0 iv0Var, WebView webView, d5.g gVar) {
        this.a = 2;
        this.b = jVar;
        this.d = iv0Var;
        this.c = webView;
        this.e = gVar;
    }
}
