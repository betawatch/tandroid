// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class oy9 extends FrameLayout {
    public final int a;
    public final pb0 b;
    public final be0 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public oy9(Context context, int i) {
        super(context);
        this.a = i;
        this.b = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(15.0f));
        addView(be0Var, nme.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, nme.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(bkb.p1(0.85f, -1));
        addView(textView2, nme.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(gl.G2(k96.M0(2131748615, null), false, gl.L(2.6666667f), gl.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
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
            ViewPropertyAnimator duration = animate().alpha(z ? 1.0f : 0.0f).setInterpolator(s33.h).withEndAction(new k08((byte) 11, (Object) this, z)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i = this.a;
        long e = inputPeer == null ? y6c.h(i).e() : cf3.m(inputPeer);
        TextView textView = this.d;
        be0 be0Var = this.c;
        pb0 pb0Var = this.b;
        if (e >= 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(e));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            textView.setText(l7c.q(V1));
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-e));
        pb0Var.p(K0);
        be0Var.f(K0, pb0Var);
        textView.setText(K0 == null ? "" : K0.title);
    }
}
