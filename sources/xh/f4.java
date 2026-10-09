package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f4 extends c71 {
    public final /* synthetic */ h4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, qm0 qm0Var, Context context, int i10, hi.a aVar, e6 e6Var) {
        super(qm0Var, context, i10, 0, false, aVar, e6Var);
        this.N = h4Var;
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = i6.L6;
            e6Var2 = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
            return new am0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, e6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = h4Var.getContext();
        int i12 = i6.L6;
        e6Var = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
        return new am0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, e6Var));
    }
}
