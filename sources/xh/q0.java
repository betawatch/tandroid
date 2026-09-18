package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ q0(r1 r1Var, int i10) {
        this.a = i10;
        this.b = r1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                r1 r1Var = this.b;
                if (r1Var.s0 != intValue) {
                    r1Var.s0 = intValue;
                    r1Var.k0.g();
                    r1Var.Y.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                r1 r1Var2 = this.b;
                if (r1Var2.getContext() != null && r1Var2.isShown()) {
                    ArrayList b10 = tg.s.b(1, list);
                    r1Var2.Z = b10;
                    List c10 = tg.s.c(b10);
                    r1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        r1Var2.W();
                        l61 l61Var = r1Var2.Y;
                        if (l61Var != null) {
                            l61Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
