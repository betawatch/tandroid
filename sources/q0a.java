// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class q0a extends FrameLayout {
    public final int a;
    public final pc0 b;
    public final bf0 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public q0a(Activity activity, int i) {
        super(activity);
        this.a = i;
        this.b = new pc0((ylb) null);
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(15.0f));
        addView(bf0Var, qoe.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, qoe.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(cmb.p1(0.85f, -1));
        addView(textView2, qoe.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(gm.F2(jb6.M0(2131748564, null), false, gm.L(2.6666667f), gm.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        set(null);
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z2) {
            setVisibility(z ? 0 : 8);
            setAlpha(z ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z ? 1.0f : 0.0f).setInterpolator(d53.h).withEndAction(new n28((byte) 11, (Object) this, z)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i = this.a;
        long e = inputPeer == null ? z8c.h(i).e() : pg3.m(inputPeer);
        TextView textView = this.d;
        bf0 bf0Var = this.c;
        pc0 pc0Var = this.b;
        if (e >= 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(e));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
            textView.setText(m9c.r(W1));
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-e));
        pc0Var.p(L0);
        bf0Var.f(L0, pc0Var);
        textView.setText(L0 == null ? "" : L0.title);
    }
}
