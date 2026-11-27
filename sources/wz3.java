// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wz3 extends f79 {
    public boolean g3;
    public final /* synthetic */ o24 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz3(o24 o24Var, Context context) {
        super(context, null);
        this.h3 = o24Var;
    }

    @Override // f79, d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        o24 o24Var = this.h3;
        j24 j24Var = o24Var.A0;
        byte b = 0;
        if (o24Var.D0 != null) {
            o24Var.C0.setUnderlineHeight(o24Var.E0.canScrollVertically(-1) ? hl.e1() : 0);
        }
        if (j24Var != null && getAdapter() == j24Var && j24Var.d == 0) {
            j24 j24Var2 = j24Var.P.x;
            if (j24Var2.R.H0.G || j24Var2.E) {
                return;
            }
            if (o24Var.F0.M0() + 50 > j24Var.b()) {
                i24 i24Var = j24Var.P;
                Objects.requireNonNull(i24Var);
                hl.c3(new vz3(i24Var, b));
            }
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o24 o24Var = this.h3;
        if (o24Var.f) {
            return false;
        }
        rw2 e = rw2.e();
        wz3 wz3Var = o24Var.E0;
        o24Var.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, wz3Var, o24Var.h2, this.o2);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o24 o24Var = this.h3;
        if (o24Var.J0 && o24Var.z0.b() > 0) {
            this.g3 = true;
            o24Var.F0.g1(0, 0);
            o24Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        o24Var.n(true);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
