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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vb extends wf.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ xb f;

    public vb(xb xbVar) {
        this.f = xbVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return ((wb) this.f.x.get(q1Var.b())).b;
    }

    @Override // f2.r0
    public final int h() {
        return this.f.x.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((wb) this.f.x.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        xb xbVar = this.f;
        int i11 = xbVar.b;
        TLRPC.Chat chat = xbVar.F;
        ArrayList arrayList = xbVar.x;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 4) {
            return;
        }
        if (i12 == 1 || i12 == 12) {
            sf.c cVar = (sf.c) view;
            cVar.setTitle(((wb) arrayList.get(i9)).c);
            cVar.c(false);
            if (q1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            m91 m91Var = (m91) view;
            m91Var.a(Integer.toString(xbVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = xbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    m91Var.a("≈" + ((int) xbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    m91Var.a(String.valueOf(xbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xbVar.d;
                    m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            m91Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            m91Var.a(String.valueOf(xbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = xbVar.d;
            m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((wb) arrayList.get(i9)).d;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(boost.user_id));
            gg.b bVar = (gg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((wb) arrayList.get(i9)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            ((org.telegram.ui.Cells.b9) view).setText(((wb) arrayList.get(i9)).c);
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (xbVar.y == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", xbVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", xbVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.e80) view).setLink(((wb) arrayList.get(i9)).c);
            return;
        }
        if (i12 == 11) {
            wb wbVar = (wb) arrayList.get(i9);
            TL_stories.PrepaidGiveaway prepaidGiveaway = wbVar.e;
            boolean z10 = wbVar.f;
            gg.c cVar2 = (gg.c) view;
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
        if (i12 == 13) {
            int i13 = this.d;
            int i14 = xbVar.L;
            if (i13 == i14 && this.e == xbVar.K) {
                return;
            }
            this.d = i14;
            this.e = xbVar.K;
            xbVar.f.g();
            xbVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", xbVar.L, new Object[0]), null);
            if (MessagesController.getInstance(i11).giveawayGiftsPurchaseAvailable && (i10 = xbVar.K) > 0 && i10 != xbVar.L) {
                xbVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i10, new Object[0]), null);
            }
            xbVar.f.setInitialTabId(xbVar.y);
            xbVar.f.c();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        xb xbVar = this.f;
        org.telegram.ui.ActionBar.b6 b6Var = xbVar.e;
        s91 s91Var = xbVar.c;
        switch (i9) {
            case 0:
                view = new m91(xbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new sf.c(xbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(xbVar.getContext(), xbVar.c, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.v.setVisibility(8);
                e80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = e80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(xbVar.getContext(), R.drawable.filled_limit_boost, 0, xbVar.e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(xbVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new gg.b(xbVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.b9(viewGroup.getContext(), 20, b6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.t3(xbVar.getContext(), 8);
                break;
            case 8:
                dh.g gVar = new dh.g(xbVar.getContext(), 8);
                TextView textView = new TextView(xbVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(xbVar.F) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.y6, null, false, textView, 17);
                gVar.addView(textView, g7.e6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = gVar;
                break;
            case 9:
                n5 n5Var = new n5(xbVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                view = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(xbVar.getContext());
                p8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                p8Var.s = 64;
                int i10 = org.telegram.ui.ActionBar.f6.q6;
                p8Var.e(i10, i10);
                view = p8Var;
                break;
            case 11:
                view = new gg.c(xbVar.getContext());
                break;
            case 12:
                View cVar2 = new sf.c(xbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(s91Var.getParentActivity(), b6Var);
                xbVar.f = scrollSlidingTextTabStrip;
                int i11 = org.telegram.ui.ActionBar.f6.Fh;
                int i12 = org.telegram.ui.ActionBar.f6.Eh;
                scrollSlidingTextTabStrip.H = i11;
                scrollSlidingTextTabStrip.I = i12;
                scrollSlidingTextTabStrip.d();
                fh.v vVar = new fh.v(this, s91Var.getParentActivity());
                xbVar.f.setDelegate(new g(this, 11));
                vVar.addView(xbVar.f, g7.e6.c(48.0f, -2));
                view = vVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
