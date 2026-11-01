package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z7 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new z7());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        String p5;
        boolean z11;
        org.telegram.ui.ActionBar.u5 u5Var;
        a8 a8Var = (a8) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) b51Var.G;
        org.telegram.ui.ActionBar.u5 u5Var2 = a8Var.d;
        g9 g9Var = a8Var.c;
        org.telegram.ui.ActionBar.p6 p6Var = a8Var.b;
        TextView textView = a8Var.h;
        TextView textView2 = a8Var.f;
        TextView textView3 = a8Var.e;
        int i10 = a8Var.a;
        TextView textView4 = a8Var.n;
        long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
        a8Var.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o10 < 0) {
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-o10));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
            p5 = L0 != null ? L0.title : null;
            z11 = false;
        } else {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(o10));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(Z1);
            g9Var.e(Z1, r8Var2);
            p5 = i20.p(Z1);
            z11 = !i20.t(Z1);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean z12 = z11;
        u5Var2.l(org.telegram.messenger.k6.m(p5, u5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                n60 n60Var = new n60(14.0f, i10, textView3);
                n60Var.a(4.0f);
                n60Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                u5Var = u5Var2;
                spannableString.setSpan(n60Var, 0, 1, 33);
                n60Var.b.q0(jc.p(c30.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                u5Var = u5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.k6.m(starsSubscription.title, u5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, a8Var.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            textView2.setText(dd.a0(null, null, j10 >= currentTime ? 2131745002 : 2131745008, dd.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var);
            textView4.setText(dd.L0(starsSubscription.bot_canceled ? z12 ? 2131744993 : 2131744992 : 2131744991, null));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(dd.a0(null, null, 2131745008, dd.u(j11, false)));
                textView.setVisibility(8);
                a30.p(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var, null, 2131744990);
            } else {
                textView2.setText(dd.a0(null, null, 2131744995, dd.u(j11, false)));
                textView.setVisibility(0);
                textView.setText(h8.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.z6, p6Var);
                int i11 = starsSubscription.pricing.period;
                if (i11 == 2592000) {
                    textView4.setText(dd.L0(2131745074, null));
                } else if (i11 == 60) {
                    textView4.setText("per minute");
                } else if (i11 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        a8Var.s = z10;
        a8Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new a8(i10, context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var2 == null) {
            return false;
        }
        Object obj = b51Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = b51Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
