package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final f61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final t7 h;

    public v7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j3;
        this.b = f6Var;
        this.h = new t7(j3, i11, i10, z10);
        f61 f61Var = new f61(context, i11, i12, true, new u7(this, 0), new r5.d(this, 27), null, f6Var);
        this.a = f61Var;
        addView(f61Var, w7.x5.c(-1.0f, -1));
        f61Var.setOnScrollListener(new kb0(this, 22));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        f61 f61Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                f61Var.Y2.N(true);
                return;
            }
            return;
        }
        f61Var.Y2.N(true);
        if (f61Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < f61Var.getChildCount(); i13++) {
                if (!(f61Var.getChildAt(i13) instanceof t00)) {
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
