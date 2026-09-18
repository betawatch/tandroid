package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ b2 e;

    public /* synthetic */ c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
        this.c = webView;
        this.d = file;
        this.e = b2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                j2 j2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new c2(j2Var, webView, file, this.e, 1));
                break;
            default:
                j2 j2Var2 = this.b;
                File file2 = this.d;
                b2 b2Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    j2Var2.b = fVar;
                    if (!((ArrayList) fVar.b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.b.b).get(0)).a());
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                b2Var.run(null);
                break;
        }
    }
}
