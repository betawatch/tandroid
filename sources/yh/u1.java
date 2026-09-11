package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
