package th;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public u0(int i10) {
        ou0 ou0Var = w0.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        w0 w0Var = w0.Z;
        if (w0Var.H) {
            for (int i10 = 1; i10 < w0Var.e.getChildCount(); i10++) {
                View childAt = w0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    w0Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = w0Var.N;
        this.b = w0Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w0 w0Var = w0.Z;
        if (!w0Var.E || w0Var.F) {
            return false;
        }
        o1.j jVar = w0Var.P;
        jVar.a = f7;
        float f11 = w0Var.N;
        jVar.b = f11;
        jVar.c = true;
        jVar.m.i = (f7 / 7.0f) + ((w0Var.J / 2.0f) + f11) >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        w0Var.P.h();
        o1.j jVar2 = w0Var.Q;
        jVar2.a = f7;
        jVar2.b = w0Var.O;
        jVar2.c = true;
        jVar2.m.i = w7.u.a((f10 / 10.0f) + r10, org.telegram.messenger.i0.L(16.0f), (r3.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
        w0Var.Q.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w0 w0Var = w0.Z;
        if (!w0Var.E && w0Var.I == null && !w0Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                w0Var.E = true;
                w0Var.P.d();
                w0Var.Q.d();
            }
        }
        if (w0Var.E) {
            WindowManager.LayoutParams layoutParams = w0Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            w0Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = w0Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            w0Var.O = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(w0Var.b, w0Var.d, w0Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        w0 w0Var = w0.Z;
        sg.v vVar = w0Var.U;
        if (w0Var.I == null) {
            if (w0Var.T) {
                org.telegram.messenger.i0.r(vVar);
                w0Var.T = false;
            }
            boolean z10 = !w0Var.H;
            w0Var.H = z10;
            w0Var.j(z10);
            if (w0Var.H && !w0Var.T) {
                org.telegram.messenger.i0.h3(vVar, 2500L);
                w0Var.T = true;
            }
        }
        return true;
    }
}
