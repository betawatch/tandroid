// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rwa extends wec {
    public boolean W;
    public final /* synthetic */ uxa a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwa(uxa uxaVar, Activity activity) {
        super(activity, null);
        this.a0 = uxaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            uxa uxaVar = this.a0;
            if (uxaVar.k0 != null) {
                View currentView = getCurrentView();
                zi1 zi1Var = uxaVar.k0;
                if (currentView == zi1Var) {
                    boolean H = zi1Var.H(motionEvent.getX() - uxaVar.k0.getX(), motionEvent.getY() - uxaVar.k0.getY());
                    zi1Var.Q0 = H;
                    if (H && zi1Var.a1.b.canScrollHorizontally(-1)) {
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

    @Override // wec, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // wec, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && B(motionEvent);
    }

    @Override // wec
    public final void u() {
        uxa uxaVar = this.a0;
        uxaVar.o0(uxaVar.i0.getCurrentPosition(), true);
        uxaVar.p0(false, 0.0f);
    }

    @Override // wec
    public final void w(boolean z) {
        uxa uxaVar = this.a0;
        float positionAnimated = uxaVar.i0.getPositionAnimated();
        uxaVar.p0(!z, positionAnimated);
        if (z) {
            return;
        }
        uxaVar.o0(Math.round(positionAnimated), true);
    }
}
