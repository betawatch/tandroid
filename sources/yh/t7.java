package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ug0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final r61 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j3;
        this.b = d6Var;
        this.h = new r7(j3, i11, i10, z10);
        r61 r61Var = new r61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, d6Var);
        this.a = r61Var;
        addView(r61Var, w7.y5.c(-1.0f, -1));
        r61Var.setOnScrollListener(new ug0(this, 20));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        r61 r61Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                r61Var.Y2.N(true);
                return;
            }
            return;
        }
        r61Var.Y2.N(true);
        if (r61Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < r61Var.getChildCount(); i13++) {
                if (!(r61Var.getChildAt(i13) instanceof u00)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f;
        int i10 = this.c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.a.Y2.N(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f;
        int i10 = this.c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
