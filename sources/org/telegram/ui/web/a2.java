package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ z1 e;

    public /* synthetic */ a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.a = i10;
        this.b = h2Var;
        this.c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                h2 h2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new a2(h2Var, webView, file, this.e, 1));
                break;
            default:
                h2 h2Var2 = this.b;
                File file2 = this.d;
                z1 z1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(file2);
                    h2Var2.b = sVar;
                    if (!((ArrayList) sVar.b).isEmpty()) {
                        z1Var.run(((j1) ((ArrayList) h2Var2.b.b).get(0)).a());
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                z1Var.run(null);
                break;
        }
    }
}
