package u4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            if (m10 == null || (T = yVar.I.T(m10)) == null) {
                return;
            }
            RecyclerView recyclerView = yVar.I;
            int e10 = vVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i3 = yVar.x;
                if (pointerId == i3) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y9 = motionEvent.getY(findPointerIndex);
                    yVar.d = x10;
                    yVar.e = y9;
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
