package org.telegram.ui.web;

import org.telegram.ui.zd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.m0 b;

    public /* synthetic */ i1(org.telegram.ui.m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.b;
                m0Var.A0 = true;
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
                zd zdVar = m0Var2.b0;
                if (!m0Var2.W) {
                    zdVar.clearFocus();
                    org.telegram.messenger.i0.v1(zdVar);
                    break;
                } else {
                    zdVar.requestFocus();
                    org.telegram.messenger.i0.J3(zdVar);
                    break;
                }
        }
    }
}
