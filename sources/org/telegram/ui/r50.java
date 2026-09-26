package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final /* synthetic */ d60 L;

    public r50(d60 d60Var) {
        this.L = d60Var;
    }

    @Override // s4.j, s4.m0
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.Q.invalidate();
    }

    @Override // s4.j, s4.m0
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
            ofFloat.addUpdateListener(new c3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.q81(this, 23));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.rr.f);
            this.G.start();
            d60 d60Var = this.L;
            d60Var.Q.invalidate();
            d60Var.a2.invalidate();
        }
        super.m();
    }
}
