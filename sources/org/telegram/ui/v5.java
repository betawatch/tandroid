package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 extends l00 implements org.telegram.messenger.cs {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public org.telegram.messenger.e3 V;
    public ScrollSlidingTextTabStrip W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public int c0;
    public final ArrayList d0;
    public int e0;
    public LimitPreviewView f0;
    public final p5 g0;
    public boolean h0;
    public LinearLayout i0;
    public final TLRPC.Chat j0;
    public String k0;
    public String l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;

    public v5(long j10) {
        int i3 = org.telegram.messenger.h10.t0;
        this.T = i3;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = 0;
        this.g0 = new p5(this);
        this.k0 = "";
        this.l0 = "";
        this.m0 = 5;
        this.n0 = 5;
        this.S = j10;
        this.j0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
    }

    public static void A0(v5 v5Var, Context context, View view, int i3) {
        long j10 = v5Var.S;
        if (view instanceof ch.b) {
            ch.b bVar = (ch.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).z1(-v5Var.j0.id);
                    int i10 = boost.date;
                    tL_payments_checkedGiftCode.date = i10;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i11 = boost.expires - i10;
                    tL_payments_checkedGiftCode.days = i11 / 86400;
                    tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new xg.c0(v5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(v5Var.getParentActivity(), v5Var.getResourceProvider());
                    ibVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    ibVar.b.setText(org.telegram.messenger.bd.M0(2131753303, null));
                    ibVar.b.setSingleLine(false);
                    ibVar.b.setMaxLines(2);
                    org.telegram.ui.Components.ac.g(v5Var, ibVar, 2750).j();
                } else if (!z11 && !z10) {
                    v5Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
                }
            } else {
                ci.wb.h1(context, v5Var.T, v5Var.S, boost, v5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            xg.n.I0(v5Var, v5Var.resourceProvider, j10, null);
        }
        if (view instanceof ch.c) {
            xg.n.I0(v5Var, v5Var.resourceProvider, j10, ((ch.c) view).getPrepaidGiveaway());
        }
        if (((u5) v5Var.d0.get(i3)).a == 9) {
            v5Var.H0(Boolean.valueOf(v5Var.e0 == 1));
        }
    }

    public final void F0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.n0;
        tL_premium_getBoostsList.offset = this.k0;
        int i3 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.S);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.l0;
        int i3 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.S);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        if (bool == null) {
            Utilities.e.c(new m5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new m5(this, 2));
        } else {
            F0(null, new m5(this, 3));
        }
    }

    public final void I0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.f0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_limit_boost, 0, 0, getParentActivity(), this.resourceProvider);
            this.f0 = limitPreviewView;
            limitPreviewView.d0 = true;
            limitPreviewView.setDarkGradientProvider(new x0(this, 5));
        }
        if (this.f0.getParent() != null) {
            ((ViewGroup) this.f0.getParent()).removeView(this.f0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        if (tL_premium_boostsStatus != null) {
            this.f0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f0.setAlpha(0.0f);
                this.f0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.j0;
        String M0 = org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753589 : 2131753587, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753588 : 2131753586, null));
        q5 q5Var = new q5(getParentActivity());
        q5Var.addView(this.U != null ? this.f0 : new View(q5Var.getContext()), b8.mf.d(-1, this.U != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, q5Var, new t5(this, getParentActivity()));
    }

    public final void J0(boolean z10) {
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new u5(14, false));
        if (this.U != null) {
            arrayList.add(new u5(16, org.telegram.messenger.bd.M0(2131744905, null)));
            arrayList.add(new u5(0, false));
            arrayList.add(new u5(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                arrayList.add(new u5(12, org.telegram.messenger.bd.M0(2131753324, null)));
                int i3 = 0;
                while (i3 < this.U.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i3);
                    boolean z11 = i3 == this.U.prepaid_giveaways.size() - 1;
                    u5 u5Var = new u5(11, true);
                    u5Var.e = prepaidGiveaway;
                    u5Var.f = z11;
                    arrayList.add(u5Var);
                    i3++;
                }
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(2131753286, null)));
            }
            arrayList.add(new u5(13, org.telegram.messenger.bd.M0(2131753606, null)));
            int i10 = this.e0;
            TLRPC.Chat chat = this.j0;
            if (i10 == 0) {
                ArrayList arrayList3 = this.X;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new u5(8, false));
                    arrayList.add(new u5(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new u5((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.Z, this.e0));
                        i11++;
                    }
                    if (this.Z) {
                        arrayList.add(new u5(9, true));
                    } else {
                        arrayList.add(new u5(7, false));
                    }
                    arrayList.add(new u5(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.Y;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new u5(8, false));
                    arrayList.add(new u5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new u5((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.b0, this.e0));
                        i12++;
                    }
                    if (this.b0) {
                        arrayList.add(new u5(9, true));
                    } else {
                        arrayList.add(new u5(7, false));
                    }
                    arrayList.add(new u5(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new u5(1, org.telegram.messenger.bd.M0(2131748922, null)));
            arrayList.add(new u5(3, this.U.boost_url));
            if (org.telegram.messenger.hp.s1(this.T).p4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new u5(10, true));
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            } else {
                arrayList.add(new u5(6, ""));
            }
            arrayList.add(new u5(15, false));
        }
        p5 p5Var = this.g0;
        if (z10) {
            p5Var.E(arrayList2, arrayList);
        } else {
            p5Var.f();
        }
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new ei.q4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.addView(new ei.r1(parentActivity), b8.mf.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.i0, b8.mf.e(-1, -2, 17));
        this.i0.setAlpha(0.0f);
        if (this.U == null) {
            this.i0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new n5(this, 1));
        } else {
            this.i0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.V2) {
            if (i3 == org.telegram.messenger.hs.p3) {
                if (this.S == ((Long) objArr[2]).longValue()) {
                    this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.V = (org.telegram.messenger.e3) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.d2 d2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack) : null;
        if (d2Var instanceof ln) {
            ((ActionBarLayout) getParentLayout()).d0(d2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((d2Var2 instanceof ProfileActivity) || (d2Var2 instanceof wm)) {
                xg.j.f(d2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.d2) t4.c.d(3, fragmentStack2) : null;
        if (d2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).d0(d2Var2, false);
        }
        finishFragment();
        if (d2Var3 instanceof wm) {
            xg.j.f(d2Var3, chat, true);
        }
        if (d2Var2 instanceof wm) {
            xg.j.f(d2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.l00
    public final u4.h0 k0() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.p3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.p3);
        super.onFragmentDestroy();
    }
}
