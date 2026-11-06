package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.f41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ n0(h1 h1Var, int i7) {
        this.a = i7;
        this.b = h1Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h1 h1Var = this.b;
                if (h1Var.j2 != intValue) {
                    h1Var.j2 = intValue;
                    h1Var.b2.g();
                    h1Var.Q1.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                h1 h1Var2 = this.b;
                if (h1Var2.getContext() != null && !h1Var2.I) {
                    ArrayList b10 = wg.s.b(1, list);
                    h1Var2.R1 = b10;
                    List c10 = wg.s.c(b10);
                    h1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        h1Var2.f1();
                        f41 f41Var = h1Var2.Q1;
                        if (f41Var != null) {
                            f41Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
