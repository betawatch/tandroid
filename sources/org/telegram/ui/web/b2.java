package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
        this.c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                i2 i2Var = (i2) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (a2) this.e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                a2 a2Var = (a2) this.e;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(i10));
                try {
                    pi.e eVar = new pi.e(file2);
                    i2Var2.b = eVar;
                    if (!((ArrayList) eVar.b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) i2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a2Var.run(null);
                return;
            default:
                pi.j jVar = (pi.j) this.b;
                pi.g gVar = (pi.g) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                synchronized (jVar.a) {
                    if (!jVar.u && jVar.o == webView3 && jVar.p == hVar && !jVar.r) {
                        if (!"true".equals(str)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else {
                            if (!jVar.h(webView3)) {
                                jVar.f();
                                return;
                            }
                            jVar.s = false;
                            jVar.r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            jVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ b2(pi.j jVar, pi.g gVar, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = jVar;
        this.d = gVar;
        this.c = webView;
        this.e = hVar;
    }
}
