package zf;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        w1 w1Var = this.d;
        boolean contains = w1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f != contains) {
            w1Var.f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.G;
                this.a = v1Var != null ? v1Var.get() : w1Var.D.c;
                this.b = false;
            }
        }
        return w1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w1 w1Var = this.d;
        if (w1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / w1Var.e.height();
            float f13 = w1Var.C;
            float f14 = w1Var.B;
            float a2 = h7.n.a(com.google.android.recaptcha.internal.a.z(f13, f14, y10, f12), f14, f13);
            v1 v1Var = w1Var.G;
            if (v1Var != null) {
                v1Var.c0(a2);
            } else {
                w1Var.D.c = a2;
            }
            w1Var.w.d(a2, true);
            Runnable runnable = w1Var.E;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f;
    }
}
