package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.e, Utilities.Callback2Return {
    public final /* synthetic */ nr0 a;

    public /* synthetic */ w1(nr0 nr0Var) {
        this.a = nr0Var;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        nr0 nr0Var = this.a;
        nr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        nr0Var.h(null, new t1(nr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
