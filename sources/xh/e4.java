package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e4 extends w51 {
    public final /* synthetic */ g4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, ll0 ll0Var, Context context, int i10, hi.a aVar, e6 e6Var) {
        super(ll0Var, context, i10, 0, false, aVar, e6Var);
        this.N = g4Var;
    }

    @Override // org.telegram.ui.Components.w51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = i6.L6;
            e6Var2 = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
            return new vk0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, e6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = g4Var.getContext();
        int i12 = i6.L6;
        e6Var = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
        return new vk0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, e6Var));
    }
}
