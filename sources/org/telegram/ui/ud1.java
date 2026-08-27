package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ ud1(we1 we1Var, int i10) {
        this.a = i10;
        this.b = we1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                we1 we1Var = this.b;
                we1Var.x0();
                we1Var.B0();
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
                we1 we1Var2 = this.b;
                we1Var2.w0 = null;
                we1Var2.U0(true, false);
                break;
            default:
                we1 we1Var3 = this.b;
                we1Var3.J.postOnAnimation(new ud1(we1Var3, 1));
                break;
        }
    }
}
