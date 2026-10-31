package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r1(ji.k kVar, a3.l0 l0Var, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = kVar;
        this.d = l0Var;
        this.c = webView;
        this.e = hVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                y1 y1Var = (y1) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new r1(y1Var, webView, file, (q1) this.e, 1));
                return;
            case 1:
                y1 y1Var2 = (y1) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                q1 q1Var = (q1) this.e;
                webView2.evaluateJavascript(org.telegram.messenger.i0.y2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new e0(i10));
                try {
                    xa.n nVar = new xa.n(file2);
                    y1Var2.b = nVar;
                    if (!((ArrayList) nVar.b).isEmpty()) {
                        q1Var.a(((e1) ((ArrayList) y1Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                q1Var.a(null);
                return;
            default:
                ji.k kVar = (ji.k) this.b;
                a3.l0 l0Var = (a3.l0) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                org.telegram.messenger.i0.r(l0Var);
                synchronized (kVar.a) {
                    if (!kVar.u && kVar.o == webView3 && kVar.p == hVar && !kVar.r) {
                        if (!"true".equals(str)) {
                            f8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.q();
                            return;
                        } else {
                            if (!kVar.j(webView3)) {
                                kVar.h();
                                return;
                            }
                            kVar.s = false;
                            kVar.r = true;
                            f8.b("WEB proxy: Base64 bridge ready");
                            kVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ r1(y1 y1Var, WebView webView, File file, q1 q1Var, int i10) {
        this.a = i10;
        this.b = y1Var;
        this.c = webView;
        this.d = file;
        this.e = q1Var;
    }
}
