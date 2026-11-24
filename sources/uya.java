// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uya extends wgc {
    public boolean W;
    public final /* synthetic */ xza a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uya(xza xzaVar, Activity activity) {
        super(activity, null);
        this.a0 = xzaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            xza xzaVar = this.a0;
            if (xzaVar.k0 != null) {
                View currentView = getCurrentView();
                ik1 ik1Var = xzaVar.k0;
                if (currentView == ik1Var) {
                    boolean H = ik1Var.H(motionEvent.getX() - xzaVar.k0.getX(), motionEvent.getY() - xzaVar.k0.getY());
                    ik1Var.Q0 = H;
                    if (H && ik1Var.a1.b.canScrollHorizontally(-1)) {
                        z = true;
                        this.W = z;
                    }
                }
            }
            z = false;
            this.W = z;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th;
        }
    }

    @Override // wgc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // wgc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && B(motionEvent);
    }

    @Override // wgc
    public final void t() {
        xza xzaVar = this.a0;
        xzaVar.p0(xzaVar.i0.getCurrentPosition(), true);
        xzaVar.q0(false, 0.0f);
    }

    @Override // wgc
    public final void w(boolean z) {
        xza xzaVar = this.a0;
        float positionAnimated = xzaVar.i0.getPositionAnimated();
        xzaVar.q0(!z, positionAnimated);
        if (z) {
            return;
        }
        xzaVar.p0(Math.round(positionAnimated), true);
    }
}
