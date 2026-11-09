package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                bb1Var.V = this.c;
                bb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                bb1 bb1Var2 = new bb1(9, bb1Var.U);
                bb1Var2.H = bb1Var.H;
                bb1Var2.G = bb1Var.G;
                bb1Var.presentFragment(bb1Var2, true);
                break;
        }
    }
}
