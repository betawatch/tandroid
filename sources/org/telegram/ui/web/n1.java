package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.m0 b;

    public /* synthetic */ n1(org.telegram.ui.m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.b;
                m0Var.x0 = true;
                if (m0Var.getParent() != null) {
                    m0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    m0Var.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.m0 m0Var2 = this.b;
                lh.n nVar = m0Var2.V;
                if (!m0Var2.T) {
                    nVar.clearFocus();
                    AndroidUtilities.hideKeyboard(nVar);
                    break;
                } else {
                    nVar.requestFocus();
                    AndroidUtilities.showKeyboard(nVar);
                    break;
                }
        }
    }
}
