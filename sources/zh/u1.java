package zh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements oe.d, Utilities.Callback2Return {
    public final /* synthetic */ ws0 a;

    public /* synthetic */ u1(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        ws0 ws0Var = this.a;
        ws0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        ws0Var.h(null, new t1(ws0Var, 1));
        return Boolean.TRUE;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
