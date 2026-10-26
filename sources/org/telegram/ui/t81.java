package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t81 extends org.telegram.ui.Components.u91 {
    public boolean V;
    public final /* synthetic */ w91 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(w91 w91Var, Activity activity) {
        super(activity, null);
        this.W = w91Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w91 w91Var = this.W;
            if (w91Var.j0 != null) {
                View currentView = getCurrentView();
                ke keVar = w91Var.j0;
                if (currentView == keVar) {
                    boolean G = keVar.G(motionEvent.getX() - w91Var.j0.getX(), motionEvent.getY() - w91Var.j0.getY());
                    keVar.Q0 = G;
                    if (G && keVar.a1.b.canScrollHorizontally(-1)) {
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

    @Override // org.telegram.ui.Components.u91, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.u91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.u91
    public final void u() {
        w91 w91Var = this.W;
        w91Var.l0(w91Var.h0.getCurrentPosition(), true);
        w91Var.m0(0.0f, false);
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        w91 w91Var = this.W;
        float positionAnimated = w91Var.h0.getPositionAnimated();
        w91Var.m0(positionAnimated, !z10);
        if (z10) {
            return;
        }
        w91Var.l0(Math.round(positionAnimated), true);
    }
}
