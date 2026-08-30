package zf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ i c;

    public f(i iVar) {
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
        k kVar = iVar.c.u;
        if ((f10 / 7.0f) + ((float) kVar.i) >= iVar.getWidth() / 2.0f) {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        kVar.i = i.a(displayMetrics, f12);
        iVar.d.u.i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.u.i));
        iVar.c.f();
        iVar.d.f();
        iVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.c;
        int i10 = iVar.C;
        if (!iVar.n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.r);
        }
        if (!iVar.f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.a = (float) iVar.c.u.i;
            this.b = (float) iVar.d.u.i;
            iVar.f = true;
        }
        if (iVar.f && !iVar.n) {
            iVar.c.u.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            iVar.d.u.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            iVar.c.f();
            iVar.d.f();
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
