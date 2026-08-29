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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ub extends zf.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ wb f;

    public ub(wb wbVar) {
        this.f = wbVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return ((vb) this.f.x.get(n1Var.b())).b;
    }

    @Override // f2.p0
    public final int h() {
        return this.f.x.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((vb) this.f.x.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        wb wbVar = this.f;
        int i12 = wbVar.b;
        TLRPC.Chat chat = wbVar.F;
        ArrayList arrayList = wbVar.x;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            vf.c cVar = (vf.c) view;
            cVar.setTitle(((vb) arrayList.get(i10)).c);
            cVar.c(false);
            if (n1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            n91 n91Var = (n91) view;
            n91Var.a(Integer.toString(wbVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = wbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    n91Var.a("≈" + ((int) wbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    n91Var.a(String.valueOf(wbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wbVar.d;
                    n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            n91Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            n91Var.a(String.valueOf(wbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = wbVar.d;
            n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((vb) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            jg.b bVar = (jg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((vb) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.y8) view).setText(((vb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
            if (wbVar.y == 0) {
                w4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", wbVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                w4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", wbVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.r80) view).setLink(((vb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            vb vbVar = (vb) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = vbVar.e;
            boolean z10 = vbVar.f;
            jg.c cVar2 = (jg.c) view;
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
            int i15 = wbVar.L;
            if (i14 == i15 && this.e == wbVar.K) {
                return;
            }
            this.d = i15;
            this.e = wbVar.K;
            wbVar.f.g();
            wbVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", wbVar.L, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = wbVar.K) > 0 && i11 != wbVar.L) {
                wbVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            wbVar.f.setInitialTabId(wbVar.y);
            wbVar.f.c();
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        wb wbVar = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = wbVar.e;
        t91 t91Var = wbVar.c;
        switch (i10) {
            case 0:
                view = new n91(wbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new vf.c(wbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(wbVar.getContext(), wbVar.c, null, false, false);
                r80Var.d.setVisibility(8);
                r80Var.a.setGravity(17);
                r80Var.h.setVisibility(8);
                r80Var.v.setVisibility(8);
                r80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = r80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(wbVar.getContext(), R.drawable.filled_limit_boost, 0, wbVar.e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(wbVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new jg.b(wbVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.y8(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.q3(wbVar.getContext(), 8);
                break;
            case 8:
                bh.d dVar = new bh.d(wbVar.getContext(), 10);
                TextView textView = new TextView(wbVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(wbVar.F) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                th.s(org.telegram.ui.ActionBar.g6.y6, null, false, textView, 17);
                dVar.addView(textView, i7.f6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = dVar;
                break;
            case 9:
                o5 o5Var = new o5(wbVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                view = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(wbVar.getContext());
                m8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                m8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i11, i11);
                view = m8Var;
                break;
            case 11:
                view = new jg.c(wbVar.getContext());
                break;
            case 12:
                View cVar2 = new vf.c(wbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(t91Var.getParentActivity(), c6Var);
                wbVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.e();
                bg.d1 d1Var = new bg.d1(this, t91Var.getParentActivity());
                wbVar.f.setDelegate(new h(this, 11));
                d1Var.addView(wbVar.f, i7.f6.c(48.0f, -2));
                view = d1Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return th.m(view, view, -1, -2);
    }
}
