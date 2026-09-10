package wh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ wr0 a;

    public /* synthetic */ u1(wr0 wr0Var) {
        this.a = wr0Var;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        wr0 wr0Var = this.a;
        wr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        wr0Var.h(null, new r1(wr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }
}
