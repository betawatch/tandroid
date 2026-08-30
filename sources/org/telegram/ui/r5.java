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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r5 extends bg.c {
    public final /* synthetic */ y5 d;

    public r5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return ((x5) this.d.X.get(l1Var.b())).b;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.X.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((x5) this.d.X.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        y5 y5Var = this.d;
        int i12 = y5Var.N;
        TLRPC.Chat chat = y5Var.d0;
        ArrayList arrayList = y5Var.X;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            xf.c cVar = (xf.c) view;
            cVar.setTitle(((x5) arrayList.get(i10)).c);
            cVar.c(false);
            if (l1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            aa1 aa1Var = (aa1) view;
            aa1Var.a(Integer.toString(y5Var.O.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = y5Var.O.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    aa1Var.a("≈" + ((int) y5Var.O.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    aa1Var.a(String.valueOf(y5Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var.O;
                    aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    aa1Var.setPadding(AndroidUtilities.dp(23.0f), aa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), aa1Var.getPaddingBottom());
                    return;
                }
            }
            aa1Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            aa1Var.a(String.valueOf(y5Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = y5Var.O;
            aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            aa1Var.setPadding(AndroidUtilities.dp(23.0f), aa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), aa1Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((x5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            lg.b bVar = (lg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((x5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setText(((x5) arrayList.get(i10)).c);
            a9Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (y5Var.Y == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", y5Var.U, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", y5Var.W, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.x80) view).setLink(((x5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            x5 x5Var = (x5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = x5Var.e;
            boolean z4 = x5Var.f;
            lg.c cVar2 = (lg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z4);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z4);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            if (y5Var.Q.getTag() == null || ((Integer) y5Var.Q.getTag()).intValue() != Objects.hash(Integer.valueOf(y5Var.j0), Integer.valueOf(y5Var.i0))) {
                y5Var.Q.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(y5Var.j0), Integer.valueOf(y5Var.i0))));
                y5Var.Q.g();
                y5Var.Q.a(0, LocaleController.formatPluralString("BoostingBoostsCount", y5Var.j0, new Object[0]), null);
                if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = y5Var.i0) > 0 && i11 != y5Var.j0) {
                    y5Var.Q.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                y5Var.Q.setInitialTabId(y5Var.Y);
                y5Var.Q.c();
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        y5 y5Var = this.d;
        switch (i10) {
            case 0:
                view = new aa1(y5Var.getParentActivity(), 2);
                return yh.o(view, view, -1, -2);
            case 1:
            case 16:
                xf.c cVar = new xf.c(y5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return yh.o(view, view, -1, -2);
            case 2:
                z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
                view = z6Var;
                return yh.o(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(y5Var.getParentActivity(), y5Var, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = x80Var;
                return yh.o(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new lg.b(y5Var.getParentActivity());
                return yh.o(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.p2) y5Var).resourceProvider;
                z6Var = new org.telegram.ui.Cells.a9(context, 20, f6Var);
                view = z6Var;
                return yh.o(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.s3(y5Var.getParentActivity(), 8);
                return yh.o(view, view, -1, -2);
            case 8:
                dh.d dVar = new dh.d(y5Var.getParentActivity(), 7);
                TextView textView = new TextView(y5Var.getParentActivity());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(y5Var.d0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                yh.t(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 17);
                dVar.addView(textView, k7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = dVar;
                return yh.o(view, view, -1, -2);
            case 9:
                q5 q5Var = new q5(y5Var.getParentActivity(), 0);
                q5Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                view = q5Var;
                return yh.o(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(y5Var.getParentActivity());
                o8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                o8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                o8Var.e(i11, i11);
                view = o8Var;
                return yh.o(view, view, -1, -2);
            case 11:
                view = new lg.c(y5Var.getParentActivity());
                return yh.o(view, view, -1, -2);
            case 12:
                xf.c cVar2 = new xf.c(y5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return yh.o(view, view, -1, -2);
            case 13:
                Activity parentActivity = y5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) y5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                y5Var.Q = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.j6.Fh;
                int i13 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i12;
                scrollSlidingTextTabStrip.J = i13;
                scrollSlidingTextTabStrip.e();
                ah.d dVar2 = new ah.d(this, y5Var.getParentActivity());
                y5Var.Q.setDelegate(new h(this, 6));
                dVar2.addView(y5Var.Q, k7.b6.c(48.0f, -2));
                view = dVar2;
                return yh.o(view, view, -1, -2);
            case 14:
                view = y5Var.r0(y5Var.getParentActivity());
                return yh.o(view, view, -1, -2);
            case 15:
                eg.h0 h0Var = new eg.h0(this, y5Var.getParentActivity(), 4);
                h0Var.setTag(-33024);
                view = h0Var;
                return yh.o(view, view, -1, -2);
        }
    }
}
