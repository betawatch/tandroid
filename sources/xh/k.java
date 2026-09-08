package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.a;
        if (!lVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (lVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= lVar.e.f.getRight() || lVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= lVar.e.f.getBottom())) {
            lVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
