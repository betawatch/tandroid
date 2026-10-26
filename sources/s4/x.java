package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        e1 T;
        if (this.a) {
            z zVar = this.b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.x;
            if (m10 == null || (T = zVar.H.T(m10)) == null) {
                return;
            }
            RecyclerView recyclerView = zVar.H;
            int e = wVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((wVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = zVar.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x9 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    zVar.d = x9;
                    zVar.e = y3;
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
