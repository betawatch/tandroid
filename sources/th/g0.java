package th;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final d0 a;
    public final g9 b;
    public final r8 c;
    public final ImageView d;
    public final e0 e;
    public i0 f;

    public g0(Context context) {
        super(context);
        w7.e6.a(this);
        d0 d0Var = new d0(this, context);
        this.a = d0Var;
        d0Var.setOrientation(0);
        addView(d0Var, w7.b6.d(-2, -2.0f, zs.E1, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
        d0Var.addView(g9Var, w7.b6.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        d0Var.addView(imageView, w7.b6.t(18, 18, 19, 0, 0, 3, 0));
        e0 e0Var = new e0(context);
        this.e = e0Var;
        e0Var.setLines(1);
        e0Var.setSingleLine();
        e0Var.setTextColor(-1);
        e0Var.setTextSize(1, 14.0f);
        e0Var.setTypeface(org.telegram.messenger.i0.o());
        d0Var.addView(e0Var, w7.b6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(i0 i0Var) {
        this.f = i0Var;
        long j10 = i0Var.b;
        g9 g9Var = this.b;
        r8 r8Var = this.c;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(d20.s0).Z1(Long.valueOf(i0Var.b));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-i0Var.b));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        int i10 = i0Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new fq(getContext(), i0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(org.telegram.messenger.o5.l(d20.s0, i0Var.b));
        this.a.invalidate();
    }
}
