package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u00 b;

    public /* synthetic */ t00(u00 u00Var, int i10) {
        this.a = i10;
        this.b = u00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                u00 u00Var = this.b;
                u00Var.b(u00Var.y);
                break;
        }
    }
}
