package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.a = i10;
        this.b = h2Var;
        this.c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(i10));
                try {
                    com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(file2);
                    h2Var2.b = qVar;
                    if (!((ArrayList) qVar.b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                ti.j jVar = (ti.j) this.b;
                oy0 oy0Var = (oy0) this.d;
                WebView webView3 = this.c;
                c5.h hVar = (c5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(oy0Var);
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

    public /* synthetic */ a2(ti.j jVar, oy0 oy0Var, WebView webView, c5.h hVar) {
        this.a = 2;
        this.b = jVar;
        this.d = oy0Var;
        this.c = webView;
        this.e = hVar;
    }
}
