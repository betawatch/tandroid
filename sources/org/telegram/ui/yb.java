package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yb extends cg.c {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ ac f;

    public yb(ac acVar) {
        this.f = acVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return ((zb) this.f.x.get(m1Var.b())).b;
    }

    @Override // f2.p0
    public final int h() {
        return this.f.x.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((zb) this.f.x.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        ac acVar = this.f;
        int i12 = acVar.b;
        TLRPC.Chat chat = acVar.G;
        ArrayList arrayList = acVar.x;
        int i13 = m1Var.f;
        View view = m1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            yf.c cVar = (yf.c) view;
            cVar.setTitle(((zb) arrayList.get(i10)).c);
            cVar.c(false);
            if (m1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            ba1 ba1Var = (ba1) view;
            ba1Var.a(Integer.toString(acVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = acVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    ba1Var.a("≈" + ((int) acVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    ba1Var.a(String.valueOf(acVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = acVar.d;
                    ba1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            ba1Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            ba1Var.a(String.valueOf(acVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = acVar.d;
            ba1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((zb) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            mg.b bVar = (mg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((zb) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.a9) view).setText(((zb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (acVar.y == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", acVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", acVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.y80) view).setLink(((zb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            zb zbVar = (zb) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = zbVar.e;
            boolean z4 = zbVar.f;
            mg.c cVar2 = (mg.c) view;
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
            int i14 = this.d;
            int i15 = acVar.M;
            if (i14 == i15 && this.e == acVar.L) {
                return;
            }
            this.d = i15;
            this.e = acVar.L;
            acVar.f.g();
            acVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", acVar.M, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = acVar.L) > 0 && i11 != acVar.M) {
                acVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            acVar.f.setInitialTabId(acVar.y);
            acVar.f.c();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        ac acVar = this.f;
        org.telegram.ui.ActionBar.g6 g6Var = acVar.e;
        ha1 ha1Var = acVar.c;
        switch (i10) {
            case 0:
                view = new ba1(acVar.getContext(), 2);
                break;
            case 1:
                View cVar = new yf.c(acVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(acVar.getContext(), acVar.c, null, false, false);
                y80Var.d.setVisibility(8);
                y80Var.a.setGravity(17);
                y80Var.h.setVisibility(8);
                y80Var.v.setVisibility(8);
                y80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = y80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(acVar.getContext(), R.drawable.filled_limit_boost, 0, acVar.e, 0);
                limitPreviewView.W = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(acVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new mg.b(acVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.a9(viewGroup.getContext(), 20, g6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.s3(acVar.getContext(), 8);
                break;
            case 8:
                eh.d dVar = new eh.d(acVar.getContext(), 9);
                TextView textView = new TextView(acVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(acVar.G) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                yh.t(org.telegram.ui.ActionBar.k6.y6, null, false, textView, 17);
                dVar.addView(textView, k7.c6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = dVar;
                break;
            case 9:
                q5 q5Var = new q5(acVar.getContext(), 1);
                q5Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                view = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(acVar.getContext());
                o8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                o8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.k6.q6;
                o8Var.e(i11, i11);
                view = o8Var;
                break;
            case 11:
                view = new mg.c(acVar.getContext());
                break;
            case 12:
                View cVar2 = new yf.c(acVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ha1Var.getParentActivity(), g6Var);
                acVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.k6.Fh;
                int i13 = org.telegram.ui.ActionBar.k6.Eh;
                scrollSlidingTextTabStrip.I = i12;
                scrollSlidingTextTabStrip.J = i13;
                scrollSlidingTextTabStrip.e();
                ag.l lVar = new ag.l(this, ha1Var.getParentActivity());
                acVar.f.setDelegate(new h(this, 11));
                lVar.addView(acVar.f, k7.c6.c(48.0f, -2));
                view = lVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return yh.o(view, view, -1, -2);
    }
}
