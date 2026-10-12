package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ns0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements ne.d, Utilities.Callback2Return {
    public final /* synthetic */ ns0 a;

    public /* synthetic */ u1(ns0 ns0Var) {
        this.a = ns0Var;
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        ns0 ns0Var = this.a;
        ns0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        ns0Var.h(null, new r1(ns0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ne.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
