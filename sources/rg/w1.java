package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ y1 d;

    public w1(y1 y1Var) {
        this.d = y1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        y1 y1Var = this.d;
        boolean contains = y1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (y1Var.f != contains) {
            y1Var.f = contains;
            y1Var.invalidate();
            if (contains) {
                x1 x1Var = y1Var.K;
                this.a = x1Var != null ? x1Var.get() : y1Var.H.c;
                this.b = false;
            }
        }
        return y1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        y1 y1Var = this.d;
        if (y1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f11 = this.a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / y1Var.e.height();
            float f12 = y1Var.G;
            float f13 = y1Var.F;
            float a2 = w7.p.a(com.google.android.gms.internal.vision.e2.z(f12, f13, y3, f11), f13, f12);
            x1 x1Var = y1Var.K;
            if (x1Var != null) {
                x1Var.H(a2);
            } else {
                y1Var.H.c = a2;
            }
            y1Var.w.d(a2, true);
            Runnable runnable = y1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            y1Var.invalidate();
        }
        return y1Var.f;
    }
}
