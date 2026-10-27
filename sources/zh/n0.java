package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ n0(p1 p1Var, int i10) {
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
                    p1Var.Y.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = vg.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = vg.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        k71 k71Var = p1Var2.Y;
                        if (k71Var != null) {
                            k71Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
