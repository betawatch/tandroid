package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final e61 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final s7 h;

    public u7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j3;
        this.b = e6Var;
        this.h = new s7(j3, i11, i10, z10);
        e61 e61Var = new e61(context, i11, i12, true, new t7(this, 0), new r5.e(this, 26), null, e6Var);
        this.a = e61Var;
        addView(e61Var, w7.x5.c(-1.0f, -1));
        e61Var.setOnScrollListener(new kb0(this, 21));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        e61 e61Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                e61Var.Y2.N(true);
                return;
            }
            return;
        }
        e61Var.Y2.N(true);
        if (e61Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < e61Var.getChildCount(); i13++) {
                if (!(e61Var.getChildAt(i13) instanceof t00)) {
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
