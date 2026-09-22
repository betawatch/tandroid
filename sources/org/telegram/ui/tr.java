package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                org.telegram.ui.Components.o61 o61Var = this.b.a;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.o61 o61Var2 = this.b.a;
                if (o61Var2 != null) {
                    o61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
