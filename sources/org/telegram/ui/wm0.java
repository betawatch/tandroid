package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ wm0(bo0 bo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = bo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo0.e0(this.b, this.c);
                break;
            case 1:
                bo0 bo0Var = this.b;
                Utilities.Callback callback = bo0Var.Z0;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                bo0Var.D0(false);
                bo0Var.v0 = true;
                bo0Var.H0(true, true);
                org.telegram.ui.Components.nq nqVar = bo0Var.r;
                if (nqVar != null) {
                    nqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = bo0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    bo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = bo0Var.getParentLayout();
                Activity parentActivity = bo0Var.getParentActivity();
                bo0Var.getMessagesController().newMessageCallback = new z6(bo0Var, parentLayout, parentActivity, 17);
                WebView webView = bo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = bo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    bo0Var.x = str;
                    webView2.loadUrl(str);
                }
                bo0Var.W0 = true;
                bo0Var.b1 = 3;
                ao0 ao0Var = bo0Var.V0;
                if (ao0Var != null) {
                    ao0Var.a(3);
                    break;
                }
                break;
            default:
                bo0.c0(this.b, this.c);
                break;
        }
    }
}
