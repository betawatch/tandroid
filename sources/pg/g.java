package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ i c;

    public g(i iVar) {
        this.c = iVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.c;
        if (!iVar.f || iVar.n) {
            return false;
        }
        r1.h hVar = iVar.c.m;
        if ((f10 / 7.0f) + ((float) hVar.i) >= iVar.getWidth() / 2.0f) {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        hVar.i = i.a(displayMetrics, f12);
        iVar.d.m.i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.m.i));
        iVar.c.h();
        iVar.d.h();
        iVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.c;
        int i7 = iVar.G;
        if (!iVar.n) {
            g0.r(iVar.r);
        }
        if (!iVar.f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.a = (float) iVar.c.m.i;
            this.b = (float) iVar.d.m.i;
            iVar.f = true;
        }
        if (iVar.f && !iVar.n) {
            iVar.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            iVar.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            iVar.c.h();
            iVar.d.h();
        }
        return iVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.c;
        if (iVar.n || iVar.s) {
            return false;
        }
        iVar.c(true);
        return true;
    }
}
