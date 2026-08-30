package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ y1 e;

    public /* synthetic */ z1(g2 g2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.a = i10;
        this.b = g2Var;
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
                g2 g2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new z1(g2Var, webView, file, this.e, 1));
                break;
            default:
                g2 g2Var2 = this.b;
                File file2 = this.d;
                y1 y1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new f0(1));
                try {
                    com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(file2);
                    g2Var2.b = rVar;
                    if (!((ArrayList) rVar.c).isEmpty()) {
                        y1Var.run(((i1) ((ArrayList) g2Var2.b.c).get(0)).a());
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                break;
        }
    }
}
