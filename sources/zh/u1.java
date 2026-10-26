package zh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vs0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements oe.d, Utilities.Callback2Return {
    public final /* synthetic */ vs0 a;

    public /* synthetic */ u1(vs0 vs0Var) {
        this.a = vs0Var;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        vs0 vs0Var = this.a;
        vs0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        vs0Var.h(null, new t1(vs0Var, 1));
        return Boolean.TRUE;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
