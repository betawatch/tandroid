package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
