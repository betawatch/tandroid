package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;

    public /* synthetic */ vg1(wg1 wg1Var, int i10) {
        this.a = i10;
        this.b = wg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.a61 a61Var = this.b.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.a61 a61Var2 = this.b.a;
                if (a61Var2 != null) {
                    a61Var2.V2.N(true);
                    break;
                }
                break;
        }
    }
}
