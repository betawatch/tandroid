package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ sa1(ya1 ya1Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = ya1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ya1.d0(this.b, this.c);
                break;
            default:
                ya1 ya1Var = this.b;
                ya1Var.B0();
                ya1Var.V = this.c;
                ya1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                ya1 ya1Var2 = new ya1(9, ya1Var.U);
                ya1Var2.H = ya1Var.H;
                ya1Var2.G = ya1Var.G;
                ya1Var.presentFragment(ya1Var2, true);
                break;
        }
    }
}
