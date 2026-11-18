package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.l9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                l1 l1Var = m1Var.L;
                this.a = l1Var != null ? l1Var.get() : m1Var.I.c;
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
            float f13 = m1Var.H;
            float f14 = m1Var.G;
            float a10 = l9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            l1 l1Var = m1Var.L;
            if (l1Var != null) {
                l1Var.y1(a10);
            } else {
                m1Var.I.c = a10;
            }
            m1Var.x.e(true, a10);
            Runnable runnable = m1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            m1Var.invalidate();
        }
        return m1Var.f;
    }
}
