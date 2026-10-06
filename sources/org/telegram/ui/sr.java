package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                org.telegram.ui.Components.y61 y61Var = this.b.a;
                if (y61Var != null) {
                    y61Var.f3.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y61 y61Var2 = this.b.a;
                if (y61Var2 != null) {
                    y61Var2.f3.N(true);
                    break;
                }
                break;
        }
    }
}
