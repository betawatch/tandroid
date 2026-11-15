package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;

    public /* synthetic */ u81(u91 u91Var, int i7) {
        this.a = i7;
        this.b = u91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u91 u91Var = this.b;
                u91Var.B0();
                u91Var.F0();
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
                u91 u91Var2 = this.b;
                u91Var2.B0 = null;
                u91Var2.Z0(true, false);
                break;
            default:
                u91 u91Var3 = this.b;
                u91Var3.O.postOnAnimation(new u81(u91Var3, 1));
                break;
        }
    }
}
