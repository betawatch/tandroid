package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ta1(za1 za1Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = za1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                za1.d0(this.b, this.c);
                break;
            default:
                za1 za1Var = this.b;
                za1Var.B0();
                za1Var.V = this.c;
                za1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                za1 za1Var2 = new za1(9, za1Var.U);
                za1Var2.H = za1Var.H;
                za1Var2.G = za1Var.G;
                za1Var.presentFragment(za1Var2, true);
                break;
        }
    }
}
