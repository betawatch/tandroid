package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ ra1(xa1 xa1Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = xa1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xa1.d0(this.b, this.c);
                break;
            default:
                xa1 xa1Var = this.b;
                xa1Var.B0();
                xa1Var.W = this.c;
                xa1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                xa1 xa1Var2 = new xa1(9, xa1Var.V);
                xa1Var2.I = xa1Var.I;
                xa1Var2.H = xa1Var.H;
                xa1Var.presentFragment(xa1Var2, true);
                break;
        }
    }
}
