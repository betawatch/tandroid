package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tb0(pc0 pc0Var, boolean z10, int i10) {
        this.a = i10;
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
