package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xb0(sc0 sc0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = sc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                sc0 sc0Var = this.b;
                if (!z10) {
                    sc0Var.b.setVisibility(8);
                    break;
                } else {
                    sc0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
