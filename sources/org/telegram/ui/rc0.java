package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rc0(ld0 ld0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ld0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ld0 ld0Var = this.b;
                if (!z10) {
                    ld0Var.b.setVisibility(8);
                    break;
                } else {
                    ld0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
