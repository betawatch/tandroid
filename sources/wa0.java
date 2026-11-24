// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb0 b;

    public /* synthetic */ wa0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                if (!mb0Var.V) {
                    if (mb0Var.O <= 0.0f) {
                        mb0Var.k0(!mb0Var.a.w, true, false);
                        break;
                    } else {
                        if (mb0Var.N != null) {
                            mb0Var.F = 1.0f;
                            mb0Var.G = true;
                        }
                        gl.t1(mb0Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                mb0Var.getClass();
                mb0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
