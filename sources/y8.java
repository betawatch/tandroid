// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y8 extends l27 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ b9 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b9 b9Var, Context context, dcb dcbVar, View view) {
        super(context, dcbVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = b9Var;
        if ((dcbVar.A.x & 32) != 32) {
            View view2 = b9Var.r;
            this.e = view2 == null ? (View) b9Var.n : view2;
        }
        nl9 nl9Var = b9Var.N;
        this.h = nl9Var;
        i27 i27Var = this.i;
        if (i27Var != null) {
            i27Var.h(nl9Var);
        }
    }

    @Override // l27
    public final void c() {
        byte b = this.l;
        b9 b9Var = this.m;
        switch (b) {
            case 0:
                b9Var.K = null;
                super.c();
                break;
            default:
                y17 y17Var = b9Var.c;
                if (y17Var != null) {
                    y17Var.c(true);
                }
                b9Var.J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(b9 b9Var, Context context, y17 y17Var, View view) {
        super(context, y17Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = b9Var;
        this.f = 8388613;
        nl9 nl9Var = b9Var.N;
        this.h = nl9Var;
        i27 i27Var = this.i;
        if (i27Var != null) {
            i27Var.h(nl9Var);
        }
    }
}
