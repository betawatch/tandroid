package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g80 b;

    public /* synthetic */ z70(g80 g80Var, int i10) {
        this.a = i10;
        this.b = g80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g80 g80Var = this.b;
                g80Var.h.postOnAnimation(new z70(g80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
