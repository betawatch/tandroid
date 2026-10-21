package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ks0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ne.d, Utilities.Callback2Return {
    public final /* synthetic */ ks0 a;

    public /* synthetic */ t1(ks0 ks0Var) {
        this.a = ks0Var;
    }

    @Override // ne.d
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        ks0 ks0Var = this.a;
        ks0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        ks0Var.h(null, new p1(ks0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }
}
