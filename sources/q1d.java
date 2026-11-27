// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q1d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ w1d a;
    public final /* synthetic */ l2d b;
    public final /* synthetic */ l2d c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public q1d(w1d w1dVar, l2d l2dVar, l2d l2dVar2, int i, View view) {
        this.a = w1dVar;
        this.b = l2dVar;
        this.c = l2dVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w1d w1dVar = this.a;
        v1d v1dVar = w1dVar.a;
        v1dVar.d(animatedFraction);
        float b = v1dVar.b();
        PathInterpolator pathInterpolator = s1d.e;
        int i = Build.VERSION.SDK_INT;
        l2d l2dVar = this.b;
        b2d a2dVar = i >= 34 ? new a2d(l2dVar) : i >= 30 ? new z1d(l2dVar) : i >= 29 ? new y1d(l2dVar) : new x1d(l2dVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            i2d i2dVar = l2dVar.a;
            if (i3 == 0) {
                a2dVar.c(i2, i2dVar.f(i2));
            } else {
                mq5 f = i2dVar.f(i2);
                mq5 f2 = this.c.a.f(i2);
                float f3 = 1.0f - b;
                a2dVar.c(i2, l2d.e(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        s1d.g(this.e, a2dVar.b(), Collections.singletonList(w1dVar));
    }
}
