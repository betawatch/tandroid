package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ym0(go0 go0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = go0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go0.e0(this.b, this.c);
                break;
            case 1:
                go0 go0Var = this.b;
                Utilities.Callback callback = go0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                go0Var.D0(false);
                go0Var.z0 = true;
                go0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = go0Var.r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = go0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    go0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = go0Var.getParentLayout();
                Activity parentActivity = go0Var.getParentActivity();
                go0Var.getMessagesController().newMessageCallback = new e7(go0Var, parentLayout, parentActivity, 17);
                WebView webView = go0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = go0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    go0Var.x = str;
                    webView2.loadUrl(str);
                }
                go0Var.a1 = true;
                go0Var.f1 = 3;
                fo0 fo0Var = go0Var.Z0;
                if (fo0Var != null) {
                    fo0Var.c(3);
                    break;
                }
                break;
            default:
                go0.c0(this.b, this.c);
                break;
        }
    }
}
