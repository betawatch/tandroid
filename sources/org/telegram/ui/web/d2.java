package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ File d;
    public final /* synthetic */ c2 e;

    public /* synthetic */ d2(k2 k2Var, WebView webView, File file, c2 c2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = webView;
        this.d = file;
        this.e = c2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                k2 k2Var = this.b;
                WebView webView = this.c;
                webView.saveWebArchive(absolutePath, false, new d2(k2Var, webView, file, this.e, 1));
                break;
            default:
                k2 k2Var2 = this.b;
                File file2 = this.d;
                c2 c2Var = this.e;
                this.c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    ki.f fVar = new ki.f(file2);
                    k2Var2.b = fVar;
                    if (!((ArrayList) fVar.b).isEmpty()) {
                        c2Var.run(((l1) ((ArrayList) k2Var2.b.b).get(0)).a());
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                c2Var.run(null);
                break;
        }
    }
}
