package sg;

import org.telegram.ui.Components.eb0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ t(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                b0 b0Var = this.b;
                ph.k kVar = b0Var.c;
                if (kVar.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.i0.E2(kVar);
                    } else {
                        try {
                            b0Var.b.removeView(kVar);
                        } catch (Exception unused) {
                        }
                    }
                    eb0 eb0Var = b0Var.p;
                    if (eb0Var != null) {
                        eb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
