package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ v1 e;

    public /* synthetic */ w1(d2 d2Var, WebView webView, File file, v1 v1Var, int i9) {
        this.a = i9;
        this.b = d2Var;
        this.c = webView;
        this.d = file;
        this.e = v1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                d2 d2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new w1(d2Var, webView, file, this.e, 1));
                break;
            default:
                d2 d2Var2 = this.b;
                File file2 = this.d;
                v1 v1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new f0(1));
                try {
                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(file2);
                    d2Var2.b = tVar;
                    if (!((ArrayList) tVar.c).isEmpty()) {
                        v1Var.run(((g1) ((ArrayList) d2Var2.b.c).get(0)).a());
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                v1Var.run(null);
                break;
        }
    }
}
