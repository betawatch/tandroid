package ph;

import org.telegram.messenger.k20;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements fe.e, k20 {
    public final /* synthetic */ vq0 a;

    public /* synthetic */ n1(vq0 vq0Var) {
        this.a = vq0Var;
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        vq0 vq0Var = this.a;
        vq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        vq0Var.h(null, new o1(vq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.l();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
