package ph;

import org.telegram.messenger.l20;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements fe.e, l20 {
    public final /* synthetic */ wq0 a;

    public /* synthetic */ n1(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // org.telegram.messenger.l20
    public Object d(Number number, Object obj) {
        wq0 wq0Var = this.a;
        wq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        wq0Var.h(null, new o1(wq0Var, 1));
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
