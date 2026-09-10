package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x extends j61 {
    public final /* synthetic */ o1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o1 o1Var, zp0 zp0Var, Context context, int i10, w wVar, b bVar) {
        super(zp0Var, context, i10, 0, false, wVar, bVar);
        this.N = o1Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        f0 f0Var;
        k0 k0Var;
        super.v(c1Var, i10);
        o1 o1Var = this.N;
        if (o1Var.y) {
            View view = c1Var.a;
            if ((view instanceof f0) && (k0Var = (f0Var = (f0) view).K) != null && k0Var.a == o1Var.x) {
                f0Var.b();
                o1Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final void y(s4.c1 c1Var) {
        f0 f0Var;
        k0 k0Var;
        super.y(c1Var);
        o1 o1Var = this.N;
        if (o1Var.y) {
            View view = c1Var.a;
            if ((view instanceof f0) && (k0Var = (f0Var = (f0) view).K) != null && k0Var.a == o1Var.x) {
                f0Var.b();
                o1Var.y = false;
            }
        }
    }
}
