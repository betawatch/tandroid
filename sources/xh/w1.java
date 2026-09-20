package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yr0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements le.d, Utilities.Callback2Return {
    public final /* synthetic */ yr0 a;

    public /* synthetic */ w1(yr0 yr0Var) {
        this.a = yr0Var;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        yr0 yr0Var = this.a;
        yr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        yr0Var.h(null, new t1(yr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
