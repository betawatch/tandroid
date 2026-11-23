package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class va1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ va1(bb1 bb1Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = bb1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bb1.d0(this.b, this.c);
                break;
            default:
                bb1 bb1Var = this.b;
                bb1Var.B0();
                bb1Var.W = this.c;
                bb1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                bb1 bb1Var2 = new bb1(9, bb1Var.V);
                bb1Var2.I = bb1Var.I;
                bb1Var2.H = bb1Var.H;
                bb1Var.presentFragment(bb1Var2, true);
                break;
        }
    }
}
