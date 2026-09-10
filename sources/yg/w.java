package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import xh.t3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ w(c0 c0Var, int i10) {
        this.a = i10;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                c0 c0Var = this.b;
                t3 t3Var = c0Var.c;
                if (t3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            c0Var.b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    kc0 kc0Var = c0Var.p;
                    if (kc0Var != null) {
                        kc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
