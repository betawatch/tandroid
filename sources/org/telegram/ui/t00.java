package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
