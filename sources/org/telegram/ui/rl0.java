package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ rl0(sm0 sm0Var, int i10) {
        this.a = i10;
        this.b = sm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y0();
                break;
            case 1:
                sm0 sm0Var = this.b;
                sm0Var.getMessagesController().m7 = null;
                if (sm0Var.f1 == 3 && !sm0Var.isFinishing()) {
                    sm0Var.f1 = 4;
                    rm0 rm0Var = sm0Var.Z0;
                    if (rm0Var != null) {
                        rm0Var.e(4);
                    }
                    sm0Var.finishFragment();
                    break;
                } else if (sm0Var.f1 == 1 && !sm0Var.isFinishing()) {
                    sm0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                sm0 sm0Var2 = this.b;
                if (sm0Var2.d0 != null) {
                    sm0Var2.B0();
                    sm0Var2.d0 = null;
                    break;
                }
                break;
            default:
                sm0 sm0Var3 = this.b;
                sm0Var3.f[0].requestFocus();
                org.telegram.messenger.i0.J3(sm0Var3.f[0]);
                break;
        }
    }
}
