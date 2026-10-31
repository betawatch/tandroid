package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.ns0;
import org.telegram.ui.xz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w7 extends LinearLayout implements us {
    public long a;
    public final int b;
    public final xz c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final dq[] h;
    public final dq[] n;
    public ValueAnimator r;

    public w7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f = -1L;
        this.h = new dq[1];
        this.n = new dq[1];
        this.b = i10;
        this.a = d20.i(i10).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        sc.e.u(textView, 1, 13.0f, null, 2131745173);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, w7.b6.r(-2, -2, 5));
        xz xzVar = new xz(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = xzVar;
        xzVar.n = true;
        xzVar.getDrawable().r(false, true);
        xzVar.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(xzVar, i11, p6Var);
        xzVar.setTextSize(org.telegram.messenger.i0.L(13.0f));
        xzVar.setGravity(5);
        xzVar.setPadding(org.telegram.messenger.i0.L(19.0f), 0, 0, 0);
        addView(xzVar, w7.b6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.b;
        e6 y3 = e6.y(i10, false);
        e6 y10 = this.d ? e6.y(i10, true) : null;
        long j10 = 0;
        sf.a i11 = sf.a.i(0L, sf.b.b);
        xz xzVar = this.c;
        xzVar.a();
        if (this.a == d20.i(i10).e()) {
            z11 = !y3.e;
            j10 = y3.p().amount;
            if (y10 != null) {
                z11 |= !y10.e;
                i11 = y10.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = r.g(i10).h(this.a, false);
            boolean z12 = h == null || h.status == null;
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z12;
        }
        long j11 = this.f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 6));
            this.r.addListener(new ns0(this, 27));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(48.0f), xzVar), 0, this.e.length(), 33);
            }
            xzVar.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                dq[] dqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) h8.Z0(true, str, 0.62f, dqVarArr));
                dq dqVar = dqVarArr[0];
                if (dqVar != null) {
                    dqVar.a(org.telegram.ui.ActionBar.t6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) h8.Z0(false, i0.a.k(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            xzVar.setText(spannableStringBuilder);
        } else {
            xzVar.setText(cd.E(j10, ' '));
        }
        this.f = j10;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y3) {
            a(true);
        } else if (i10 == zs.C3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.b;
        zs.f(i10).c(this, zs.y3);
        zs.f(i10).c(this, zs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.b;
        zs.f(i10).n(this, zs.y3);
        zs.f(i10).n(this, zs.C3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        if (this.a != j10) {
            this.a = j10;
            a(true);
        }
    }
}
