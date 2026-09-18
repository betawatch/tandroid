package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.k0 b;

    public /* synthetic */ q1(org.telegram.ui.k0 k0Var, int i10) {
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
