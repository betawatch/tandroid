package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.e, Utilities.Callback2Return {
    public final /* synthetic */ zr0 a;

    public /* synthetic */ w1(zr0 zr0Var) {
        this.a = zr0Var;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        zr0 zr0Var = this.a;
        zr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        zr0Var.h(null, new t1(zr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
