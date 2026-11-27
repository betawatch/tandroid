// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class uf9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new uf9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        vf9 vf9Var = (vf9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        nh9 nh9Var = (nh9) b8cVar.I;
        vf9Var.a = mk0Var;
        vf9Var.w = nh9Var;
        vf9Var.x = ob6.a0;
        vf9Var.c(mk0Var);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new vf9(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
