package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ uf1(ag1 ag1Var, byte[] bArr, int i9) {
        this.a = i9;
        this.b = ag1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ag1.X(this.b, this.c);
                break;
            default:
                ag1 ag1Var = this.b;
                ag1Var.v0();
                ag1Var.R = this.c;
                ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ag1 ag1Var2 = new ag1(9, ag1Var.Q);
                ag1Var2.D = ag1Var.D;
                ag1Var2.C = ag1Var.C;
                ag1Var.presentFragment(ag1Var2, true);
                break;
        }
    }
}
