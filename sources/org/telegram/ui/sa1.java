package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
