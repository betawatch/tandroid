package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ tn0(ap0 ap0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ap0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ap0.e0(this.b, this.c);
                break;
            case 1:
                ap0 ap0Var = this.b;
                Utilities.Callback callback = ap0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ap0Var.D0(false);
                ap0Var.z0 = true;
                ap0Var.H0(true, true);
                org.telegram.ui.Components.gr grVar = ap0Var.r;
                if (grVar != null) {
                    grVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = ap0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    ap0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = ap0Var.getParentLayout();
                Activity parentActivity = ap0Var.getParentActivity();
                ap0Var.getMessagesController().newMessageCallback = new f7(ap0Var, parentLayout, parentActivity, 17);
                WebView webView = ap0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ap0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ap0Var.x = str;
                    webView2.loadUrl(str);
                }
                ap0Var.a1 = true;
                ap0Var.f1 = 3;
                zo0 zo0Var = ap0Var.Z0;
                if (zo0Var != null) {
                    zo0Var.a(3);
                    break;
                }
                break;
            default:
                ap0.c0(this.b, this.c);
                break;
        }
    }
}
