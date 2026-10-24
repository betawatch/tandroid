package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ vf1(bg1 bg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = bg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bg1.Y(this.b, this.c);
                break;
            default:
                bg1 bg1Var = this.b;
                bg1Var.w0();
                bg1Var.V = this.c;
                bg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bg1 bg1Var2 = new bg1(9, bg1Var.U);
                bg1Var2.H = bg1Var.H;
                bg1Var2.G = bg1Var.G;
                bg1Var.presentFragment(bg1Var2, true);
                break;
        }
    }
}
