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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zb extends og.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ bc f;

    public zb(bc bcVar) {
        this.f = bcVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return ((ac) this.f.x.get(c1Var.b())).b;
    }

    @Override // s4.h0
    public final int h() {
        return this.f.x.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((ac) this.f.x.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        bc bcVar = this.f;
        int i12 = bcVar.b;
        TLRPC.Chat chat = bcVar.J;
        ArrayList arrayList = bcVar.x;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            kg.c cVar = (kg.c) view;
            cVar.setTitle(((ac) arrayList.get(i10)).c);
            cVar.c(false);
            if (c1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            la1 la1Var = (la1) view;
            la1Var.a(Integer.toString(bcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = bcVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    la1Var.a("≈" + ((int) bcVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    la1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bcVar.d;
                    la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            la1Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            la1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bcVar.d;
            la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((ac) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            yg.b bVar = (yg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((ac) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.f9) view).setText(((ac) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (bcVar.y == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", bcVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", bcVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.w80) view).setLink(((ac) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            ac acVar = (ac) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = acVar.e;
            boolean z10 = acVar.f;
            yg.c cVar2 = (yg.c) view;
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
            int i14 = this.d;
            int i15 = bcVar.P;
            if (i14 == i15 && this.e == bcVar.O) {
                return;
            }
            this.d = i15;
            this.e = bcVar.O;
            bcVar.f.g();
            bcVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", bcVar.P, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = bcVar.O) > 0 && i11 != bcVar.P) {
                bcVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            bcVar.f.setInitialTabId(bcVar.y);
            bcVar.f.c();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        bc bcVar = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = bcVar.e;
        ra1 ra1Var = bcVar.c;
        switch (i10) {
            case 0:
                view = new la1(bcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(bcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.a7(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(bcVar.getContext(), bcVar.c, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = w80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(bcVar.getContext(), R.drawable.filled_limit_boost, 0, bcVar.e, 0);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(bcVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new yg.b(bcVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.f9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.t3(bcVar.getContext(), 8);
                break;
            case 8:
                ai.w5 w5Var = new ai.w5(bcVar.getContext(), 9);
                TextView textView = new TextView(bcVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(bcVar.J) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.y6, null, false, textView, 17);
                w5Var.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = w5Var;
                break;
            case 9:
                o5 o5Var = new o5(bcVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                view = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(bcVar.getContext());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                s8Var.e(i11, i11);
                view = s8Var;
                break;
            case 11:
                view = new yg.c(bcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(bcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ra1Var.getParentActivity(), d6Var);
                bcVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.h6.Fh;
                int i13 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, ra1Var.getParentActivity());
                bcVar.f.setDelegate(new g(this, 11));
                m6Var.addView(bcVar.f, w7.x5.c(48.0f, -2));
                view = m6Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
