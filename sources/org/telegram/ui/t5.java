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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t5 extends p00 implements org.telegram.messenger.is {
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
    public final n5 g0;
    public boolean h0;
    public LinearLayout i0;
    public final TLRPC.Chat j0;
    public String k0;
    public String l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;

    public t5(long j3) {
        int i7 = org.telegram.messenger.m10.t0;
        this.T = i7;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = 0;
        this.g0 = new n5(this);
        this.k0 = "";
        this.l0 = "";
        this.m0 = 5;
        this.n0 = 5;
        this.S = j3;
        this.j0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
    }

    public static void A0(t5 t5Var, Context context, View view, int i7) {
        long j3 = t5Var.S;
        if (view instanceof bh.b) {
            bh.b bVar = (bh.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).z1(-t5Var.j0.id);
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
                    new wg.a0(t5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(t5Var.getParentActivity(), t5Var.getResourceProvider());
                    fbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    fbVar.b.setText(org.telegram.messenger.hd.M0(2131753303, null));
                    fbVar.b.setSingleLine(false);
                    fbVar.b.setMaxLines(2);
                    org.telegram.ui.Components.xb.g(t5Var, fbVar, 2750).j();
                } else if (!z11 && !z10) {
                    t5Var.presentFragment(ProfileActivity.C4(bVar.getDialogId()));
                }
            } else {
                di.mb.h1(context, t5Var.T, t5Var.S, boost, t5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, null);
        }
        if (view instanceof bh.c) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, ((bh.c) view).getPrepaidGiveaway());
        }
        if (((s5) t5Var.d0.get(i7)).a == 9) {
            t5Var.H0(Boolean.valueOf(t5Var.e0 == 1));
        }
    }

    public final void F0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.n0;
        tL_premium_getBoostsList.offset = this.k0;
        int i7 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.S);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.l0;
        int i7 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.S);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        if (bool == null) {
            Utilities.e.c(new k5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new k5(this, 2));
        } else {
            F0(null, new k5(this, 3));
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
            limitPreviewView.setDarkGradientProvider(new w0(this, 5));
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
        String M0 = org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753589 : 2131753587, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753588 : 2131753586, null));
        o5 o5Var = new o5(getParentActivity());
        o5Var.addView(this.U != null ? this.f0 : new View(o5Var.getContext()), c8.ja.d(-1, this.U != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, o5Var, new r5(this, getParentActivity()));
    }

    public final void J0(boolean z10) {
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new s5(14, false));
        if (this.U != null) {
            arrayList.add(new s5(16, org.telegram.messenger.hd.M0(2131744895, null)));
            arrayList.add(new s5(0, false));
            arrayList.add(new s5(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                arrayList.add(new s5(12, org.telegram.messenger.hd.M0(2131753324, null)));
                int i7 = 0;
                while (i7 < this.U.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i7);
                    boolean z11 = i7 == this.U.prepaid_giveaways.size() - 1;
                    s5 s5Var = new s5(11, true);
                    s5Var.e = prepaidGiveaway;
                    s5Var.f = z11;
                    arrayList.add(s5Var);
                    i7++;
                }
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(2131753286, null)));
            }
            arrayList.add(new s5(13, org.telegram.messenger.hd.M0(2131753606, null)));
            int i10 = this.e0;
            TLRPC.Chat chat = this.j0;
            if (i10 == 0) {
                ArrayList arrayList3 = this.X;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new s5(8, false));
                    arrayList.add(new s5(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new s5((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.Z, this.e0));
                        i11++;
                    }
                    if (this.Z) {
                        arrayList.add(new s5(9, true));
                    } else {
                        arrayList.add(new s5(7, false));
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.Y;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new s5(8, false));
                    arrayList.add(new s5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new s5((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.b0, this.e0));
                        i12++;
                    }
                    if (this.b0) {
                        arrayList.add(new s5(9, true));
                    } else {
                        arrayList.add(new s5(7, false));
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new s5(1, org.telegram.messenger.hd.M0(2131748914, null)));
            arrayList.add(new s5(3, this.U.boost_url));
            if (org.telegram.messenger.np.s1(this.T).q4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new s5(10, true));
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            } else {
                arrayList.add(new s5(6, ""));
            }
            arrayList.add(new s5(15, false));
        }
        n5 n5Var = this.g0;
        if (z10) {
            n5Var.E(arrayList2, arrayList);
        } else {
            n5Var.f();
        }
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new fi.i4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.addView(new fi.k1(parentActivity), c8.ja.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.i0, c8.ja.e(-1, -2, 17));
        this.i0.setAlpha(0.0f);
        if (this.U == null) {
            this.i0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new l5(this, 1));
        } else {
            this.i0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.V2) {
            if (i7 == org.telegram.messenger.ns.p3) {
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
        org.telegram.ui.ActionBar.e2 e2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack) : null;
        if (e2Var instanceof qn) {
            ((ActionBarLayout) getParentLayout()).d0(e2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((e2Var2 instanceof ProfileActivity) || (e2Var2 instanceof an)) {
                wg.h.f(e2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.e2) r.b.h(3, fragmentStack2) : null;
        if (e2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).d0(e2Var2, false);
        }
        finishFragment();
        if (e2Var3 instanceof an) {
            wg.h.f(e2Var3, chat, true);
        }
        if (e2Var2 instanceof an) {
            wg.h.f(e2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.p00
    public final v4.h0 k0() {
        return this.g0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.p3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.p3);
        super.onFragmentDestroy();
    }
}
