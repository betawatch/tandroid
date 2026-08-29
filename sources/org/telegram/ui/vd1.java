package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze1 b;

    public /* synthetic */ vd1(ze1 ze1Var, int i10) {
        this.a = i10;
        this.b = ze1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze1 ze1Var = this.b;
                ze1Var.x0();
                ze1Var.B0();
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
                ze1 ze1Var2 = this.b;
                ze1Var2.w0 = null;
                ze1Var2.U0(true, false);
                break;
            default:
                ze1 ze1Var3 = this.b;
                ze1Var3.J.postOnAnimation(new vd1(ze1Var3, 1));
                break;
        }
    }
}
