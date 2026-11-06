package org.telegram.ui.web;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.l0 b;

    public /* synthetic */ h1(org.telegram.ui.l0 l0Var, int i7) {
        this.a = i7;
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
                bi.v vVar = l0Var2.b0;
                if (!l0Var2.W) {
                    vVar.clearFocus();
                    org.telegram.messenger.g0.v1(vVar);
                    break;
                } else {
                    vVar.requestFocus();
                    org.telegram.messenger.g0.K3(vVar);
                    break;
                }
        }
    }
}
