package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ y0 c;

    public /* synthetic */ e0(j0 j0Var, y0 y0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
        this.c = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        y0 y0Var = this.c;
        j0 j0Var = this.b;
        switch (i7) {
            case 0:
                j0Var.c = y0Var;
                if (j0Var.h == null) {
                    j0Var.h = new RectF();
                }
                j0Var.c.a(j0Var.h);
                uy uyVar = j0Var.a;
                if (uyVar != null) {
                    uyVar.b();
                    break;
                }
                break;
            default:
                if (y0Var != null && j0Var.q == 0) {
                    j0Var.q = j1.b(j0Var.g);
                }
                int i10 = 0;
                if (j0Var.H == (y0Var != null)) {
                    if (y0Var != j0Var.d) {
                        j0Var.d = y0Var;
                        uy uyVar2 = j0Var.a;
                        if (uyVar2 != null) {
                            uyVar2.b();
                            break;
                        }
                    }
                } else {
                    j0Var.H = y0Var != null;
                    ValueAnimator valueAnimator = j0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        j0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(j0Var.I, j0Var.H ? 1.0f : 0.0f);
                    j0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new d0(j0Var, i10));
                    j0Var.K.addListener(new h0(j0Var, i10));
                    j0Var.K.setInterpolator(wq.h);
                    j0Var.K.start();
                    j0Var.d = y0Var;
                    uy uyVar3 = j0Var.a;
                    if (uyVar3 != null) {
                        uyVar3.b();
                    }
                    if (j0Var.H) {
                        p2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
