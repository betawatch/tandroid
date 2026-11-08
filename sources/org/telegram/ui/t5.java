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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t5 extends o00 implements org.telegram.messenger.ls {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public org.telegram.messenger.e3 U;
    public ScrollSlidingTextTabStrip V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public int Z;
    public boolean a0;
    public int b0;
    public final ArrayList c0;
    public int d0;
    public LimitPreviewView e0;
    public final n5 f0;
    public boolean g0;
    public LinearLayout h0;
    public final TLRPC.Chat i0;
    public String j0;
    public String k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;

    public t5(long j3) {
        int i7 = org.telegram.messenger.p10.s0;
        this.S = i7;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = 0;
        this.f0 = new n5(this);
        this.j0 = "";
        this.k0 = "";
        this.l0 = 5;
        this.m0 = 5;
        this.R = j3;
        this.i0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
    }

    public static void A0(t5 t5Var, Context context, View view, int i7) {
        long j3 = t5Var.R;
        if (view instanceof bh.b) {
            bh.b bVar = (bh.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z9 = boost.giveaway;
            if (!z9 || boost.stars <= 0) {
                boolean z10 = boost.gift;
                if (((z10 || z9) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).z1(-t5Var.i0.id);
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
                    new wg.c0(t5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z9 && boost.user_id == -1) {
                    org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(t5Var.getParentActivity(), t5Var.getResourceProvider());
                    kbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    kbVar.b.setText(org.telegram.messenger.id.M0(2131753303, null));
                    kbVar.b.setSingleLine(false);
                    kbVar.b.setMaxLines(2);
                    org.telegram.ui.Components.cc.g(t5Var, kbVar, 2750).j();
                } else if (!z10 && !z9) {
                    t5Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
                }
            } else {
                bi.dd.h1(context, t5Var.S, t5Var.R, boost, t5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, null);
        }
        if (view instanceof bh.c) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, ((bh.c) view).getPrepaidGiveaway());
        }
        if (((s5) t5Var.c0.get(i7)).a == 9) {
            t5Var.H0(Boolean.valueOf(t5Var.d0 == 1));
        }
    }

    public final void F0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.j0;
        int i7 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.R);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.k0;
        int i7 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.R);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        if (bool == null) {
            Utilities.e.c(new k5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new k5(this, 2));
        } else {
            F0(null, new k5(this, 3));
        }
    }

    public final void I0(boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_limit_boost, 0, 0, getParentActivity(), this.resourceProvider);
            this.e0 = limitPreviewView;
            limitPreviewView.c0 = true;
            limitPreviewView.setDarkGradientProvider(new w0(this, 5));
        }
        if (this.e0.getParent() != null) {
            ((ViewGroup) this.e0.getParent()).removeView(this.e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.e0.g(tL_premium_boostsStatus, false);
            if (z9) {
                this.e0.setAlpha(0.0f);
                this.e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.i0;
        String M0 = org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753589 : 2131753587, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753588 : 2131753586, null));
        o5 o5Var = new o5(getParentActivity());
        o5Var.addView(this.T != null ? this.e0 : new View(o5Var.getContext()), c8.ha.d(-1, this.T != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, o5Var, new r5(this, getParentActivity()));
    }

    public final void J0(boolean z9) {
        ArrayList arrayList = this.c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new s5(14, false));
        if (this.T != null) {
            arrayList.add(new s5(16, org.telegram.messenger.id.M0(2131744898, null)));
            arrayList.add(new s5(0, false));
            arrayList.add(new s5(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new s5(12, org.telegram.messenger.id.M0(2131753324, null)));
                int i7 = 0;
                while (i7 < this.T.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i7);
                    boolean z10 = i7 == this.T.prepaid_giveaways.size() - 1;
                    s5 s5Var = new s5(11, true);
                    s5Var.e = prepaidGiveaway;
                    s5Var.f = z10;
                    arrayList.add(s5Var);
                    i7++;
                }
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(2131753286, null)));
            }
            arrayList.add(new s5(13, org.telegram.messenger.id.M0(2131753606, null)));
            int i10 = this.d0;
            TLRPC.Chat chat = this.i0;
            if (i10 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new s5(8, false));
                    arrayList.add(new s5(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new s5((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.Y, this.d0));
                        i11++;
                    }
                    if (this.Y) {
                        arrayList.add(new s5(9, true));
                    } else {
                        arrayList.add(new s5(7, false));
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new s5(8, false));
                    arrayList.add(new s5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new s5((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.a0, this.d0));
                        i12++;
                    }
                    if (this.a0) {
                        arrayList.add(new s5(9, true));
                    } else {
                        arrayList.add(new s5(7, false));
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new s5(1, org.telegram.messenger.id.M0(2131748915, null)));
            arrayList.add(new s5(3, this.T.boost_url));
            if (org.telegram.messenger.qp.s1(this.S).p4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new s5(10, true));
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            } else {
                arrayList.add(new s5(6, ""));
            }
            arrayList.add(new s5(15, false));
        }
        n5 n5Var = this.f0;
        if (z9) {
            n5Var.E(arrayList2, arrayList);
        } else {
            n5Var.f();
        }
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new di.p4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.h0.addView(new di.m1(parentActivity), c8.ha.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.h0, c8.ha.e(-1, -2, 17));
        this.h0.setAlpha(0.0f);
        if (this.T == null) {
            this.h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.R, new l5(this, 1));
        } else {
            this.h0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.V2) {
            if (i7 == org.telegram.messenger.qs.p3) {
                if (this.R == ((Long) objArr[2]).longValue()) {
                    this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.U = (org.telegram.messenger.e3) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.f2 f2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack) : null;
        if (f2Var instanceof pn) {
            ((ActionBarLayout) getParentLayout()).d0(f2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((f2Var2 instanceof ProfileActivity) || (f2Var2 instanceof an)) {
                wg.h.f(f2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.f2) rf.b.g(3, fragmentStack2) : null;
        if (f2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).d0(f2Var2, false);
        }
        finishFragment();
        if (f2Var3 instanceof an) {
            wg.h.f(f2Var3, chat, true);
        }
        if (f2Var2 instanceof an) {
            wg.h.f(f2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.o00
    public final v4.g0 k0() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.p3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.p3);
        super.onFragmentDestroy();
    }
}
