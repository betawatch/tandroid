package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ zc0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.b[ig0Var.a].d();
                ig0Var.o1(true, true);
                break;
            default:
                ig0 ig0Var2 = this.b;
                ig0Var2.l0 = true;
                if (ig0Var2.a != 0) {
                    ig0Var2.y1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
