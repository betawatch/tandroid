package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.e, Utilities.Callback2Return {
    public final /* synthetic */ bs0 a;

    public /* synthetic */ w1(bs0 bs0Var) {
        this.a = bs0Var;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        bs0 bs0Var = this.a;
        bs0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        bs0Var.h(null, new t1(bs0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
