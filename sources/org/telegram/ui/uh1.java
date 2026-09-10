package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh1 b;

    public /* synthetic */ uh1(vh1 vh1Var, int i10) {
        this.a = i10;
        this.b = vh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.l61 l61Var = this.b.a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.b.a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
