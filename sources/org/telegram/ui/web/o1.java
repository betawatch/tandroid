package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.n0 b;

    public /* synthetic */ o1(org.telegram.ui.n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.b;
                n0Var.A0 = true;
                if (n0Var.getParent() != null) {
                    n0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    n0Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.n0 n0Var2 = this.b;
                ai.t tVar = n0Var2.b0;
                if (!n0Var2.W) {
                    tVar.clearFocus();
                    AndroidUtilities.hideKeyboard(tVar);
                    break;
                } else {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    break;
                }
        }
    }
}
