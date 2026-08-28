package uf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ h c;

    public f(h hVar) {
        this.c = hVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        h hVar = this.c;
        if (!hVar.f || hVar.n) {
            return false;
        }
        k kVar = hVar.c.u;
        if ((f10 / 7.0f) + ((float) kVar.i) >= hVar.getWidth() / 2.0f) {
            displayMetrics = hVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = hVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        kVar.i = h.a(displayMetrics, f12);
        hVar.d.u.i = h.b(hVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) hVar.d.u.i));
        hVar.c.f();
        hVar.d.f();
        hVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.c;
        int i9 = hVar.B;
        if (!hVar.n) {
            AndroidUtilities.cancelRunOnUIThread(hVar.r);
        }
        if (!hVar.f && (Math.abs(f10) >= i9 || Math.abs(f11) >= i9)) {
            this.a = (float) hVar.c.u.i;
            this.b = (float) hVar.d.u.i;
            hVar.f = true;
        }
        if (hVar.f && !hVar.n) {
            hVar.c.u.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            hVar.d.u.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            hVar.c.f();
            hVar.d.f();
        }
        return hVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h hVar = this.c;
        if (hVar.n || hVar.s) {
            return false;
        }
        hVar.c(true);
        return true;
    }
}
