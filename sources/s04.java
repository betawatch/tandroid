// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s04 extends ggc {
    public final /* synthetic */ e34 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s04(e34 e34Var, Context context) {
        super(context);
        this.x0 = e34Var;
    }

    @Override // ggc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.x0.f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // ggc
    public final void x(int i, boolean z) {
        e34 e34Var = this.x0;
        j14 j14Var = e34Var.J;
        e34Var.Q(i == 1);
        if (i != getCurrentItem()) {
            super.x(i, z);
            return;
        }
        if (i != 0) {
            if (i == 1) {
                e34Var.i0.z0(0);
                return;
            } else {
                e34Var.E0.z0(1);
                return;
            }
        }
        e34Var.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j14Var, (Property<j14, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(d53.h);
        ofFloat.start();
        e34Var.E(1, 0);
        if (j14Var != null) {
            j14Var.j(0, true);
        }
    }
}
