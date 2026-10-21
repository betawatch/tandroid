package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rb0(nc0 nc0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = nc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                nc0 nc0Var = this.b;
                if (!z10) {
                    nc0Var.b.setVisibility(8);
                    break;
                } else {
                    nc0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
