package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ y1 e;

    public /* synthetic */ z1(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.a = i10;
        this.b = h2Var;
        this.c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                h2 h2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new z1(h2Var, webView, file, this.e, 1));
                break;
            default:
                h2 h2Var2 = this.b;
                File file2 = this.d;
                y1 y1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(file2);
                    h2Var2.b = sVar;
                    if (!((ArrayList) sVar.b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.b.b).get(0)).a());
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                y1Var.run(null);
                break;
        }
    }
}
