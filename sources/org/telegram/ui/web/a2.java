package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(i10));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.b = eVar;
                    if (!((ArrayList) eVar.b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.b;
                org.webrtc.i iVar2 = (org.webrtc.i) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(iVar2);
                synchronized (iVar.a) {
                    if (!iVar.u && iVar.o == webView3 && iVar.p == hVar && !iVar.r) {
                        if (!"true".equals(str)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else {
                            if (!iVar.h(webView3)) {
                                iVar.f();
                                return;
                            }
                            iVar.s = false;
                            iVar.r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public /* synthetic */ a2(qi.i iVar, org.webrtc.i iVar2, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = iVar;
        this.d = iVar2;
        this.c = webView;
        this.e = hVar;
    }
}
