package vh;

import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ s4(v4 v4Var, int i10) {
        this.a = i10;
        this.b = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                v4 v4Var = this.b;
                v4Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.h).setDuration(280L).start();
                v4Var.c = System.currentTimeMillis();
                v4Var.invalidate();
                try {
                    v4Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.h3(v4Var.h, 59500L);
                break;
        }
    }
}
