// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z8 extends s27 {
    public final /* synthetic */ byte l = 1;
    public final /* synthetic */ c9 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(c9 c9Var, Context context, zdb zdbVar, View view) {
        super(context, zdbVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = c9Var;
        if ((zdbVar.A.x & 32) != 32) {
            View view2 = c9Var.r;
            this.e = view2 == null ? (View) c9Var.n : view2;
        }
        zm9 zm9Var = c9Var.N;
        this.h = zm9Var;
        p27 p27Var = this.i;
        if (p27Var != null) {
            p27Var.h(zm9Var);
        }
    }

    @Override // s27
    public final void c() {
        byte b = this.l;
        c9 c9Var = this.m;
        switch (b) {
            case 0:
                c9Var.K = null;
                super.c();
                break;
            default:
                f27 f27Var = c9Var.c;
                if (f27Var != null) {
                    f27Var.c(true);
                }
                c9Var.J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(c9 c9Var, Context context, f27 f27Var, View view) {
        super(context, f27Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = c9Var;
        this.f = 8388613;
        zm9 zm9Var = c9Var.N;
        this.h = zm9Var;
        p27 p27Var = this.i;
        if (p27Var != null) {
            p27Var.h(zm9Var);
        }
    }
}
