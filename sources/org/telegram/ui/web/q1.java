package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1(w1 w1Var, WebView webView, File file, p1 p1Var, int i7) {
        this.a = i7;
        this.b = w1Var;
        this.c = webView;
        this.d = file;
        this.e = p1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i7 = 1;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new q1(w1Var, webView, file, (p1) this.e, 1));
                return;
            case 1:
                w1 w1Var2 = (w1) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                p1 p1Var = (p1) this.e;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new e0(i7));
                try {
                    ab.b0 b0Var = new ab.b0(file2);
                    w1Var2.b = b0Var;
                    if (!((ArrayList) b0Var.c).isEmpty()) {
                        p1Var.a(((c1) ((ArrayList) w1Var2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                p1Var.a(null);
                return;
            default:
                ui.i iVar = (ui.i) this.b;
                r31 r31Var = (r31) this.d;
                WebView webView3 = this.c;
                e5.f fVar = (e5.f) this.e;
                String str = (String) obj;
                org.telegram.messenger.g0.r(r31Var);
                synchronized (iVar.a) {
                    if (!iVar.u && iVar.o == webView3 && iVar.p == fVar && !iVar.r) {
                        if (!"true".equals(str)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else {
                            if (!iVar.j(webView3)) {
                                iVar.h();
                                return;
                            }
                            iVar.s = false;
                            iVar.r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ q1(ui.i iVar, r31 r31Var, WebView webView, e5.f fVar) {
        this.a = 2;
        this.b = iVar;
        this.d = r31Var;
        this.c = webView;
        this.e = fVar;
    }
}
