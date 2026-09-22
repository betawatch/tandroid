package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ p0(q1 q1Var, int i10) {
        this.a = i10;
        this.b = q1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.b;
                if (q1Var.s0 != intValue) {
                    q1Var.s0 = intValue;
                    q1Var.k0.g();
                    q1Var.Y.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.t.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.t.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.W();
                        w51 w51Var = q1Var2.Y;
                        if (w51Var != null) {
                            w51Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
