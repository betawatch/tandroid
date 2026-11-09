package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ y81(y91 y91Var, int i7) {
        this.a = i7;
        this.b = y91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y91 y91Var = this.b;
                y91Var.B0();
                y91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                y91 y91Var2 = this.b;
                y91Var2.A0 = null;
                y91Var2.Z0(true, false);
                break;
            default:
                y91 y91Var3 = this.b;
                y91Var3.N.postOnAnimation(new y81(y91Var3, 1));
                break;
        }
    }
}
