package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ vn0(cp0 cp0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = cp0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cp0.e0(this.b, this.c);
                break;
            case 1:
                cp0 cp0Var = this.b;
                Utilities.Callback callback = cp0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                cp0Var.D0(false);
                cp0Var.z0 = true;
                cp0Var.H0(true, true);
                org.telegram.ui.Components.gr grVar = cp0Var.r;
                if (grVar != null) {
                    grVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = cp0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    cp0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = cp0Var.getParentLayout();
                Activity parentActivity = cp0Var.getParentActivity();
                cp0Var.getMessagesController().newMessageCallback = new f7(cp0Var, parentLayout, parentActivity, 17);
                WebView webView = cp0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = cp0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    cp0Var.x = str;
                    webView2.loadUrl(str);
                }
                cp0Var.a1 = true;
                cp0Var.f1 = 3;
                bp0 bp0Var = cp0Var.Z0;
                if (bp0Var != null) {
                    bp0Var.a(3);
                    break;
                }
                break;
            default:
                cp0.c0(this.b, this.c);
                break;
        }
    }
}
