package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.j9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ m1 d;

    public k1(m1 m1Var) {
        this.d = m1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        m1 m1Var = this.d;
        boolean contains = m1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (m1Var.f != contains) {
            m1Var.f = contains;
            m1Var.invalidate();
            if (contains) {
                l1 l1Var = m1Var.K;
                this.a = l1Var != null ? l1Var.get() : m1Var.H.c;
                this.b = false;
            }
        }
        return m1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m1 m1Var = this.d;
        if (m1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / m1Var.e.height();
            float f13 = m1Var.G;
            float f14 = m1Var.F;
            float a10 = j9.a(com.google.android.recaptcha.internal.a.z(f13, f14, y10, f12), f14, f13);
            l1 l1Var = m1Var.K;
            if (l1Var != null) {
                l1Var.X(a10);
            } else {
                m1Var.H.c = a10;
            }
            m1Var.x.e(true, a10);
            Runnable runnable = m1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            m1Var.invalidate();
        }
        return m1Var.f;
    }
}
