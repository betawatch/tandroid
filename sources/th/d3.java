package th;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d3 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ z3 a;

    public d3(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        z3 z3Var = this.a;
        z3Var.d.abortAnimation();
        ValueAnimator valueAnimator = z3Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            z3Var.M.cancel();
            z3Var.M = null;
        }
        z3Var.L = false;
        z3Var.O.x = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        z3 z3Var = this.a;
        z3Var.d.fling((int) z3Var.e, 0, (int) (-f7), 0, (int) z3Var.f, (int) z3Var.h, 0, 0);
        z3Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        z3 z3Var = this.a;
        float f11 = z3Var.e + f7;
        z3Var.e = f11;
        float f12 = z3Var.f;
        if (f11 < f12) {
            z3Var.e = f12;
        }
        float f13 = z3Var.e;
        float f14 = z3Var.h;
        if (f13 > f14) {
            z3Var.e = f14;
        }
        z3Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        z3 z3Var = this.a;
        ArrayList arrayList = z3Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e3 e3Var = (e3) arrayList.get(i10);
            if (((e3) arrayList.get(i10)).a.P0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = z3Var.K;
                int i12 = e3Var.b;
                if (i11 != i12) {
                    z3Var.c(i12, true, false);
                } else {
                    z3Var.N.A(false);
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
