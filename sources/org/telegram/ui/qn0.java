package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ qn0(xo0 xo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = xo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo0.e0(this.b, this.c);
                break;
            case 1:
                xo0 xo0Var = this.b;
                Utilities.Callback callback = xo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                xo0Var.D0(false);
                xo0Var.z0 = true;
                xo0Var.H0(true, true);
                org.telegram.ui.Components.sq sqVar = xo0Var.r;
                if (sqVar != null) {
                    sqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = xo0Var.n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    xo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = xo0Var.getParentLayout();
                Activity parentActivity = xo0Var.getParentActivity();
                xo0Var.getMessagesController().newMessageCallback = new b7(xo0Var, parentLayout, parentActivity, 17);
                WebView webView = xo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = xo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    xo0Var.x = str;
                    webView2.loadUrl(str);
                }
                xo0Var.a1 = true;
                xo0Var.f1 = 3;
                wo0 wo0Var = xo0Var.Z0;
                if (wo0Var != null) {
                    wo0Var.a(3);
                    break;
                }
                break;
            default:
                xo0.c0(this.b, this.c);
                break;
        }
    }
}
