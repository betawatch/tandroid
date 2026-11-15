package org.telegram.ui.web;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.l0 b;

    public /* synthetic */ g1(org.telegram.ui.l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.b;
                l0Var.B0 = true;
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
                di.q qVar = l0Var2.c0;
                if (!l0Var2.a0) {
                    qVar.clearFocus();
                    org.telegram.messenger.g0.v1(qVar);
                    break;
                } else {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.J3(qVar);
                    break;
                }
        }
    }
}
