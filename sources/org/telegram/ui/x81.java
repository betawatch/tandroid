package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;

    public /* synthetic */ x81(w91 w91Var, int i7) {
        this.a = i7;
        this.b = w91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w91 w91Var = this.b;
                w91Var.B0();
                w91Var.F0();
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
                w91 w91Var2 = this.b;
                w91Var2.A0 = null;
                w91Var2.Z0(true, false);
                break;
            default:
                w91 w91Var3 = this.b;
                w91Var3.N.postOnAnimation(new x81(w91Var3, 1));
                break;
        }
    }
}
