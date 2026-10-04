package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class we1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf1 b;

    public /* synthetic */ we1(yf1 yf1Var, int i10) {
        this.a = i10;
        this.b = yf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yf1 yf1Var = this.b;
                yf1Var.x0();
                yf1Var.B0();
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
                yf1 yf1Var2 = this.b;
                yf1Var2.A0 = null;
                yf1Var2.U0(true, false);
                break;
            default:
                yf1 yf1Var3 = this.b;
                yf1Var3.N.postOnAnimation(new we1(yf1Var3, 1));
                break;
        }
    }
}
