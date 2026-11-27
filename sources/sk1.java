// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sk1 {
    public final byte a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final /* synthetic */ uk1 g;

    /* JADX WARN: Multi-variable type inference failed */
    public sk1(uk1 uk1Var, int i) {
        this.g = uk1Var;
        this.a = i;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(pf0.D1);
        this.e.addUpdateListener(new g0(this, (byte) 27));
        this.e.start();
    }
}
