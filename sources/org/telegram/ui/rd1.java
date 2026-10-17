package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te1 b;

    public /* synthetic */ rd1(te1 te1Var, int i10) {
        this.a = i10;
        this.b = te1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te1 te1Var = this.b;
                te1Var.x0();
                te1Var.B0();
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
                te1 te1Var2 = this.b;
                te1Var2.A0 = null;
                te1Var2.U0(true, false);
                break;
            default:
                te1 te1Var3 = this.b;
                te1Var3.N.postOnAnimation(new rd1(te1Var3, 1));
                break;
        }
    }
}
