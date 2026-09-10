package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        c1 T;
        if (this.a) {
            y yVar = this.b;
            View k10 = yVar.k(motionEvent);
            v vVar = yVar.x;
            if (k10 == null || (T = yVar.H.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = yVar.H;
            int e = vVar.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.i0.a;
            if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = yVar.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    yVar.d = x10;
                    yVar.e = y3;
                    yVar.r = 0.0f;
                    yVar.n = 0.0f;
                    if (vVar.k()) {
                        yVar.p(T, 2);
                    }
                }
            }
        }
    }
}
