package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ rn0(yo0 yo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = yo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo0.e0(this.b, this.c);
                break;
            case 1:
                yo0 yo0Var = this.b;
                Utilities.Callback callback = yo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                yo0Var.D0(false);
                yo0Var.z0 = true;
                yo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = yo0Var.r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = yo0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    yo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.e5 parentLayout = yo0Var.getParentLayout();
                Activity parentActivity = yo0Var.getParentActivity();
                yo0Var.getMessagesController().newMessageCallback = new c7(yo0Var, parentLayout, parentActivity, 17);
                WebView webView = yo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = yo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    yo0Var.x = str;
                    webView2.loadUrl(str);
                }
                yo0Var.a1 = true;
                yo0Var.f1 = 3;
                xo0 xo0Var = yo0Var.Z0;
                if (xo0Var != null) {
                    xo0Var.a(3);
                    break;
                }
                break;
            default:
                yo0.c0(this.b, this.c);
                break;
        }
    }
}
