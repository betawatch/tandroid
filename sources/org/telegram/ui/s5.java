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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s5 extends pg.b {
    public final /* synthetic */ y5 d;

    public s5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return ((x5) this.d.c0.get(b1Var.b())).b;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.c0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((x5) this.d.c0.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        y5 y5Var = this.d;
        int i12 = y5Var.S;
        TLRPC.Chat chat = y5Var.i0;
        ArrayList arrayList = y5Var.c0;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            lg.c cVar = (lg.c) view;
            cVar.setTitle(((x5) arrayList.get(i10)).c);
            cVar.c(false);
            if (b1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            o91 o91Var = (o91) view;
            o91Var.a(Integer.toString(y5Var.T.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = y5Var.T.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    o91Var.a("≈" + ((int) y5Var.T.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    o91Var.a(String.valueOf(y5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var.T;
                    o91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    o91Var.setPadding(AndroidUtilities.dp(23.0f), o91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), o91Var.getPaddingBottom());
                    return;
                }
            }
            o91Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            o91Var.a(String.valueOf(y5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = y5Var.T;
            o91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            o91Var.setPadding(AndroidUtilities.dp(23.0f), o91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), o91Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((x5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            zg.b bVar = (zg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((x5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(((x5) arrayList.get(i10)).c);
            e9Var.setTextColor(org.telegram.ui.ActionBar.k6.o1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (y5Var.d0 == 0) {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", y5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", y5Var.b0, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.r90) view).setLink(((x5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            x5 x5Var = (x5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = x5Var.e;
            boolean z10 = x5Var.f;
            zg.c cVar2 = (zg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            if (y5Var.V.getTag() == null || ((Integer) y5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(y5Var.o0), Integer.valueOf(y5Var.n0))) {
                y5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(y5Var.o0), Integer.valueOf(y5Var.n0))));
                y5Var.V.f();
                y5Var.V.a(0, LocaleController.formatPluralString("BoostingBoostsCount", y5Var.o0, new Object[0]), null);
                if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = y5Var.n0) > 0 && i11 != y5Var.o0) {
                    y5Var.V.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                y5Var.V.setInitialTabId(y5Var.d0);
                y5Var.V.c();
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11 = 0;
        y5 y5Var = this.d;
        switch (i10) {
            case 0:
                view = new o91(y5Var.getParentActivity(), 2);
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 1:
            case 16:
                lg.c cVar = new lg.c(y5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                view = b7Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(y5Var.getParentActivity(), y5Var, null, false, false);
                r90Var.d.setVisibility(8);
                r90Var.a.setGravity(17);
                r90Var.h.setVisibility(8);
                r90Var.v.setVisibility(8);
                r90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = r90Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new zg.b(y5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                g6Var = ((org.telegram.ui.ActionBar.o2) y5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, g6Var);
                view = b7Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.s3(y5Var.getParentActivity(), 8);
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 8:
                ci.h4 h4Var = new ci.h4(y5Var.getParentActivity(), 7);
                TextView textView = new TextView(y5Var.getParentActivity());
                org.telegram.messenger.sl.n(ChatObject.isChannelAndNotMegaGroup(y5Var.i0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, null);
                textView.setGravity(17);
                h4Var.addView(textView, w7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = h4Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 9:
                r5 r5Var = new r5(y5Var.getParentActivity(), i11);
                r5Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                view = r5Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(y5Var.getParentActivity());
                r8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.s = 64;
                int i12 = org.telegram.ui.ActionBar.k6.q6;
                r8Var.g(i12, i12);
                view = r8Var;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 11:
                view = new zg.c(y5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 12:
                lg.c cVar2 = new lg.c(y5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 13:
                Activity parentActivity = y5Var.getParentActivity();
                g6Var2 = ((org.telegram.ui.ActionBar.o2) y5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, g6Var2);
                y5Var.V = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.k6.a;
                int i14 = org.telegram.ui.ActionBar.k6.Fh;
                int i15 = org.telegram.ui.ActionBar.k6.Eh;
                int i16 = org.telegram.ui.ActionBar.k6.a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                ah.v vVar = new ah.v(this, y5Var.getParentActivity());
                y5Var.V.setDelegate(new f(this, 6));
                vVar.addView(y5Var.V, w7.z5.c(48.0f, -2));
                view = vVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 14:
                view = y5Var.r0(y5Var.getParentActivity());
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            case 15:
                ai.jc jcVar = new ai.jc(this, y5Var.getParentActivity(), 9);
                jcVar.setTag(-33024);
                view = jcVar;
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
    }
}
