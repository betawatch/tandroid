package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ x70(e80 e80Var, int i10) {
        this.a = i10;
        this.b = e80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e80 e80Var = this.b;
                e80Var.h.postOnAnimation(new x70(e80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
