package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        e1 T;
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
