package xh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k6;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.f00;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v2 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new v2());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        Object obj = b51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                w2 w2Var = (w2) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = b51Var.r;
                TLRPC.User Z1 = wp.r1(w2Var.a).Z1(Long.valueOf(starrefprogram.bot_id));
                r8 r8Var = new r8((p6) null);
                r8Var.r(Z1);
                w2Var.c.e(Z1, r8Var);
                w2Var.h.setText(i20.p(Z1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    f00 f00Var = new f00();
                    int i10 = t6.ik;
                    f00Var.f = t6.w0(i10, null);
                    f00Var.r = i10;
                    f00Var.s = null;
                    f00Var.n = true;
                    f00Var.w = i.J0(starrefprogram.commission_permille);
                    if (f00Var.c != null) {
                        f00Var.c = null;
                        f00Var.a();
                    }
                    spannableStringBuilder.setSpan(f00Var, 1, 2, 33);
                }
                int i11 = starrefprogram.duration_months;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) dd.L0(2131748996, null));
                } else if (i11 < 12 || i11 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) dd.G(i11, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) dd.G(i11 / 12, "Years", new Object[0]));
                }
                w2Var.n.setText(spannableStringBuilder);
                w2Var.r.setVisibility(z11 ? 0 : 8);
                w2Var.d.setVisibility(8);
                w2Var.f.setVisibility(8);
                w2Var.e.setVisibility(8);
                w2Var.s = z10;
                w2Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        w2 w2Var2 = (w2) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = b51Var.r;
        p6 p6Var = w2Var2.b;
        View view2 = w2Var2.e;
        ImageView imageView = w2Var2.f;
        TLRPC.User Z12 = wp.r1(w2Var2.a).Z1(Long.valueOf(connectedbotstarref.bot_id));
        r8 r8Var2 = new r8((p6) null);
        r8Var2.r(Z12);
        w2Var2.c.e(Z12, r8Var2);
        TextView textView = w2Var2.h;
        textView.setText(k6.m(i20.p(Z12), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            f00 f00Var2 = new f00();
            int i12 = t6.ik;
            f00Var2.f = t6.w0(i12, null);
            f00Var2.r = i12;
            f00Var2.s = null;
            f00Var2.n = true;
            f00Var2.w = i.J0(connectedbotstarref.commission_permille);
            if (f00Var2.c != null) {
                f00Var2.c = null;
                f00Var2.a();
            }
            spannableStringBuilder2.setSpan(f00Var2, 1, 2, 33);
        }
        int i13 = connectedbotstarref.duration_months;
        if (i13 == 0) {
            spannableStringBuilder2.append((CharSequence) dd.L0(2131748996, null));
        } else if (i13 < 12 || i13 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) dd.G(i13, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) dd.G(i13 / 12, "Years", new Object[0]));
        }
        w2Var2.n.setText(spannableStringBuilder2);
        w2Var2.r.setVisibility(z12 ? 0 : 8);
        w2Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = t6.L(org.telegram.messenger.i0.L(9.665f), t6.w0(connectedbotstarref.revoked ? t6.kk : t6.ik, p6Var));
        w6 N = a7.N(connectedbotstarref.revoked ? t6.kk : t6.ik);
        view2.setBackground(L);
        a7.k(view2, L, N, null, p6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        w2Var2.s = z10;
        w2Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new w2(i10, context, p6Var);
    }
}
