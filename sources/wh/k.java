package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
