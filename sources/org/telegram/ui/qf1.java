package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ qf1(xf1 xf1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = xf1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xf1.Y(this.b, this.c);
                break;
            default:
                xf1 xf1Var = this.b;
                xf1Var.w0();
                xf1Var.V = this.c;
                xf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                xf1 xf1Var2 = new xf1(9, xf1Var.U);
                xf1Var2.H = xf1Var.H;
                xf1Var2.G = xf1Var.G;
                xf1Var.presentFragment(xf1Var2, true);
                break;
        }
    }
}
