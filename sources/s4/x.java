package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        d1 T;
        if (this.a) {
            z zVar = this.b;
            View k10 = zVar.k(motionEvent);
            w wVar = zVar.x;
            if (k10 == null || (T = zVar.H.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = zVar.H;
            int e7 = wVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = zVar.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    zVar.d = x10;
                    zVar.e = y3;
                    zVar.r = 0.0f;
                    zVar.n = 0.0f;
                    if (wVar.k()) {
                        zVar.p(T, 2);
                    }
                }
            }
        }
    }
}
