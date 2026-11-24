// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tla extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ula c;
    public final /* synthetic */ mk0 d;

    public tla(mk0 mk0Var, View view, ArrayList arrayList, ula ulaVar) {
        this.d = mk0Var;
        this.a = view;
        this.b = arrayList;
        this.c = ulaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y;
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        mk0 mk0Var = this.d;
        int i = paddingLeft - mk0Var.b;
        int i2 = paddingTop - mk0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((qla) obj).getBounds().contains(i, i2)) {
                mk0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mk0 mk0Var = this.d;
        if (mk0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            mk0Var.a = false;
            int x = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = paddingLeft - mk0Var.b;
            int i2 = paddingTop - mk0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                qla qlaVar = (qla) obj;
                if (qlaVar.getBounds().contains(i, i2)) {
                    this.c.e(qlaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
