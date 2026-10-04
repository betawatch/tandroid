package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fs0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ fs0 a;

    public /* synthetic */ w1(fs0 fs0Var) {
        this.a = fs0Var;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        fs0 fs0Var = this.a;
        fs0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        fs0Var.h(null, new t1(fs0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
