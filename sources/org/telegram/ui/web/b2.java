package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(oi.k kVar, gg.t tVar, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = kVar;
        this.d = tVar;
        this.c = webView;
        this.e = hVar;
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
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(i10));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.b = fVar;
                    if (!((ArrayList) fVar.b).isEmpty()) {
                        a2Var.run(((k1) ((ArrayList) i2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                a2Var.run(null);
                return;
            default:
                oi.k kVar = (oi.k) this.b;
                gg.t tVar = (gg.t) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(tVar);
                synchronized (kVar.a) {
                    if (!kVar.u && kVar.o == webView3 && kVar.p == hVar && !kVar.r) {
                        if (!"true".equals(str)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.o();
                            return;
                        } else {
                            if (!kVar.h(webView3)) {
                                kVar.f();
                                return;
                            }
                            kVar.s = false;
                            kVar.r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            kVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
        this.c = webView;
        this.d = file;
        this.e = a2Var;
    }
}
