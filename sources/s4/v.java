package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ x b;

    public v(x xVar) {
        this.b = xVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        c1 T;
        if (this.a) {
            x xVar = this.b;
            View m10 = xVar.m(motionEvent);
            u uVar = xVar.y;
            if (m10 == null || (T = xVar.H.T(m10)) == null) {
                return;
            }
            RecyclerView recyclerView = xVar.H;
            int e = uVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.h0.a;
            if ((uVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = xVar.x;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    xVar.d = x10;
                    xVar.e = y3;
                    xVar.r = 0.0f;
                    xVar.n = 0.0f;
                    if (uVar.k()) {
                        xVar.r(T, 2);
                    }
                }
            }
        }
    }
}
