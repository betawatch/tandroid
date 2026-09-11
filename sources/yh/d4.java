package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d4 extends v51 {
    public final /* synthetic */ f4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, ll0 ll0Var, Context context, int i10, ii.a aVar, f6 f6Var) {
        super(ll0Var, context, i10, 0, false, aVar, f6Var);
        this.N = f4Var;
    }

    @Override // org.telegram.ui.Components.v51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        f4 f4Var = this.N;
        if (i10 == 0) {
            Context context = f4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
            return new vk0(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = f4Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
        return new vk0(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
