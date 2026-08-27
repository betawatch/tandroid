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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wb extends xf.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ yb f;

    public wb(yb ybVar) {
        this.f = ybVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return ((xb) this.f.x.get(o1Var.b())).b;
    }

    @Override // f2.q0
    public final int h() {
        return this.f.x.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((xb) this.f.x.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        yb ybVar = this.f;
        int i12 = ybVar.b;
        TLRPC.Chat chat = ybVar.F;
        ArrayList arrayList = ybVar.x;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            tf.c cVar = (tf.c) view;
            cVar.setTitle(((xb) arrayList.get(i10)).c);
            cVar.c(false);
            if (o1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            k91 k91Var = (k91) view;
            k91Var.a(Integer.toString(ybVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = ybVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    k91Var.a("≈" + ((int) ybVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    k91Var.a(String.valueOf(ybVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ybVar.d;
                    k91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            k91Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            k91Var.a(String.valueOf(ybVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ybVar.d;
            k91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((xb) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            hg.b bVar = (hg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((xb) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.x8) view).setText(((xb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
            if (ybVar.y == 0) {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ybVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ybVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.i80) view).setLink(((xb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            xb xbVar = (xb) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = xbVar.e;
            boolean z10 = xbVar.f;
            hg.c cVar2 = (hg.c) view;
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
            int i14 = this.d;
            int i15 = ybVar.L;
            if (i14 == i15 && this.e == ybVar.K) {
                return;
            }
            this.d = i15;
            this.e = ybVar.K;
            ybVar.f.g();
            ybVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ybVar.L, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = ybVar.K) > 0 && i11 != ybVar.L) {
                ybVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            ybVar.f.setInitialTabId(ybVar.y);
            ybVar.f.c();
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        yb ybVar = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = ybVar.e;
        q91 q91Var = ybVar.c;
        switch (i10) {
            case 0:
                view = new k91(ybVar.getContext(), 2);
                break;
            case 1:
                View cVar = new tf.c(ybVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.w6(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(ybVar.getContext(), ybVar.c, null, false, false);
                i80Var.d.setVisibility(8);
                i80Var.a.setGravity(17);
                i80Var.h.setVisibility(8);
                i80Var.v.setVisibility(8);
                i80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = i80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ybVar.getContext(), R.drawable.filled_limit_boost, 0, ybVar.e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ybVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new hg.b(ybVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.x8(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.q3(ybVar.getContext(), 8);
                break;
            case 8:
                ag.d dVar = new ag.d(ybVar.getContext(), 8);
                TextView textView = new TextView(ybVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(ybVar.F) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.y6, null, false, textView, 17);
                dVar.addView(textView, h7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = dVar;
                break;
            case 9:
                o5 o5Var = new o5(ybVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                view = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(ybVar.getContext());
                l8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                l8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                l8Var.e(i11, i11);
                view = l8Var;
                break;
            case 11:
                view = new hg.c(ybVar.getContext());
                break;
            case 12:
                View cVar2 = new tf.c(ybVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(q91Var.getParentActivity(), c6Var);
                ybVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.d();
                ag.y1 y1Var = new ag.y1(this, q91Var.getParentActivity());
                ybVar.f.setDelegate(new g(this, 11));
                y1Var.addView(ybVar.f, h7.z5.c(48.0f, -2));
                view = y1Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
