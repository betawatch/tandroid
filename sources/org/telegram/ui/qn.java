package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qn extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ co c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(co coVar, Context context) {
        super(context);
        this.c = coVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        co coVar = this.c;
        arrayList.add(coVar.K1);
        arrayList.add(coVar.x0);
        arrayList.add(coVar.X);
        arrayList.add(coVar.K3);
        arrayList.add(coVar.I1);
        arrayList.add(coVar.X2);
        arrayList.add(coVar.Y);
        arrayList.add(coVar.j1);
        arrayList.add(coVar.S);
        arrayList.add(coVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        co coVar = this.c;
        coVar.rc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        coVar.rc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        co coVar = this.c;
        coVar.rc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        coVar.rc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
