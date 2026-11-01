package ph;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ q0(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                l1 l1Var = this.b;
                if (l1Var.j2 != intValue) {
                    l1Var.j2 = intValue;
                    l1Var.b2.g();
                    l1Var.Q1.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                l1 l1Var2 = this.b;
                if (l1Var2.getContext() != null && !l1Var2.I) {
                    ArrayList b10 = mg.k0.b(1, list);
                    l1Var2.R1 = b10;
                    List c10 = mg.k0.c(b10);
                    l1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        l1Var2.f1();
                        q51 q51Var = l1Var2.Q1;
                        if (q51Var != null) {
                            q51Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
