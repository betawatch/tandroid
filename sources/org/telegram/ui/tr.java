package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ tr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.n61 n61Var = this.b.a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.n61 n61Var2 = this.b.a;
                if (n61Var2 != null) {
                    n61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
