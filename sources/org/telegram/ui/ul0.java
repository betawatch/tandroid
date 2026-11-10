package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ em0 b;

    public /* synthetic */ ul0(em0 em0Var, int i7) {
        this.a = i7;
        this.b = em0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        em0 em0Var = this.b;
        switch (i7) {
            case 0:
                if (em0Var.G) {
                    em0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                em0Var.h();
                break;
            case 2:
                int i10 = em0.q0;
                em0Var.h();
                break;
            default:
                int i11 = em0.q0;
                em0Var.h();
                break;
        }
    }
}
