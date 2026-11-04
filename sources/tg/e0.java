package tg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ e0(i0 i0Var, x0 x0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
        this.c = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        x0 x0Var = this.c;
        i0 i0Var = this.b;
        switch (i3) {
            case 0:
                i0Var.c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.c.a(i0Var.h);
                nh nhVar = i0Var.a;
                if (nhVar != null) {
                    nhVar.x();
                    break;
                }
                break;
            default:
                if (x0Var != null && i0Var.q == 0) {
                    i0Var.q = i1.b(i0Var.g);
                }
                int i10 = 0;
                if (i0Var.H == (x0Var != null)) {
                    if (x0Var != i0Var.d) {
                        i0Var.d = x0Var;
                        nh nhVar2 = i0Var.a;
                        if (nhVar2 != null) {
                            nhVar2.x();
                            break;
                        }
                    }
                } else {
                    i0Var.H = x0Var != null;
                    ValueAnimator valueAnimator = i0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        i0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(i0Var.I, i0Var.H ? 1.0f : 0.0f);
                    i0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new d0(i0Var, i10));
                    i0Var.K.addListener(new h0(i0Var, i10));
                    i0Var.K.setInterpolator(xq.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    nh nhVar3 = i0Var.a;
                    if (nhVar3 != null) {
                        nhVar3.x();
                    }
                    if (i0Var.H) {
                        p2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
