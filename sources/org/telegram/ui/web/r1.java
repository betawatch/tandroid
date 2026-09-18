package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.k0 b;

    public /* synthetic */ r1(org.telegram.ui.k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.k0 k0Var = this.b;
                k0Var.A0 = true;
                if (k0Var.getParent() != null) {
                    k0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    k0Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.k0 k0Var2 = this.b;
                fi.o oVar = k0Var2.b0;
                if (!k0Var2.W) {
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
