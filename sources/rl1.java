// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rl1 {
    public final byte a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final /* synthetic */ tl1 g;

    /* JADX WARN: Multi-variable type inference failed */
    public rl1(tl1 tl1Var, int i) {
        this.g = tl1Var;
        this.a = i;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(ng0.D1);
        this.e.addUpdateListener(new f0(this, (byte) 28));
        this.e.start();
    }
}
