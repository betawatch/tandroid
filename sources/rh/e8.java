package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e8 extends FrameLayout implements us {
    public final u51 a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final d8 h;

    public e8(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j10;
        this.b = p6Var;
        this.h = new d8(i11, i10, j10, z10);
        u51 u51Var = new u51(context, i11, i12, true, new qh.d(this, 12), new d0(this, 8), null, p6Var);
        this.a = u51Var;
        addView(u51Var, w7.b6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new bu0(this, 20));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.z3;
        u51 u51Var = this.a;
        if (i10 != i12) {
            if (i10 == zs.D3 && ((Long) objArr[0]).longValue() == this.f) {
                u51Var.f3.O(true);
                return;
            }
            return;
        }
        u51Var.f3.O(true);
        if (u51Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < u51Var.getChildCount(); i13++) {
                if (!(u51Var.getChildAt(i13) instanceof zz)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f;
        int i10 = this.c;
        if (j10 != 0) {
            zs.f(i10).c(this, zs.D3);
        } else {
            zs.f(i10).c(this, zs.z3);
        }
        this.a.f3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f;
        int i10 = this.c;
        if (j10 != 0) {
            zs.f(i10).n(this, zs.D3);
        } else {
            zs.f(i10).n(this, zs.z3);
        }
    }
}
