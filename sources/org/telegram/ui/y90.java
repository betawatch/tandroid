package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;
    public final /* synthetic */ org.telegram.messenger.sa c;

    public /* synthetic */ y90(la0 la0Var, org.telegram.messenger.sa saVar, int i3) {
        this.a = i3;
        this.b = la0Var;
        this.c = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la0 la0Var = this.b;
                org.telegram.messenger.sa saVar = this.c;
                if (la0Var.H != null && la0Var.getParentActivity() != null) {
                    try {
                        ((b8.ke) saVar).w();
                        ((mb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((b8.ke) la0Var.H).o(new aa0(la0Var, 0));
                        la0Var.x0 = true;
                        if (la0Var.y0) {
                            ((b8.ke) la0Var.H).A();
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                la0 la0Var2 = this.b;
                org.telegram.messenger.sa saVar2 = this.c;
                try {
                    ((b8.ke) saVar2).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new y90(la0Var2, saVar2, 0));
                break;
        }
    }
}
