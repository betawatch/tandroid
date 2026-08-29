package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                jh.m mVar = o0Var2.U;
                if (!o0Var2.S) {
                    mVar.clearFocus();
                    AndroidUtilities.hideKeyboard(mVar);
                    break;
                } else {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    break;
                }
        }
    }
}
