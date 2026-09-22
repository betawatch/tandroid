package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ nr0 a;

    public /* synthetic */ v1(nr0 nr0Var) {
        this.a = nr0Var;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        nr0 nr0Var = this.a;
        nr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        nr0Var.h(null, new s1(nr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
