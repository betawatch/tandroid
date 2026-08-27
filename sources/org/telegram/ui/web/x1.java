package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ w1 e;

    public /* synthetic */ x1(e2 e2Var, WebView webView, File file, w1 w1Var, int i10) {
        this.a = i10;
        this.b = e2Var;
        this.c = webView;
        this.d = file;
        this.e = w1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                e2 e2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new x1(e2Var, webView, file, this.e, 1));
                break;
            default:
                e2 e2Var2 = this.b;
                File file2 = this.d;
                w1 w1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(file2);
                    e2Var2.b = tVar;
                    if (!((ArrayList) tVar.c).isEmpty()) {
                        w1Var.run(((h1) ((ArrayList) e2Var2.b.c).get(0)).a());
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                w1Var.run(null);
                break;
        }
    }
}
