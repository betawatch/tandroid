package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ do0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ym0(do0 do0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = do0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                do0.e0(this.b, this.c);
                break;
            case 1:
                do0 do0Var = this.b;
                Utilities.Callback callback = do0Var.Z0;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                do0Var.D0(false);
                do0Var.v0 = true;
                do0Var.H0(true, true);
                org.telegram.ui.Components.hq hqVar = do0Var.r;
                if (hqVar != null) {
                    hqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = do0Var.n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    do0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = do0Var.getParentLayout();
                Activity parentActivity = do0Var.getParentActivity();
                do0Var.getMessagesController().newMessageCallback = new b7(do0Var, parentLayout, parentActivity, 17);
                WebView webView = do0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = do0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    do0Var.x = str;
                    webView2.loadUrl(str);
                }
                do0Var.W0 = true;
                do0Var.b1 = 3;
                co0 co0Var = do0Var.V0;
                if (co0Var != null) {
                    co0Var.b(3);
                    break;
                }
                break;
            default:
                do0.c0(this.b, this.c);
                break;
        }
    }
}
