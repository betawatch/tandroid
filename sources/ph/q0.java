package ph;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.p51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ q0(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // org.telegram.messenger.q20
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
                        p51 p51Var = l1Var2.Q1;
                        if (p51Var != null) {
                            p51Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
