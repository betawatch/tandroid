package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.in0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
        this.c = webView;
        this.d = file;
        this.e = b2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                j2 j2Var = (j2) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new c2(j2Var, webView, file, (b2) this.e, 1));
                return;
            case 1:
                j2 j2Var2 = (j2) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                b2 b2Var = (b2) this.e;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(i10));
                try {
                    qi.f fVar = new qi.f(file2);
                    j2Var2.b = fVar;
                    if (!((ArrayList) fVar.b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                b2Var.run(null);
                return;
            default:
                qi.j jVar = (qi.j) this.b;
                in0 in0Var = (in0) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(in0Var);
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

    public /* synthetic */ c2(qi.j jVar, in0 in0Var, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = jVar;
        this.d = in0Var;
        this.c = webView;
        this.e = hVar;
    }
}
