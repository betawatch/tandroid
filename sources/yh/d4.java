package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class d4 extends u61 {
    public final /* synthetic */ f4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, jm0 jm0Var, Context context, int i10, t3 t3Var, d6 d6Var) {
        super(jm0Var, context, i10, 0, false, t3Var, d6Var);
        this.N = f4Var;
    }

    @Override // org.telegram.ui.Components.u61, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        f4 f4Var = this.N;
        if (i10 == 0) {
            Context context = f4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
            return new tl0(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, d6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = f4Var.getContext();
        int i12 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
        return new tl0(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, d6Var));
    }
}
