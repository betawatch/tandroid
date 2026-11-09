package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rb extends rg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ tb f;

    public rb(tb tbVar) {
        this.f = tbVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return ((sb) this.f.y.get(d1Var.b())).b;
    }

    @Override // v4.g0
    public final int b() {
        return this.f.y.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((sb) this.f.y.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        tb tbVar = this.f;
        int i11 = tbVar.b;
        TLRPC.Chat chat = tbVar.I;
        ArrayList arrayList = tbVar.y;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 4) {
            return;
        }
        if (i12 == 1 || i12 == 12) {
            ng.c cVar = (ng.c) view;
            cVar.setTitle(((sb) arrayList.get(i7)).c);
            cVar.c(false);
            if (d1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            x41 x41Var = (x41) view;
            x41Var.a(Integer.toString(tbVar.d.level), 0, null, org.telegram.messenger.id.M0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    x41Var.a("≈" + ((int) tbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
                    x41Var.a(String.valueOf(tbVar.d.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = tbVar.d;
                    x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                    return;
                }
            }
            x41Var.a("≈0", 1, "0%", org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
            x41Var.a(String.valueOf(tbVar.d.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = tbVar.d;
            x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((sb) arrayList.get(i7)).d;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(boost.user_id));
            bh.b bVar = (bh.b) view;
            bVar.d(a22, org.telegram.messenger.g5.p(a22), boost.multiplier > 1 ? org.telegram.messenger.id.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.id.r(boost.expires, false)) : org.telegram.messenger.id.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.id.r(boost.expires, false)), !((sb) arrayList.get(i7)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            ((org.telegram.ui.Cells.z8) view).setText(((sb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (tbVar.D == 0) {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.id.G(tbVar.s, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.id.G(tbVar.x, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.r70) view).setLink(((sb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 11) {
            sb sbVar = (sb) arrayList.get(i7);
            TL_stories.PrepaidGiveaway prepaidGiveaway = sbVar.e;
            boolean z9 = sbVar.f;
            bh.c cVar2 = (bh.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.id.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z9);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, org.telegram.messenger.id.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z9);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i12 == 13) {
            int i13 = this.d;
            int i14 = tbVar.O;
            if (i13 == i14 && this.e == tbVar.N) {
                return;
            }
            this.d = i14;
            this.e = tbVar.N;
            tbVar.f.f();
            tbVar.f.a(0, org.telegram.messenger.id.G(tbVar.O, "BoostingBoostsCount", new Object[0]), null);
            if (org.telegram.messenger.qp.s1(i11).p4 && (i10 = tbVar.N) > 0 && i10 != tbVar.O) {
                tbVar.f.a(1, org.telegram.messenger.id.G(i10, "BoostingGiftsCount", new Object[0]), null);
            }
            tbVar.f.setInitialTabId(tbVar.D);
            tbVar.f.c();
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        tb tbVar = this.f;
        org.telegram.ui.ActionBar.g6 g6Var = tbVar.e;
        d51 d51Var = tbVar.c;
        int i10 = 1;
        switch (i7) {
            case 0:
                view = new x41(tbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(tbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.l6.a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.l6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.s6.h(i11, y6Var, null);
                view = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(tbVar.getContext(), tbVar.c, null, false, false);
                r70Var.d.setVisibility(8);
                r70Var.a.setGravity(17);
                r70Var.h.setVisibility(8);
                r70Var.w.setVisibility(8);
                r70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = r70Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_limit_boost, 0, 0, tbVar.getContext(), tbVar.e);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(tbVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new bh.b(tbVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.z8(20, viewGroup.getContext(), g6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.v3(tbVar.getContext(), 8);
                break;
            case 8:
                di.b4 b4Var = new di.b4(tbVar.getContext(), 8);
                TextView textView = new TextView(tbVar.getContext());
                textView.setText(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(tbVar.I) ? 2131748234 : 2131748235, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.y6, null);
                textView.setGravity(17);
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = b4Var;
                break;
            case 9:
                m5 m5Var = new m5(tbVar.getContext(), i10);
                m5Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                view = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(tbVar.getContext());
                m8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.id.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                m8Var.s = 64;
                int i12 = org.telegram.ui.ActionBar.l6.q6;
                m8Var.g(i12, i12);
                view = m8Var;
                break;
            case 11:
                view = new bh.c(tbVar.getContext());
                break;
            case 12:
                View cVar2 = new ng.c(tbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(d51Var.getParentActivity(), g6Var);
                tbVar.f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.l6.a;
                int i14 = org.telegram.ui.ActionBar.l6.ti;
                int i15 = org.telegram.ui.ActionBar.l6.si;
                int i16 = org.telegram.ui.ActionBar.l6.a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                bi.x5 x5Var = new bi.x5(this, d51Var.getParentActivity());
                tbVar.f.setDelegate(new f(this, 9));
                x5Var.addView(tbVar.f, c8.ha.c(48.0f, -2));
                view = x5Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return jg.g.r(view, view, -1, -2);
    }
}
