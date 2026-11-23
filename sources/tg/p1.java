package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.m9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ r1 d;

    public p1(r1 r1Var) {
        this.d = r1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        r1 r1Var = this.d;
        boolean contains = r1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (r1Var.f != contains) {
            r1Var.f = contains;
            r1Var.invalidate();
            if (contains) {
                q1 q1Var = r1Var.L;
                this.a = q1Var != null ? q1Var.get() : r1Var.I.c;
                this.b = false;
            }
        }
        return r1Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r1 r1Var = this.d;
        if (r1Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / r1Var.e.height();
            float f13 = r1Var.H;
            float f14 = r1Var.G;
            float a10 = m9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            q1 q1Var = r1Var.L;
            if (q1Var != null) {
                q1Var.h2(a10);
            } else {
                r1Var.I.c = a10;
            }
            r1Var.x.e(true, a10);
            Runnable runnable = r1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            r1Var.invalidate();
        }
        return r1Var.f;
    }
}
