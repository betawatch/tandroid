package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p1(v1 v1Var, WebView webView, File file, o1 o1Var, int i7) {
        this.a = i7;
        this.b = v1Var;
        this.c = webView;
        this.d = file;
        this.e = o1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i7 = 1;
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new p1(v1Var, webView, file, (o1) this.e, 1));
                return;
            case 1:
                v1 v1Var2 = (v1) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                o1 o1Var = (o1) this.e;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new d0(i7));
                try {
                    xi.e eVar = new xi.e(file2);
                    v1Var2.b = eVar;
                    if (!((ArrayList) eVar.b).isEmpty()) {
                        o1Var.a(((b1) ((ArrayList) v1Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.a(null);
                return;
            default:
                xi.i iVar = (xi.i) this.b;
                wg.p pVar = (wg.p) this.d;
                WebView webView3 = this.c;
                e5.f fVar = (e5.f) this.e;
                String str = (String) obj;
                org.telegram.messenger.g0.r(pVar);
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

    public /* synthetic */ p1(xi.i iVar, wg.p pVar, WebView webView, e5.f fVar) {
        this.a = 2;
        this.b = iVar;
        this.d = pVar;
        this.c = webView;
        this.e = fVar;
    }
}
