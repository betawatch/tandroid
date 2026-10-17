package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ym0(fo0 fo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = fo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo0.e0(this.b, this.c);
                break;
            case 1:
                fo0 fo0Var = this.b;
                Utilities.Callback callback = fo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                fo0Var.D0(false);
                fo0Var.z0 = true;
                fo0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = fo0Var.r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = fo0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    fo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = fo0Var.getParentLayout();
                Activity parentActivity = fo0Var.getParentActivity();
                fo0Var.getMessagesController().newMessageCallback = new e7(fo0Var, parentLayout, parentActivity, 17);
                WebView webView = fo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = fo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    fo0Var.x = str;
                    webView2.loadUrl(str);
                }
                fo0Var.a1 = true;
                fo0Var.f1 = 3;
                eo0 eo0Var = fo0Var.Z0;
                if (eo0Var != null) {
                    eo0Var.c(3);
                    break;
                }
                break;
            default:
                fo0.c0(this.b, this.c);
                break;
        }
    }
}
