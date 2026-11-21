package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ ta1(bb1 bb1Var, int i7) {
        this.a = i7;
        this.b = bb1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                bb1 bb1Var = this.b;
                bb1Var.G0();
                bb1Var.finishFragment();
                break;
            case 2:
                bb1 bb1Var2 = this.b;
                bb1Var2.S = "";
                bb1Var2.J0(false);
                break;
            case 3:
                bb1.f0(this.b);
                break;
            default:
                bb1.c0(this.b);
                break;
        }
    }
}
