package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ wf1(cg1 cg1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = cg1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cg1.Y(this.b, this.c);
                break;
            default:
                cg1 cg1Var = this.b;
                cg1Var.w0();
                cg1Var.R = this.c;
                cg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                cg1 cg1Var2 = new cg1(9, cg1Var.Q);
                cg1Var2.D = cg1Var.D;
                cg1Var2.C = cg1Var.C;
                cg1Var.presentFragment(cg1Var2, true);
                break;
        }
    }
}
