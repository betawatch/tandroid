package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
