package tg;

import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ f0(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.c = null;
                nh nhVar = i0Var.a;
                if (nhVar != null) {
                    nhVar.x();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
