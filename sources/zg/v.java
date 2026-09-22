package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import yh.u3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ v(c0 c0Var, int i10) {
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
                u3 u3Var = c0Var.c;
                if (u3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            c0Var.b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    jc0 jc0Var = c0Var.p;
                    if (jc0Var != null) {
                        jc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
