// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class una extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ vna c;
    public final /* synthetic */ ml0 d;

    public una(ml0 ml0Var, View view, ArrayList arrayList, vna vnaVar) {
        this.d = ml0Var;
        this.a = view;
        this.b = arrayList;
        this.c = vnaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y;
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        ml0 ml0Var = this.d;
        int i = paddingLeft - ml0Var.b;
        int i2 = paddingTop - ml0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((rna) obj).getBounds().contains(i, i2)) {
                ml0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ml0 ml0Var = this.d;
        if (ml0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            ml0Var.a = false;
            int x = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = paddingLeft - ml0Var.b;
            int i2 = paddingTop - ml0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                rna rnaVar = (rna) obj;
                if (rnaVar.getBounds().contains(i, i2)) {
                    this.c.d(rnaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
