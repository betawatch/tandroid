package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ wm0(eo0 eo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = eo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo0.e0(this.b, this.c);
                break;
            case 1:
                eo0 eo0Var = this.b;
                Utilities.Callback callback = eo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                eo0Var.D0(false);
                eo0Var.z0 = true;
                eo0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = eo0Var.r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = eo0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    eo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = eo0Var.getParentLayout();
                Activity parentActivity = eo0Var.getParentActivity();
                eo0Var.getMessagesController().newMessageCallback = new e7(eo0Var, parentLayout, parentActivity, 17);
                WebView webView = eo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = eo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    eo0Var.x = str;
                    webView2.loadUrl(str);
                }
                eo0Var.a1 = true;
                eo0Var.f1 = 3;
                do0 do0Var = eo0Var.Z0;
                if (do0Var != null) {
                    do0Var.c(3);
                    break;
                }
                break;
            default:
                eo0.c0(this.b, this.c);
                break;
        }
    }
}
