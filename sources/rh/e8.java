package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e8 extends FrameLayout implements vs {
    public final v51 a;
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
        v51 v51Var = new v51(context, i11, i12, true, new qh.d(this, 12), new d0(this, 8), null, p6Var);
        this.a = v51Var;
        addView(v51Var, w7.b6.c(-1.0f, -1));
        v51Var.setOnScrollListener(new cu0(this, 20));
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.z3;
        v51 v51Var = this.a;
        if (i10 != i12) {
            if (i10 == at.D3 && ((Long) objArr[0]).longValue() == this.f) {
                v51Var.f3.O(true);
                return;
            }
            return;
        }
        v51Var.f3.O(true);
        if (v51Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < v51Var.getChildCount(); i13++) {
                if (!(v51Var.getChildAt(i13) instanceof zz)) {
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
            at.f(i10).c(this, at.D3);
        } else {
            at.f(i10).c(this, at.z3);
        }
        this.a.f3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f;
        int i10 = this.c;
        if (j10 != 0) {
            at.f(i10).n(this, at.D3);
        } else {
            at.f(i10).n(this, at.z3);
        }
    }
}
