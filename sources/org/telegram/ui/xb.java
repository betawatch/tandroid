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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xb extends hg.c {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ zb f;

    public xb(zb zbVar) {
        this.f = zbVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return ((yb) this.f.y.get(c1Var.b())).b;
    }

    @Override // s4.g0
    public final int b() {
        return this.f.y.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((yb) this.f.y.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        zb zbVar = this.f;
        int i12 = zbVar.b;
        TLRPC.Chat chat = zbVar.I;
        ArrayList arrayList = zbVar.y;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            dg.d dVar = (dg.d) view;
            dVar.setTitle(((yb) arrayList.get(i10)).c);
            dVar.c(false);
            if (c1Var.f == 12) {
                dVar.setPadding(org.telegram.messenger.i0.L(3.0f), dVar.getPaddingTop(), dVar.getPaddingRight(), dVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            o61 o61Var = (o61) view;
            o61Var.a(Integer.toString(zbVar.d.level), 0, null, org.telegram.messenger.cd.L0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = zbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    o61Var.a("≈" + ((int) zbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131746944 : 2131747054, null));
                    o61Var.a(String.valueOf(zbVar.d.boosts), 2, null, org.telegram.messenger.cd.L0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zbVar.d;
                    o61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.cd.L0(2131753157, null));
                    return;
                }
            }
            o61Var.a("≈0", 1, "0%", org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131746944 : 2131747054, null));
            o61Var.a(String.valueOf(zbVar.d.boosts), 2, null, org.telegram.messenger.cd.L0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = zbVar.d;
            o61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.cd.L0(2131753157, null));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((yb) arrayList.get(i10)).d;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(boost.user_id));
            rg.b bVar = (rg.b) view;
            bVar.d(Z1, org.telegram.messenger.i5.p(Z1), boost.multiplier > 1 ? org.telegram.messenger.cd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.cd.r(boost.expires, false)) : org.telegram.messenger.cd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.cd.r(boost.expires, false)), !((yb) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.b9) view).setText(((yb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (zbVar.D == 0) {
                b5Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.cd.G(zbVar.s, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                b5Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.cd.G(zbVar.x, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.j80) view).setLink(((yb) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            yb ybVar = (yb) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = ybVar.e;
            boolean z10 = ybVar.f;
            rg.c cVar = (rg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar.d(prepaidGiveaway, org.telegram.messenger.cd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.cd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.cd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar.d(prepaidGiveaway, org.telegram.messenger.cd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.cd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
            }
            cVar.setImage(prepaidGiveaway);
            cVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            int i14 = this.d;
            int i15 = zbVar.O;
            if (i14 == i15 && this.e == zbVar.N) {
                return;
            }
            this.d = i15;
            this.e = zbVar.N;
            zbVar.f.f();
            zbVar.f.a(0, org.telegram.messenger.cd.G(zbVar.O, "BoostingBoostsCount", new Object[0]), null);
            if (org.telegram.messenger.vp.r1(i12).q4 && (i11 = zbVar.N) > 0 && i11 != zbVar.O) {
                zbVar.f.a(1, org.telegram.messenger.cd.G(i11, "BoostingGiftsCount", new Object[0]), null);
            }
            zbVar.f.setInitialTabId(zbVar.D);
            zbVar.f.c();
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        zb zbVar = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = zbVar.e;
        u61 u61Var = zbVar.c;
        int i11 = 1;
        switch (i10) {
            case 0:
                view = new o61(zbVar.getContext(), 2);
                break;
            case 1:
                View dVar = new dg.d(zbVar.getContext(), null);
                dVar.setPadding(dVar.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar.getRight(), org.telegram.messenger.i0.L(16.0f));
                view = dVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i12 = org.telegram.ui.ActionBar.t6.a7;
                View c7Var = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.t6.x0(null, i12, false), 0);
                org.telegram.ui.ActionBar.a7.i(i12, c7Var, null);
                view = c7Var;
                break;
            case 3:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(zbVar.getContext(), zbVar.c, null, false, false);
                j80Var.d.setVisibility(8);
                j80Var.a.setGravity(17);
                j80Var.h.setVisibility(8);
                j80Var.w.setVisibility(8);
                j80Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(24.0f));
                view = j80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_limit_boost, 0, 0, zbVar.getContext(), zbVar.e);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f));
                limitPreviewView.g(zbVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new rg.b(zbVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.b9(20, viewGroup.getContext(), p6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.x3(zbVar.getContext(), 8);
                break;
            case 8:
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(zbVar.getContext(), 12);
                TextView textView = new TextView(zbVar.getContext());
                textView.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(zbVar.I) ? 2131748251 : 2131748252, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, null);
                textView.setGravity(17);
                a5Var.addView(textView, w7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = a5Var;
                break;
            case 9:
                l5 l5Var = new l5(zbVar.getContext(), i11);
                l5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                view = l5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(zbVar.getContext());
                p8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.cd.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                p8Var.s = 64;
                int i13 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i13, i13);
                view = p8Var;
                break;
            case 11:
                view = new rg.c(zbVar.getContext());
                break;
            case 12:
                View dVar2 = new dg.d(zbVar.getContext(), null);
                dVar2.setPadding(dVar2.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar2.getRight(), org.telegram.messenger.i0.L(8.0f));
                view = dVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(u61Var.getParentActivity(), p6Var);
                zbVar.f = scrollSlidingTextTabStrip;
                int i14 = org.telegram.ui.ActionBar.t6.a;
                int i15 = org.telegram.ui.ActionBar.t6.ti;
                int i16 = org.telegram.ui.ActionBar.t6.si;
                int i17 = org.telegram.ui.ActionBar.t6.a;
                scrollSlidingTextTabStrip.L = i15;
                scrollSlidingTextTabStrip.M = i16;
                scrollSlidingTextTabStrip.updateColors();
                fg.i iVar = new fg.i(this, u61Var.getParentActivity());
                zbVar.f.setDelegate(new e(this, 9));
                iVar.addView(zbVar.f, w7.b6.c(48.0f, -2));
                view = iVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return sc.e.o(view, view, -1, -2);
    }
}
