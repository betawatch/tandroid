package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ zf1(fg1 fg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = fg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg1.Z(this.b, this.c);
                break;
            default:
                fg1 fg1Var = this.b;
                fg1Var.x0();
                fg1Var.V = this.c;
                fg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                fg1 fg1Var2 = new fg1(9, fg1Var.U);
                fg1Var2.H = fg1Var.H;
                fg1Var2.G = fg1Var.G;
                fg1Var.presentFragment(fg1Var2, true);
                break;
        }
    }
}
