package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ z b;

    public x(z zVar) {
        this.b = zVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        f1 T;
        if (this.a) {
            z zVar = this.b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.y;
            if (m10 == null || (T = zVar.I.T(m10)) == null) {
                return;
            }
            RecyclerView recyclerView = zVar.I;
            int e10 = wVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((wVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i7 = zVar.x;
                if (pointerId == i7) {
                    int findPointerIndex = motionEvent.findPointerIndex(i7);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    zVar.d = x10;
                    zVar.e = y10;
                    zVar.r = 0.0f;
                    zVar.n = 0.0f;
                    if (wVar.k()) {
                        zVar.r(T, 2);
                    }
                }
            }
        }
    }
}
