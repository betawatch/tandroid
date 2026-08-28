package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ td1(we1 we1Var, int i9) {
        this.a = i9;
        this.b = we1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                we1 we1Var = this.b;
                we1Var.w0();
                we1Var.A0();
                break;
            case 1:
                this.b.w0();
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
                we1Var3.J.postOnAnimation(new td1(we1Var3, 1));
                break;
        }
    }
}
