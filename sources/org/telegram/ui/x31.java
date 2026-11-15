package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x31 extends org.telegram.ui.Components.w61 {
    public boolean W;
    public final /* synthetic */ z41 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(z41 z41Var, Activity activity) {
        super(activity, null);
        this.a0 = z41Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z41 z41Var = this.a0;
            if (z41Var.k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = z41Var.k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - z41Var.k0.getX(), motionEvent.getY() - z41Var.k0.getY());
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

    @Override // org.telegram.ui.Components.w61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && z(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61
    public final void r() {
        z41 z41Var = this.a0;
        z41Var.p0(z41Var.i0.getCurrentPosition(), true);
        z41Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        z41 z41Var = this.a0;
        float positionAnimated = z41Var.i0.getPositionAnimated();
        z41Var.q0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        z41Var.p0(Math.round(positionAnimated), true);
    }
}
