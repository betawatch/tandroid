// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p10 extends o39 {
    public boolean f3;
    public final /* synthetic */ i20 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(i20 i20Var, Activity activity) {
        super(activity, null);
        this.g3 = i20Var;
    }

    @Override // o39
    public final boolean F0(float f) {
        i20 i20Var = this.g3;
        return f < i20Var.x1.getY() - ((float) i20Var.r1.getTop());
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i20 i20Var = this.g3;
        int i5 = i20Var.l2;
        if (i5 != -1 && !i20Var.m1.o0) {
            this.f3 = true;
            i20Var.s1.g1(i5, i20Var.m2 - i20Var.r1.getPaddingTop());
            super.onLayout(false, i, i2, i3, i4);
            this.f3 = false;
            i20Var.l2 = -1;
            return;
        }
        if (i20Var.k2) {
            i20Var.k2 = false;
            this.f3 = true;
            if (i20Var.M0(true)) {
                super.onLayout(false, i, i2, i3, i4);
            }
            this.f3 = false;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
