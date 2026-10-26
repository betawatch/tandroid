package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ xf1(dg1 dg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = dg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg1.Z(this.b, this.c);
                break;
            default:
                dg1 dg1Var = this.b;
                dg1Var.x0();
                dg1Var.V = this.c;
                dg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                dg1 dg1Var2 = new dg1(9, dg1Var.U);
                dg1Var2.H = dg1Var.H;
                dg1Var2.G = dg1Var.G;
                dg1Var.presentFragment(dg1Var2, true);
                break;
        }
    }
}
