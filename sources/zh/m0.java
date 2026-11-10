package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.m41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ m0(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g1 g1Var = this.b;
                if (g1Var.m2 != intValue) {
                    g1Var.m2 = intValue;
                    g1Var.e2.g();
                    g1Var.T1.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                g1 g1Var2 = this.b;
                if (g1Var2.getContext() != null && !g1Var2.I) {
                    ArrayList b10 = wg.r.b(1, list);
                    g1Var2.U1 = b10;
                    List c10 = wg.r.c(b10);
                    g1Var2.U1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        g1Var2.f1();
                        m41 m41Var = g1Var2.T1;
                        if (m41Var != null) {
                            m41Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
