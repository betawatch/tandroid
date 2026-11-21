package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ zj0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.b;
                dk0Var.c(true);
                dk0Var.R.finishFragment();
                break;
            default:
                dk0 dk0Var2 = this.b;
                dk0Var2.c(true);
                dk0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
