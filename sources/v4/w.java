package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ y b;

    public w(y yVar) {
        this.b = yVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.a) {
            y yVar = this.b;
            View m10 = yVar.m(motionEvent);
            v vVar = yVar.y;
            if (m10 == null || (T = yVar.H.T(m10)) == null) {
                return;
            }
            RecyclerView recyclerView = yVar.H;
            int e10 = vVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i7 = yVar.x;
                if (pointerId == i7) {
                    int findPointerIndex = motionEvent.findPointerIndex(i7);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    yVar.d = x10;
                    yVar.e = y10;
                    yVar.r = 0.0f;
                    yVar.n = 0.0f;
                    if (vVar.k()) {
                        yVar.r(T, 2);
                    }
                }
            }
        }
    }
}
