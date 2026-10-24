package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye1 b;

    public /* synthetic */ vd1(ye1 ye1Var, int i10) {
        this.a = i10;
        this.b = ye1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ye1 ye1Var = this.b;
                ye1Var.w0();
                ye1Var.A0();
                break;
            case 1:
                this.b.w0();
                break;
            case 2:
                this.b.N0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                ye1 ye1Var2 = this.b;
                ye1Var2.A0 = null;
                ye1Var2.U0(true, false);
                break;
            default:
                ye1 ye1Var3 = this.b;
                ye1Var3.N.postOnAnimation(new vd1(ye1Var3, 1));
                break;
        }
    }
}
