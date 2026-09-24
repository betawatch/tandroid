package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ List b;
    public final /* synthetic */ k c;
    public final /* synthetic */ l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.a = view;
        this.b = list;
        this.c = kVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y3;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = paddingLeft - lVar.c;
        int i11 = paddingTop - lVar.d;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).getBounds().contains(i10, i11)) {
                lVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            lVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = paddingLeft - lVar.c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
