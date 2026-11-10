package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ wa1(cb1 cb1Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = cb1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cb1.d0(this.b, this.c);
                break;
            default:
                cb1 cb1Var = this.b;
                cb1Var.B0();
                cb1Var.V = this.c;
                cb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                cb1 cb1Var2 = new cb1(9, cb1Var.U);
                cb1Var2.H = cb1Var.H;
                cb1Var2.G = cb1Var.G;
                cb1Var.presentFragment(cb1Var2, true);
                break;
        }
    }
}
