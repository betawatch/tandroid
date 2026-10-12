package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s5 extends pg.b {
    public final /* synthetic */ z5 d;

    public s5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return ((y5) this.d.a0.get(b1Var.b())).b;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.a0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((y5) this.d.a0.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        z5 z5Var = this.d;
        int i12 = z5Var.Q;
        TLRPC.Chat chat = z5Var.g0;
        ArrayList arrayList = z5Var.a0;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            lg.c cVar = (lg.c) view;
            cVar.setTitle(((y5) arrayList.get(i10)).c);
            cVar.c(false);
            if (b1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            bb1 bb1Var = (bb1) view;
            bb1Var.a(Integer.toString(z5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = z5Var.R.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    bb1Var.a("≈" + ((int) z5Var.R.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    bb1Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var.R;
                    bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    bb1Var.setPadding(AndroidUtilities.dp(23.0f), bb1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), bb1Var.getPaddingBottom());
                    return;
                }
            }
            bb1Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            bb1Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = z5Var.R;
            bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            bb1Var.setPadding(AndroidUtilities.dp(23.0f), bb1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), bb1Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((y5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            zg.b bVar = (zg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((y5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(((y5) arrayList.get(i10)).c);
            e9Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (z5Var.b0 == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", z5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", z5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.w90) view).setLink(((y5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            y5 y5Var = (y5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = y5Var.e;
            boolean z10 = y5Var.f;
            zg.c cVar2 = (zg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            if (z5Var.T.getTag() == null || ((Integer) z5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.l0))) {
                z5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.l0))));
                z5Var.T.g();
                z5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", z5Var.m0, new Object[0]), null);
                if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = z5Var.l0) > 0 && i11 != z5Var.m0) {
                    z5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                z5Var.T.setInitialTabId(z5Var.b0);
                z5Var.T.c();
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        z5 z5Var = this.d;
        switch (i10) {
            case 0:
                view = new bb1(z5Var.getParentActivity(), 2);
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 1:
            case 16:
                lg.c cVar = new lg.c(z5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                view = b7Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(z5Var.getParentActivity(), z5Var, null, false, false);
                w90Var.d.setVisibility(8);
                w90Var.a.setGravity(17);
                w90Var.h.setVisibility(8);
                w90Var.v.setVisibility(8);
                w90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = w90Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new zg.b(z5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                c6Var = ((org.telegram.ui.ActionBar.m2) z5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, c6Var);
                view = b7Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.t3(z5Var.getParentActivity(), 8);
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 8:
                bi.i5 i5Var = new bi.i5(z5Var.getParentActivity(), 7);
                TextView textView = new TextView(z5Var.getParentActivity());
                org.telegram.messenger.yh.j(14.0f, ChatObject.isChannelAndNotMegaGroup(z5Var.g0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.y6, null, false, textView, 17);
                i5Var.addView(textView, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                view = i5Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 9:
                r5 r5Var = new r5(z5Var.getParentActivity(), 0);
                r5Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                view = r5Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(z5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                r8Var.e(i11, i11);
                view = r8Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 11:
                view = new zg.c(z5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 12:
                lg.c cVar2 = new lg.c(z5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 13:
                Activity parentActivity = z5Var.getParentActivity();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) z5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, c6Var2);
                z5Var.T = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.d();
                ah.v vVar = new ah.v(this, z5Var.getParentActivity());
                z5Var.T.setDelegate(new g(this, 6));
                vVar.addView(z5Var.T, w7.a6.d(48.0f, -2));
                view = vVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 14:
                view = z5Var.r0(z5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 15:
                di.ab abVar = new di.ab(this, z5Var.getParentActivity(), 9);
                abVar.setTag(-33024);
                view = abVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
    }
}
