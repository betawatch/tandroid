// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yua extends LinearLayout implements gk7 {
    public long a;
    public final int b;
    public final yf2 c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public yua(int i, wjb wjbVar, Context context) {
        super(context);
        this.e = -1L;
        this.b = i;
        this.a = y6c.h(i).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        ir2.r(13.0f, 1, 2131744918, textView, null);
        textView.setGravity(5);
        textView.setTypeface(gl.o());
        addView(textView, nme.r(-2, -2, 5));
        yf2 yf2Var = new yf2(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = yf2Var;
        yf2Var.n = true;
        yf2Var.getDrawable().r(false, true);
        yf2Var.setTypeface(gl.o());
        zkb.U(yf2Var, i2, wjbVar);
        yf2Var.setTextSize(gl.L(13.0f));
        yf2Var.setGravity(5);
        yf2Var.setPadding(gl.L(19.0f), 0, 0, 0);
        addView(yf2Var, nme.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(gl.L(15.0f), gl.L(4.0f), gl.L(15.0f), gl.L(4.0f));
    }

    public final void a(boolean z) {
        long j;
        boolean z2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i = this.b;
        gta v = gta.v(i, false);
        yf2 yf2Var = this.c;
        yf2Var.a();
        if (this.a == y6c.h(i).e()) {
            z2 = !v.e;
            j = v.m().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = ct0.g(i).h(this.a, false);
            boolean z3 = h == null || h.status == null;
            j = (h == null || (tL_starsRevenueStatus = h.status) == null) ? 0L : tL_starsRevenueStatus.current_balance.amount;
            z2 = z3;
        }
        long j2 = this.e;
        if (j > j2 && j2 != -1) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new gja(this, (byte) 6));
            this.f.addListener(new ng9(this, (byte) 20));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (!z2) {
            yf2Var.setText(k96.E(j, ' '));
            this.e = j;
            return;
        }
        if (this.d == null) {
            SpannableString spannableString = new SpannableString("x");
            this.d = spannableString;
            spannableString.setSpan(new u86(gl.L(48.0f), yf2Var), 0, this.d.length(), 33);
        }
        yf2Var.c(this.d, z, true);
        this.e = -1L;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z3) {
            a(true);
        } else if (i == kk7.D3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i = this.b;
        kk7.f(i).b(this, kk7.z3);
        kk7.f(i).b(this, kk7.D3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.b;
        kk7.f(i).n(this, kk7.z3);
        kk7.f(i).n(this, kk7.D3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        if (this.a != j) {
            this.a = j;
            a(true);
        }
    }
}
