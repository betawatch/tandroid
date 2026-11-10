package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t30 extends v4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final /* synthetic */ f40 L;

    public t30(f40 f40Var) {
        this.L = f40Var;
    }

    @Override // v4.k, v4.l0
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.K1.invalidate();
    }

    @Override // v4.k, v4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 14));
            this.G.addListener(new g30(this, 1));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.wq.f);
            this.G.start();
            f40 f40Var = this.L;
            f40Var.K1.invalidate();
            f40Var.U3.invalidate();
        }
        super.m();
    }
}
