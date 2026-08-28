package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.n0 b;

    public /* synthetic */ l1(org.telegram.ui.n0 n0Var, int i9) {
        this.a = i9;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.b;
                n0Var.w0 = true;
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
                gh.o oVar = n0Var2.U;
                if (!n0Var2.S) {
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
