package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ x1 e;

    public /* synthetic */ y1(f2 f2Var, WebView webView, File file, x1 x1Var, int i10) {
        this.a = i10;
        this.b = f2Var;
        this.c = webView;
        this.d = file;
        this.e = x1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                f2 f2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new y1(f2Var, webView, file, this.e, 1));
                break;
            default:
                f2 f2Var2 = this.b;
                File file2 = this.d;
                x1 x1Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(file2);
                    f2Var2.b = sVar;
                    if (!((ArrayList) sVar.c).isEmpty()) {
                        x1Var.run(((h1) ((ArrayList) f2Var2.b.c).get(0)).a());
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                x1Var.run(null);
                break;
        }
    }
}
