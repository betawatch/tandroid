package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;

    public /* synthetic */ v70(c80 c80Var, int i10) {
        this.a = i10;
        this.b = c80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c80 c80Var = this.b;
                c80Var.h.postOnAnimation(new v70(c80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
