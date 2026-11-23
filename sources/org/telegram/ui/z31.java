package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z31 extends org.telegram.ui.Components.k71 {
    public boolean W;
    public final /* synthetic */ b51 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(b51 b51Var, Activity activity) {
        super(activity, null);
        this.a0 = b51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b51 b51Var = this.a0;
            if (b51Var.k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = b51Var.k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - b51Var.k0.getX(), motionEvent.getY() - b51Var.k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.b1.b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.W = z10;
                    }
                }
            }
            z10 = false;
            this.W = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.k71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.k71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && y(motionEvent);
    }

    @Override // org.telegram.ui.Components.k71
    public final void r() {
        b51 b51Var = this.a0;
        b51Var.p0(b51Var.i0.getCurrentPosition(), true);
        b51Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        b51 b51Var = this.a0;
        float positionAnimated = b51Var.i0.getPositionAnimated();
        b51Var.q0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        b51Var.p0(Math.round(positionAnimated), true);
    }
}
