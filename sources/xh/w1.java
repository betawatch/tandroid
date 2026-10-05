package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gs0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ gs0 a;

    public /* synthetic */ w1(gs0 gs0Var) {
        this.a = gs0Var;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        gs0 gs0Var = this.a;
        gs0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        gs0Var.h(null, new t1(gs0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
