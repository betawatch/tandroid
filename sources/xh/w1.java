package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ bs0 a;

    public /* synthetic */ w1(bs0 bs0Var) {
        this.a = bs0Var;
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
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

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
