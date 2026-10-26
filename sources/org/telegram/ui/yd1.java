package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af1 b;

    public /* synthetic */ yd1(af1 af1Var, int i10) {
        this.a = i10;
        this.b = af1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af1 af1Var = this.b;
                af1Var.x0();
                af1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                af1 af1Var2 = this.b;
                af1Var2.A0 = null;
                af1Var2.V0(true, false);
                break;
            default:
                af1 af1Var3 = this.b;
                af1Var3.N.postOnAnimation(new yd1(af1Var3, 1));
                break;
        }
    }
}
