package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.h20;
import org.telegram.messenger.k6;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import rh.h8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends LinearLayout implements us {
    public final g9 a;
    public final f6 b;
    public final f6 c;
    public final f6 d;
    public final dq[] e;
    public boolean f;

    public j(Context context, p6 p6Var) {
        super(context);
        this.e = new dq[1];
        setOrientation(0);
        f6 f6Var = new f6(context, false, false, false);
        this.c = f6Var;
        int i10 = t6.G6;
        a7.Z(f6Var, i10, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        f6Var.setEllipsizeByGradient(true);
        f6 f6Var2 = new f6(context, false, false, false);
        this.d = f6Var2;
        a7.Z(f6Var2, t6.y6, p6Var);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        g9 g9Var = new g9(context);
        this.a = g9Var;
        f6 f6Var3 = new f6(context, false, false, false);
        this.b = f6Var3;
        f6Var3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var3.setPadding(org.telegram.messenger.i0.L(20.0f), 0, 0, 0);
        a7.Z(f6Var3, i10, p6Var);
        f6Var3.setTypeface(org.telegram.messenger.i0.o());
        f6Var3.setGravity(17);
        addView(f6Var3, b6.p(66, -2, 0.0f, 16));
        addView(g9Var, b6.p(32, 32, 0.0f, 16));
        addView(f6Var, b6.p(0, -2, 1.0f, 16));
        addView(f6Var2, b6.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(h8.Z0(false, i0.a.k((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        f6 f6Var = this.b;
        if (!z10 || i10 > 3) {
            if (i10 >= 10000) {
                f6Var.setTextSize(org.telegram.messenger.i0.L(12.0f));
            } else if (i10 >= 1000) {
                f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            } else {
                f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
            }
            f6Var.c(Integer.toString(i10), z11, true);
            return;
        }
        if (i10 == 1) {
            f6Var.c(k6.o("🥇", f6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        } else if (i10 == 2) {
            f6Var.c(k6.o("🥈", f6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        } else if (i10 == 3) {
            f6Var.c(k6.o("🥉", f6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        }
    }

    public final void c(TLRPC.User user) {
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        g9 g9Var = this.a;
        g9Var.e(user, r8Var);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        this.c.setText(h20.p(user));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.i0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f), getMeasuredHeight(), t6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
    }
}
