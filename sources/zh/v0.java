package zh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public v0(int i10) {
        sv0 sv0Var = x0.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        x0 x0Var = x0.Z;
        if (x0Var.H) {
            for (int i10 = 1; i10 < x0Var.e.getChildCount(); i10++) {
                View childAt = x0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    x0Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = x0Var.N;
        this.b = x0Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x0 x0Var = x0.Z;
        if (!x0Var.E || x0Var.F) {
            return false;
        }
        o1.k kVar = x0Var.P;
        kVar.a = f7;
        float f11 = x0Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((x0Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        x0Var.P.f();
        o1.k kVar2 = x0Var.Q;
        kVar2.a = f7;
        kVar2.b = x0Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
        x0Var.Q.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x0 x0Var = x0.Z;
        if (!x0Var.E && x0Var.I == null && !x0Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                x0Var.E = true;
                x0Var.P.c();
                x0Var.Q.c();
            }
        }
        if (x0Var.E) {
            WindowManager.LayoutParams layoutParams = x0Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            x0Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = x0Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            x0Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(x0Var.b, x0Var.d, x0Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        x0 x0Var = x0.Z;
        xh.x xVar = x0Var.U;
        if (x0Var.I == null) {
            if (x0Var.T) {
                AndroidUtilities.cancelRunOnUIThread(xVar);
                x0Var.T = false;
            }
            boolean z10 = !x0Var.H;
            x0Var.H = z10;
            x0Var.p(z10);
            if (x0Var.H && !x0Var.T) {
                AndroidUtilities.runOnUIThread(xVar, 2500L);
                x0Var.T = true;
            }
        }
        return true;
    }
}
