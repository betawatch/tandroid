package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ nr0 a;

    public /* synthetic */ u1(nr0 nr0Var) {
        this.a = nr0Var;
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        nr0 nr0Var = this.a;
        nr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        nr0Var.h(null, new r1(nr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
