package xh;

import org.telegram.messenger.l9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements g3, l9, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ m2 a;

    public /* synthetic */ r1(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // xh.g3
    public void a(boolean z10) {
        m2 m2Var = this.a;
        if (m2Var.e0 && z10) {
            return;
        }
        m2Var.o(true);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f));
    }
}
