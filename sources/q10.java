// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class q10 extends d79 {
    public boolean f3;
    public final /* synthetic */ j20 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(j20 j20Var, Activity activity) {
        super(activity, null);
        this.g3 = j20Var;
    }

    @Override // d79
    public final boolean G0(float f) {
        j20 j20Var = this.g3;
        return f < j20Var.x1.getY() - ((float) j20Var.r1.getTop());
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j20 j20Var = this.g3;
        int i5 = j20Var.l2;
        if (i5 != -1 && !j20Var.m1.o0) {
            this.f3 = true;
            j20Var.s1.g1(i5, j20Var.m2 - j20Var.r1.getPaddingTop());
            super.onLayout(false, i, i2, i3, i4);
            this.f3 = false;
            j20Var.l2 = -1;
            return;
        }
        if (j20Var.k2) {
            j20Var.k2 = false;
            this.f3 = true;
            if (j20Var.N0(true)) {
                super.onLayout(false, i, i2, i3, i4);
            }
            this.f3 = false;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
