package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ sr(tr trVar, int i10) {
        this.a = i10;
        this.b = trVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.b.a;
                if (w61Var != null) {
                    w61Var.f3.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.b.a;
                if (w61Var2 != null) {
                    w61Var2.f3.N(true);
                    break;
                }
                break;
        }
    }
}
