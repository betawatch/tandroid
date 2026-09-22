package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final /* synthetic */ i60 L;

    public w50(i60 i60Var) {
        this.L = i60Var;
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
            ofFloat.addUpdateListener(new b3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.v81(this, 22));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.qr.f);
            this.G.start();
            i60 i60Var = this.L;
            i60Var.Q.invalidate();
            i60Var.a2.invalidate();
        }
        super.m();
    }
}
