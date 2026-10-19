package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ n0(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                o1 o1Var = this.b;
                if (o1Var.s0 != intValue) {
                    o1Var.s0 = intValue;
                    o1Var.k0.g();
                    o1Var.Y.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                o1 o1Var2 = this.b;
                if (o1Var2.getContext() != null && o1Var2.isShown()) {
                    ArrayList b10 = ug.r.b(1, list);
                    o1Var2.Z = b10;
                    List c10 = ug.r.c(b10);
                    o1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        o1Var2.X();
                        t61 t61Var = o1Var2.Y;
                        if (t61Var != null) {
                            t61Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
