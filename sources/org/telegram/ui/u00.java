package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v00 b;

    public /* synthetic */ u00(v00 v00Var, int i10) {
        this.a = i10;
        this.b = v00Var;
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
                v00 v00Var = this.b;
                v00Var.b(v00Var.y);
                break;
        }
    }
}
