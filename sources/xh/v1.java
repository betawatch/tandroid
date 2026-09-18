package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ or0 a;

    public /* synthetic */ v1(or0 or0Var) {
        this.a = or0Var;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        or0 or0Var = this.a;
        or0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        or0Var.h(null, new s1(or0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
