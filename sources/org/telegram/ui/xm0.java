package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ xm0(co0 co0Var, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = co0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co0.d0(this.b, this.c);
                break;
            case 1:
                co0 co0Var = this.b;
                Utilities.Callback callback = co0Var.Z0;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                co0Var.C0(false);
                co0Var.v0 = true;
                co0Var.G0(true, true);
                org.telegram.ui.Components.jq jqVar = co0Var.r;
                if (jqVar != null) {
                    jqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = co0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    co0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = co0Var.getParentLayout();
                Activity parentActivity = co0Var.getParentActivity();
                co0Var.getMessagesController().newMessageCallback = new a7(co0Var, parentLayout, parentActivity, 17);
                WebView webView = co0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = co0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    co0Var.x = str;
                    webView2.loadUrl(str);
                }
                co0Var.W0 = true;
                co0Var.b1 = 3;
                bo0 bo0Var = co0Var.V0;
                if (bo0Var != null) {
                    bo0Var.b(3);
                    break;
                }
                break;
            default:
                co0.b0(this.b, this.c);
                break;
        }
    }
}
