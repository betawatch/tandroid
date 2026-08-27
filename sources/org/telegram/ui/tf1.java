package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ tf1(zf1 zf1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = zf1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zf1.Y(this.b, this.c);
                break;
            default:
                zf1 zf1Var = this.b;
                zf1Var.w0();
                zf1Var.R = this.c;
                zf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                zf1 zf1Var2 = new zf1(9, zf1Var.Q);
                zf1Var2.D = zf1Var.D;
                zf1Var2.C = zf1Var.C;
                zf1Var.presentFragment(zf1Var2, true);
                break;
        }
    }
}
