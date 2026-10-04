package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class s91 extends org.telegram.ui.Components.g91 {
    public boolean U;
    public final /* synthetic */ va1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(va1 va1Var, Activity activity) {
        super(activity, null);
        this.V = va1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            va1 va1Var = this.V;
            if (va1Var.j0 != null) {
                View currentView = getCurrentView();
                me meVar = va1Var.j0;
                if (currentView == meVar) {
                    boolean z02 = meVar.z0(motionEvent.getX() - va1Var.j0.getX(), motionEvent.getY() - va1Var.j0.getY());
                    meVar.T1 = z02;
                    if (z02 && meVar.d2.b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.U = z10;
                    }
                }
            }
            z10 = false;
            this.U = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.U = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.U = false;
            }
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.g91, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.U && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.g91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.U && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.g91
    public final void u() {
        va1 va1Var = this.V;
        va1Var.k0(va1Var.h0.getCurrentPosition(), true);
        va1Var.l0(0.0f, false);
    }

    @Override // org.telegram.ui.Components.g91
    public final void w(boolean z10) {
        va1 va1Var = this.V;
        float positionAnimated = va1Var.h0.getPositionAnimated();
        va1Var.l0(positionAnimated, !z10);
        if (z10) {
            return;
        }
        va1Var.k0(Math.round(positionAnimated), true);
    }
}
