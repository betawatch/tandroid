package sg;

import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ f0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.c = null;
                vy vyVar = j0Var.a;
                if (vyVar != null) {
                    vyVar.b();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
