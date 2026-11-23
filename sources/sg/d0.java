package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ w0 c;

    public /* synthetic */ d0(h0 h0Var, w0 w0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
        this.c = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        w0 w0Var = this.c;
        h0 h0Var = this.b;
        switch (i7) {
            case 0:
                h0Var.c = w0Var;
                if (h0Var.h == null) {
                    h0Var.h = new RectF();
                }
                h0Var.c.a(h0Var.h);
                nd0 nd0Var = h0Var.a;
                if (nd0Var != null) {
                    nd0Var.p();
                    break;
                }
                break;
            default:
                if (w0Var != null && h0Var.q == 0) {
                    h0Var.q = h1.b(h0Var.g);
                }
                int i10 = 0;
                if (h0Var.H == (w0Var != null)) {
                    if (w0Var != h0Var.d) {
                        h0Var.d = w0Var;
                        nd0 nd0Var2 = h0Var.a;
                        if (nd0Var2 != null) {
                            nd0Var2.p();
                            break;
                        }
                    }
                } else {
                    h0Var.H = w0Var != null;
                    ValueAnimator valueAnimator = h0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        h0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(h0Var.I, h0Var.H ? 1.0f : 0.0f);
                    h0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new c0(h0Var, i10));
                    h0Var.K.addListener(new g0(h0Var, i10));
                    h0Var.K.setInterpolator(kr.h);
                    h0Var.K.start();
                    h0Var.d = w0Var;
                    nd0 nd0Var3 = h0Var.a;
                    if (nd0Var3 != null) {
                        nd0Var3.p();
                    }
                    if (h0Var.H) {
                        q2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
