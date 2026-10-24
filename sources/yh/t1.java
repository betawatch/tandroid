package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ns0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ne.d, Utilities.Callback2Return {
    public final /* synthetic */ ns0 a;

    public /* synthetic */ t1(ns0 ns0Var) {
        this.a = ns0Var;
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        ns0 ns0Var = this.a;
        ns0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        ns0Var.h(null, new p1(ns0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }
}
