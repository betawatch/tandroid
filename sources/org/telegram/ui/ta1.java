package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                za1Var.W = this.c;
                za1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                za1 za1Var2 = new za1(9, za1Var.V);
                za1Var2.I = za1Var.I;
                za1Var2.H = za1Var.H;
                za1Var.presentFragment(za1Var2, true);
                break;
        }
    }
}
