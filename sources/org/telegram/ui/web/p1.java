package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.l0 b;

    public /* synthetic */ p1(org.telegram.ui.l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.b;
                l0Var.A0 = true;
                if (l0Var.getParent() != null) {
                    l0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    l0Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.l0 l0Var2 = this.b;
                bi.t tVar = l0Var2.b0;
                if (!l0Var2.W) {
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
