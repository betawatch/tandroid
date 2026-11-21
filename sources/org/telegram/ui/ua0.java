package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ ua0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                de0Var.b[de0Var.a].d();
                de0Var.C1(true, true);
                break;
            default:
                de0 de0Var2 = this.b;
                de0Var2.m0 = true;
                if (de0Var2.a != 0) {
                    de0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
