package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j c;
    public final /* synthetic */ gf.c d;

    public i(gf.c cVar, View view, ArrayList arrayList, j jVar) {
        this.d = cVar;
        this.a = view;
        this.b = arrayList;
        this.c = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y10;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        gf.c cVar = this.d;
        int i7 = paddingLeft - cVar.a;
        int i10 = paddingTop - cVar.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((f) obj).getBounds().contains(i7, i10)) {
                cVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        gf.c cVar = this.d;
        if (cVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            cVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i7 = paddingLeft - cVar.a;
            int i10 = paddingTop - cVar.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                f fVar = (f) obj;
                if (fVar.getBounds().contains(i7, i10)) {
                    this.c.m(fVar, i7, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
