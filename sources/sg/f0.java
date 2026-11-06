package sg;

import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                uy uyVar = j0Var.a;
                if (uyVar != null) {
                    uyVar.b();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
