package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class z31 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final /* synthetic */ c51 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(c51 c51Var, Activity activity) {
        super(activity, null);
        this.W = c51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c51 c51Var = this.W;
            if (c51Var.j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = c51Var.j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - c51Var.j0.getX(), motionEvent.getY() - c51Var.j0.getY());
                    zdVar.Q0 = G;
                    if (G && zdVar.a1.b.canScrollHorizontally(-1)) {
                        z9 = true;
                        this.V = z9;
                    }
                }
            }
            z9 = false;
            this.V = z9;
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

    @Override // org.telegram.ui.Components.v61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.v61
    public final void u() {
        c51 c51Var = this.W;
        c51Var.p0(c51Var.h0.getCurrentPosition(), true);
        c51Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        c51 c51Var = this.W;
        float positionAnimated = c51Var.h0.getPositionAnimated();
        c51Var.q0(!z9, positionAnimated);
        if (z9) {
            return;
        }
        c51Var.p0(Math.round(positionAnimated), true);
    }
}
