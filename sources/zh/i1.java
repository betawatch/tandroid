package zh;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements te.b, w10 {
    public final /* synthetic */ vp0 a;

    public /* synthetic */ i1(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        vp0 vp0Var = this.a;
        vp0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        vp0Var.h(null, new j1(vp0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
