package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ d0(i0 i0Var, x0 x0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
        this.c = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x0 x0Var = this.c;
        i0 i0Var = this.b;
        switch (i7) {
            case 0:
                i0Var.c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.c.a(i0Var.h);
                hn hnVar = i0Var.a;
                if (hnVar != null) {
                    hnVar.l();
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
                        hn hnVar2 = i0Var.a;
                        if (hnVar2 != null) {
                            hnVar2.l();
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
                    ofFloat.addUpdateListener(new c0(i0Var, i10));
                    i0Var.K.addListener(new g0(i0Var, i10));
                    i0Var.K.setInterpolator(lr.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    hn hnVar3 = i0Var.a;
                    if (hnVar3 != null) {
                        hnVar3.l();
                    }
                    if (i0Var.H) {
                        q2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
