package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s51 extends org.telegram.ui.Components.w71 {
    public boolean V;
    public final /* synthetic */ u61 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(u61 u61Var, Activity activity) {
        super(activity, null);
        this.W = u61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u61 u61Var = this.W;
            if (u61Var.j0 != null) {
                View currentView = getCurrentView();
                le leVar = u61Var.j0;
                if (currentView == leVar) {
                    boolean G = leVar.G(motionEvent.getX() - u61Var.j0.getX(), motionEvent.getY() - u61Var.j0.getY());
                    leVar.Q0 = G;
                    if (G && leVar.a1.b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.V = z10;
                    }
                }
            }
            z10 = false;
            this.V = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.V = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.V = false;
            }
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.w71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.w71
    public final void u() {
        u61 u61Var = this.W;
        u61Var.o0(u61Var.h0.getCurrentPosition(), true);
        u61Var.p0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.w71
    public final void w(boolean z10) {
        u61 u61Var = this.W;
        float positionAnimated = u61Var.h0.getPositionAnimated();
        u61Var.p0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        u61Var.o0(Math.round(positionAnimated), true);
    }
}
