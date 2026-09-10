package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n nVar = this.a;
        if (!nVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (nVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= nVar.e.f.getRight() || nVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= nVar.e.f.getBottom())) {
            nVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
