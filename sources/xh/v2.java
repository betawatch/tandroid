package xh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.k6;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.g00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v2 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new v2());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        Object obj = a51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                w2 w2Var = (w2) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = a51Var.r;
                TLRPC.User Z1 = vp.r1(w2Var.a).Z1(Long.valueOf(starrefprogram.bot_id));
                r8 r8Var = new r8((p6) null);
                r8Var.r(Z1);
                w2Var.c.e(Z1, r8Var);
                w2Var.h.setText(h20.p(Z1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    g00 g00Var = new g00();
                    int i10 = t6.ik;
                    g00Var.f = t6.w0(i10, null);
                    g00Var.r = i10;
                    g00Var.s = null;
                    g00Var.n = true;
                    g00Var.w = i.I0(starrefprogram.commission_permille);
                    if (g00Var.c != null) {
                        g00Var.c = null;
                        g00Var.a();
                    }
                    spannableStringBuilder.setSpan(g00Var, 1, 2, 33);
                }
                int i11 = starrefprogram.duration_months;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) cd.L0(2131748996, null));
                } else if (i11 < 12 || i11 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) cd.G(i11, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) cd.G(i11 / 12, "Years", new Object[0]));
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
        boolean z12 = a51Var.r;
        p6 p6Var = w2Var2.b;
        View view2 = w2Var2.e;
        ImageView imageView = w2Var2.f;
        TLRPC.User Z12 = vp.r1(w2Var2.a).Z1(Long.valueOf(connectedbotstarref.bot_id));
        r8 r8Var2 = new r8((p6) null);
        r8Var2.r(Z12);
        w2Var2.c.e(Z12, r8Var2);
        TextView textView = w2Var2.h;
        textView.setText(k6.m(h20.p(Z12), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            g00 g00Var2 = new g00();
            int i12 = t6.ik;
            g00Var2.f = t6.w0(i12, null);
            g00Var2.r = i12;
            g00Var2.s = null;
            g00Var2.n = true;
            g00Var2.w = i.I0(connectedbotstarref.commission_permille);
            if (g00Var2.c != null) {
                g00Var2.c = null;
                g00Var2.a();
            }
            spannableStringBuilder2.setSpan(g00Var2, 1, 2, 33);
        }
        int i13 = connectedbotstarref.duration_months;
        if (i13 == 0) {
            spannableStringBuilder2.append((CharSequence) cd.L0(2131748996, null));
        } else if (i13 < 12 || i13 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) cd.G(i13, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) cd.G(i13 / 12, "Years", new Object[0]));
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

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new w2(i10, context, p6Var);
    }
}
