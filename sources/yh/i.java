package yh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j c;
    public final /* synthetic */ df.c d;

    public i(df.c cVar, View view, ArrayList arrayList, j jVar) {
        this.d = cVar;
        this.a = view;
        this.b = arrayList;
        this.c = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y9;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        df.c cVar = this.d;
        int i3 = paddingLeft - cVar.a;
        int i10 = paddingTop - cVar.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((f) obj).getBounds().contains(i3, i10)) {
                cVar.b = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        df.c cVar = this.d;
        if (cVar.b) {
            View view = this.a;
            view.playSoundEffect(0);
            cVar.b = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i3 = paddingLeft - cVar.a;
            int i10 = paddingTop - cVar.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                f fVar = (f) obj;
                if (fVar.getBounds().contains(i3, i10)) {
                    this.c.l(fVar, i3, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
