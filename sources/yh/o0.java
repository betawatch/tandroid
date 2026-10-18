package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ o0(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.b;
                if (p1Var.s0 != intValue) {
                    p1Var.s0 = intValue;
                    p1Var.k0.g();
                    p1Var.Y.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.r.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.r.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.X();
                        s61 s61Var = p1Var2.Y;
                        if (s61Var != null) {
                            s61Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
