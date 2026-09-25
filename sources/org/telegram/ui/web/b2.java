package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ a2 e;

    public /* synthetic */ b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
        this.c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                i2 i2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new b2(i2Var, webView, file, this.e, 1));
                break;
            default:
                i2 i2Var2 = this.b;
                File file2 = this.d;
                a2 a2Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.b = fVar;
                    if (!((ArrayList) fVar.b).isEmpty()) {
                        a2Var.run(((k1) ((ArrayList) i2Var2.b.b).get(0)).a());
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a2Var.run(null);
                break;
        }
    }
}
