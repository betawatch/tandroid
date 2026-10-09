package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rs0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements me.d, Utilities.Callback2Return {
    public final /* synthetic */ rs0 a;

    public /* synthetic */ w1(rs0 rs0Var) {
        this.a = rs0Var;
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        rs0 rs0Var = this.a;
        rs0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        rs0Var.h(null, new t1(rs0Var, 0));
        return Boolean.TRUE;
    }

    @Override // me.d
    public /* synthetic */ void A(float f7, int i10) {
    }
}
