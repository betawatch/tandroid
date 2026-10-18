package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.is0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements ne.d, Utilities.Callback2Return {
    public final /* synthetic */ is0 a;

    public /* synthetic */ u1(is0 is0Var) {
        this.a = is0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        is0 is0Var = this.a;
        is0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        is0Var.h(null, new q1(is0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ne.d
    public void u(int i10, float f7, float f10, ne.e eVar) {
        this.a.l();
    }

    @Override // ne.d
    public /* synthetic */ void E(float f7, int i10) {
    }
}
