package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.v91 {
    public boolean V;
    public final /* synthetic */ y91 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(y91 y91Var, Activity activity) {
        super(activity, null);
        this.W = y91Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y91 y91Var = this.W;
            if (y91Var.j0 != null) {
                View currentView = getCurrentView();
                ke keVar = y91Var.j0;
                if (currentView == keVar) {
                    boolean G = keVar.G(motionEvent.getX() - y91Var.j0.getX(), motionEvent.getY() - y91Var.j0.getY());
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

    @Override // org.telegram.ui.Components.v91, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.v91
    public final void u() {
        y91 y91Var = this.W;
        y91Var.l0(y91Var.h0.getCurrentPosition(), true);
        y91Var.m0(0.0f, false);
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        y91 y91Var = this.W;
        float positionAnimated = y91Var.h0.getPositionAnimated();
        y91Var.m0(positionAnimated, !z10);
        if (z10) {
            return;
        }
        y91Var.l0(Math.round(positionAnimated), true);
    }
}
