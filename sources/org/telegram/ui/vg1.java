package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ vg1(bh1 bh1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = bh1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bh1.X(this.b, this.c);
                break;
            default:
                bh1 bh1Var = this.b;
                bh1Var.w0();
                bh1Var.V = this.c;
                bh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bh1 bh1Var2 = new bh1(9, bh1Var.U);
                bh1Var2.H = bh1Var.H;
                bh1Var2.G = bh1Var.G;
                bh1Var.presentFragment(bh1Var2, true);
                break;
        }
    }
}
