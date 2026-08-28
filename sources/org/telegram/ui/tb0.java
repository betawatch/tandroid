package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tb0(pc0 pc0Var, boolean z10, int i9) {
        this.a = i9;
        this.b = pc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                pc0 pc0Var = this.b;
                if (!z10) {
                    pc0Var.b.setVisibility(8);
                    break;
                } else {
                    pc0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
