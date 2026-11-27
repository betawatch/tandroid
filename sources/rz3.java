// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rz3 extends d79 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ o24 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz3(o24 o24Var, Context context) {
        super(context, null);
        this.h3 = o24Var;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rw2 e = rw2.e();
        o24 o24Var = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, o24Var.i0, o24Var.h2, this.o2);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o24 o24Var = this.h3;
        if (o24Var.r0 && o24Var.o0.H > 1) {
            this.f3 = true;
            o24Var.j0.g1(0, 0);
            o24Var.p0.setVisibility(0);
            o24Var.q0.k(0, 0);
            o24Var.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        o24Var.k(true);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
