package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ tg1(zg1 zg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = zg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zg1.Y(this.b, this.c);
                break;
            default:
                zg1 zg1Var = this.b;
                zg1Var.w0();
                zg1Var.V = this.c;
                zg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                zg1 zg1Var2 = new zg1(9, zg1Var.U);
                zg1Var2.H = zg1Var.H;
                zg1Var2.G = zg1Var.G;
                zg1Var.presentFragment(zg1Var2, true);
                break;
        }
    }
}
