package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.m0 b;

    public /* synthetic */ o1(org.telegram.ui.m0 m0Var, int i10) {
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
                mh.m mVar = m0Var2.V;
                if (!m0Var2.T) {
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
