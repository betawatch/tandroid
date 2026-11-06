package sg;

import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
