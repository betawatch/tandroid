package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs0 b;

    public /* synthetic */ sr0(bs0 bs0Var, int i7) {
        this.a = i7;
        this.b = bs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bs0 bs0Var = this.b;
                org.telegram.messenger.g0.h3(new sr0(bs0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = bs0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = bs0Var.L;
                    q1Var2.c6 = null;
                    q1Var2.invalidate();
                }
                vl vlVar = bs0Var.e0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    bs0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ sr0(bs0 bs0Var, boolean z9) {
        this.a = 0;
        this.b = bs0Var;
    }
}
