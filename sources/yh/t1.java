package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.js0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ne.d, Utilities.Callback2Return {
    public final /* synthetic */ js0 a;

    public /* synthetic */ t1(js0 js0Var) {
        this.a = js0Var;
    }

    @Override // ne.d
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        js0 js0Var = this.a;
        js0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        js0Var.h(null, new p1(js0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }
}
