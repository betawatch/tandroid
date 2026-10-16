package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ns0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public /* synthetic */ void A(float f7, int i10) {
    }
}
