package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z7 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new z7());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        String p5;
        boolean z11;
        org.telegram.ui.ActionBar.u5 u5Var;
        a8 a8Var = (a8) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) a51Var.G;
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
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-o10));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
            p5 = L0 != null ? L0.title : null;
            z11 = false;
        } else {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o10));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(Z1);
            g9Var.e(Z1, r8Var2);
            p5 = h20.p(Z1);
            z11 = !h20.t(Z1);
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
                o60 o60Var = new o60(14.0f, i10, textView3);
                o60Var.a(4.0f);
                o60Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                u5Var = u5Var2;
                spannableString.setSpan(o60Var, 0, 1, 33);
                o60Var.b.q0(ic.p(b30.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
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
            textView2.setText(cd.a0(null, null, j10 >= currentTime ? 2131745002 : 2131745008, cd.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var);
            textView4.setText(cd.L0(starsSubscription.bot_canceled ? z12 ? 2131744993 : 2131744992 : 2131744991, null));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(cd.a0(null, null, 2131745008, cd.u(j11, false)));
                textView.setVisibility(8);
                z20.p(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var, null, 2131744990);
            } else {
                textView2.setText(cd.a0(null, null, 2131744995, cd.u(j11, false)));
                textView.setVisibility(0);
                textView.setText(h8.Z0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.z6, p6Var);
                int i11 = starsSubscription.pricing.period;
                if (i11 == 2592000) {
                    textView4.setText(cd.L0(2131745074, null));
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

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new a8(i10, context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var2 == null) {
            return false;
        }
        Object obj = a51Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = a51Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
