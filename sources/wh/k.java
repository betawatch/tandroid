package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ List b;
    public final /* synthetic */ l c;
    public final /* synthetic */ m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.a = view;
        this.b = list;
        this.c = lVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y3;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = paddingLeft - mVar.c;
        int i11 = paddingTop - mVar.d;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((h) it.next()).getBounds().contains(i10, i11)) {
                mVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            mVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = paddingLeft - mVar.c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.c.o(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
