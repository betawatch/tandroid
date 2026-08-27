package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.o0 b;

    public /* synthetic */ m1(org.telegram.ui.o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.o0 o0Var = this.b;
                o0Var.w0 = true;
                if (o0Var.getParent() != null) {
                    o0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    o0Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.o0 o0Var2 = this.b;
                hh.o oVar = o0Var2.U;
                if (!o0Var2.S) {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                } else {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                }
        }
    }
}
