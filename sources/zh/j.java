package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import bi.dd;
import c8.ha;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends LinearLayout implements ls {
    public final k9 a;
    public final i6 b;
    public final i6 c;
    public final i6 d;
    public final wp[] e;
    public boolean f;

    public j(Context context, h6 h6Var) {
        super(context);
        this.e = new wp[1];
        setOrientation(0);
        i6 i6Var = new i6(context, false, false, false);
        this.c = i6Var;
        int i7 = m6.G6;
        t6.Y(i6Var, i7, h6Var);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        i6Var.setEllipsizeByGradient(true);
        i6 i6Var2 = new i6(context, false, false, false);
        this.d = i6Var2;
        t6.Y(i6Var2, m6.y6, h6Var);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        k9 k9Var = new k9(context);
        this.a = k9Var;
        i6 i6Var3 = new i6(context, false, false, false);
        this.b = i6Var3;
        i6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        t6.Y(i6Var3, i7, h6Var);
        i6Var3.setTypeface(org.telegram.messenger.g0.o());
        i6Var3.setGravity(17);
        addView(i6Var3, ha.p(66, -2, 0.0f, 16));
        addView(k9Var, ha.p(32, 32, 0.0f, 16));
        addView(i6Var, ha.p(0, -2, 1.0f, 16));
        addView(i6Var2, ha.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z9) {
        this.d.c(dd.a1(false, jg.g.m((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.e), z9, true);
    }

    public final void b(int i7, boolean z9, boolean z10) {
        i6 i6Var = this.b;
        if (!z9 || i7 > 3) {
            if (i7 >= 10000) {
                i6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
            } else if (i7 >= 1000) {
                i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            }
            i6Var.c(Integer.toString(i7), z10, true);
            return;
        }
        if (i7 == 1) {
            i6Var.c(org.telegram.messenger.i6.o("🥇", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
        } else if (i7 == 2) {
            i6Var.c(org.telegram.messenger.i6.o("🥈", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
        } else if (i7 == 3) {
            i6Var.c(org.telegram.messenger.i6.o("🥉", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
        }
    }

    public final void c(TLRPC.User user) {
        v8 v8Var = new v8((h6) null);
        v8Var.r(user);
        k9 k9Var = this.a;
        k9Var.e(user, v8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.c.setText(t10.p(user));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), m6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }
}
