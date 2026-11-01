package xh;

import org.telegram.messenger.m9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.u1, h3, m9 {
    public final /* synthetic */ j3 a;

    public /* synthetic */ d3(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // xh.h3
    public void a(boolean z10) {
        j3 j3Var = this.a;
        if (j3Var.N()) {
            return;
        }
        j3Var.J.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.m9
    public Object l(Object obj) {
        return Boolean.valueOf(this.a.b.l3.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f));
    }
}
