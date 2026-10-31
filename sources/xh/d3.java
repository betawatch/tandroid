package xh;

import org.telegram.messenger.l9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.u1, g3, l9 {
    public final /* synthetic */ i3 a;

    public /* synthetic */ d3(i3 i3Var) {
        this.a = i3Var;
    }

    @Override // xh.g3
    public void a(boolean z10) {
        i3 i3Var = this.a;
        if (i3Var.N()) {
            return;
        }
        i3Var.J.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        return Boolean.valueOf(this.a.b.l3.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f));
    }
}
