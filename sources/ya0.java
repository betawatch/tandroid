// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ya0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ ya0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                if (!ob0Var.V) {
                    if (ob0Var.O <= 0.0f) {
                        ob0Var.k0(!ob0Var.a.w, true, false);
                        break;
                    } else {
                        if (ob0Var.N != null) {
                            ob0Var.F = 1.0f;
                            ob0Var.G = true;
                        }
                        hl.t1(ob0Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                ob0Var.getClass();
                ob0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
