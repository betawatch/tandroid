package wf;

import android.animation.ValueAnimator;
import oh.f5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h {
    public final int a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final /* synthetic */ j g;

    public h(j jVar, int i10) {
        this.g = jVar;
        this.a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.z1);
        this.e.addUpdateListener(new f5(this, 25));
        this.e.start();
    }
}
