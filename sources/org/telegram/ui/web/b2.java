package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fy0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(i2 i2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.a = i10;
        this.b = i2Var;
        this.c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 0:
                i2 i2Var = (i2) this.b;
                WebView webView = this.c;
                File file = (File) this.d;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.b;
                WebView webView2 = this.c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(i10));
                try {
                    qi.e eVar = new qi.e(file2);
                    i2Var2.b = eVar;
                    if (!((ArrayList) eVar.b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) i2Var2.b.b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.b;
                fy0 fy0Var = (fy0) this.d;
                WebView webView3 = this.c;
                b5.h hVar = (b5.h) this.e;
                String str = (String) obj;
                AndroidUtilities.cancelRunOnUIThread(fy0Var);
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

    public /* synthetic */ b2(qi.i iVar, fy0 fy0Var, WebView webView, b5.h hVar) {
        this.a = 2;
        this.b = iVar;
        this.d = fy0Var;
        this.c = webView;
        this.e = hVar;
    }
}
