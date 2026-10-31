package zf;

import java.util.ArrayList;
import org.telegram.messenger.ri;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements ri, g2 {
    public final /* synthetic */ x0 a;

    public /* synthetic */ l0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        x0 x0Var = this.a;
        x0Var.N = arrayList;
        x0Var.I = null;
        x0Var.A0 = null;
        x0Var.y = null;
        x0Var.D = null;
        x0Var.J = null;
        x0Var.Q = null;
        x0Var.M = null;
        x0Var.K = null;
        x0Var.P = null;
        x0Var.f();
        t90 t90Var = x0Var.V;
        ArrayList arrayList2 = x0Var.N;
        t90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
