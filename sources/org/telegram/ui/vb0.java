package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vb0(rc0 rc0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = rc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                rc0 rc0Var = this.b;
                if (!z10) {
                    rc0Var.b.setVisibility(8);
                    break;
                } else {
                    rc0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
