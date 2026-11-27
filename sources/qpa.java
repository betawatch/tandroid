// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qpa extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ rpa c;
    public final /* synthetic */ nk0 d;

    public qpa(nk0 nk0Var, View view, ArrayList arrayList, rpa rpaVar) {
        this.d = nk0Var;
        this.a = view;
        this.b = arrayList;
        this.c = rpaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y;
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        nk0 nk0Var = this.d;
        int i = paddingLeft - nk0Var.b;
        int i2 = paddingTop - nk0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((npa) obj).getBounds().contains(i, i2)) {
                nk0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        nk0 nk0Var = this.d;
        if (nk0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            nk0Var.a = false;
            int x = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = paddingLeft - nk0Var.b;
            int i2 = paddingTop - nk0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                npa npaVar = (npa) obj;
                if (npaVar.getBounds().contains(i, i2)) {
                    this.c.d(npaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
