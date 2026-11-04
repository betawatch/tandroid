package org.telegram.ui.web;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.m0 b;

    public /* synthetic */ f1(org.telegram.ui.m0 m0Var, int i3) {
        this.a = i3;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.b;
                m0Var.B0 = true;
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
                ci.s sVar = m0Var2.c0;
                if (!m0Var2.a0) {
                    sVar.clearFocus();
                    org.telegram.messenger.g0.v1(sVar);
                    break;
                } else {
                    sVar.requestFocus();
                    org.telegram.messenger.g0.K3(sVar);
                    break;
                }
        }
    }
}
