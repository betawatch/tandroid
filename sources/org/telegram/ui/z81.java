package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z91 b;

    public /* synthetic */ z81(z91 z91Var, int i7) {
        this.a = i7;
        this.b = z91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z91 z91Var = this.b;
                z91Var.B0();
                z91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                z91 z91Var2 = this.b;
                z91Var2.A0 = null;
                z91Var2.Z0(true, false);
                break;
            default:
                z91 z91Var3 = this.b;
                z91Var3.N.postOnAnimation(new z81(z91Var3, 1));
                break;
        }
    }
}
