package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
