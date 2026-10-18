package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ay0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a2(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.a = i10;
        this.b = h2Var;
        this.c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (y1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                y1 y1Var = (y1) this.e;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(i10));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.b = eVar;
                    if (!((ArrayList) eVar.b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.b;
                ay0 ay0Var = (ay0) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(ay0Var);
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

    public /* synthetic */ a2(qi.i iVar, ay0 ay0Var, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = iVar;
        this.d = ay0Var;
        this.c = webView;
        this.e = hVar;
    }
}
