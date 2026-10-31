package vh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.r8 b;
    public final org.telegram.ui.Components.g9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public g5(Activity activity, int i10) {
        super(activity);
        this.a = i10;
        this.b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
        addView(g9Var, w7.b6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.85f, -1));
        addView(textView2, w7.b6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.i0.I2(cd.L0(2131748817, null), false, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z11) {
            setVisibility(z10 ? 0 : 8);
            setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(gr.h).withEndAction(new yv0(13, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i10 = this.a;
        long e = inputPeer == null ? d20.i(i10).e() : org.telegram.messenger.o5.n(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.g9 g9Var = this.c;
        org.telegram.ui.Components.r8 r8Var = this.b;
        if (e >= 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(e));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            textView.setText(h20.p(Z1));
            return;
        }
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-e));
        r8Var.q(L0);
        g9Var.e(L0, r8Var);
        textView.setText(L0 == null ? "" : L0.title);
    }
}
