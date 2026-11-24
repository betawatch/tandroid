// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y8 extends l07 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ b9 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b9 b9Var, Context context, bab babVar, View view) {
        super(context, babVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = b9Var;
        if ((babVar.A.x & 32) != 32) {
            View view2 = b9Var.r;
            this.e = view2 == null ? (View) b9Var.n : view2;
        }
        lj9 lj9Var = b9Var.N;
        this.h = lj9Var;
        i07 i07Var = this.i;
        if (i07Var != null) {
            i07Var.h(lj9Var);
        }
    }

    @Override // l07
    public final void c() {
        byte b = this.l;
        b9 b9Var = this.m;
        switch (b) {
            case 0:
                b9Var.K = null;
                super.c();
                break;
            default:
                yz6 yz6Var = b9Var.c;
                if (yz6Var != null) {
                    yz6Var.c(true);
                }
                b9Var.J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b9 b9Var, Context context, yz6 yz6Var, View view) {
        super(context, yz6Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = b9Var;
        this.f = 8388613;
        lj9 lj9Var = b9Var.N;
        this.h = lj9Var;
        i07 i07Var = this.i;
        if (i07Var != null) {
            i07Var.h(lj9Var);
        }
    }
}
