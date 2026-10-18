package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
