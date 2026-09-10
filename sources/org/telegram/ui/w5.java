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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w5 extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public final int Q;
    public TL_stories.TL_premium_boostsStatus R;
    public ChannelBoostsController.CanApplyBoost S;
    public ScrollSlidingTextTabStrip T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public int X;
    public boolean Y;
    public int Z;
    public final ArrayList a0;
    public int b0;
    public LimitPreviewView c0;
    public final o5 d0;
    public boolean e0;
    public LinearLayout f0;
    public final TLRPC.Chat g0;
    public String h0;
    public String i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;

    public w5(long j3) {
        int i10 = UserConfig.selectedAccount;
        this.Q = i10;
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = 0;
        this.d0 = new o5(this);
        this.h0 = "";
        this.i0 = "";
        this.j0 = 5;
        this.k0 = 5;
        this.P = j3;
        this.g0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
    }

    public static void x0(w5 w5Var, Context context, View view, int i10) {
        long j3 = w5Var.P;
        if (view instanceof xg.b) {
            xg.b bVar = (xg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-w5Var.g0.id);
                    int i11 = boost.date;
                    tL_payments_checkedGiftCode.date = i11;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i12 = boost.expires - i11;
                    tL_payments_checkedGiftCode.days = i12 / 86400;
                    tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new sg.c0(w5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(w5Var.getParentActivity(), w5Var.getResourceProvider());
                    xbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    xbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    xbVar.b.setSingleLine(false);
                    xbVar.b.setMaxLines(2);
                    org.telegram.ui.Components.pc.g(w5Var, xbVar, 2750).j();
                } else if (!z11 && !z10) {
                    w5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                }
            } else {
                xh.z7.e1(context, w5Var.Q, w5Var.P, boost, w5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.s8) {
            sg.m.m(w5Var, w5Var.resourceProvider, j3, null);
        }
        if (view instanceof xg.c) {
            sg.m.m(w5Var, w5Var.resourceProvider, j3, ((xg.c) view).getPrepaidGiveaway());
        }
        if (((v5) w5Var.a0.get(i10)).a == 9) {
            w5Var.E0(Boolean.valueOf(w5Var.b0 == 1));
        }
    }

    public final void C0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.k0;
        tL_premium_getBoostsList.offset = this.h0;
        int i10 = this.Q;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.P);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 0), 2);
    }

    public final void D0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.j0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.i0;
        int i10 = this.Q;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.P);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 1), 2);
    }

    public final void E0(Boolean bool) {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new l5(this, 1));
        } else if (bool.booleanValue()) {
            D0(null, new l5(this, 2));
        } else {
            C0(null, new l5(this, 3));
        }
    }

    public final void F0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.c0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.c0 = limitPreviewView;
            limitPreviewView.c0 = true;
            limitPreviewView.setDarkGradientProvider(new a1(this, 5));
        }
        if (this.c0.getParent() != null) {
            ((ViewGroup) this.c0.getParent()).removeView(this.c0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R;
        if (tL_premium_boostsStatus != null) {
            this.c0.e(tL_premium_boostsStatus, false);
            if (z10) {
                this.c0.setAlpha(0.0f);
                this.c0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.g0;
        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannels : R.string.BoostingBoostForGroups);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannelsInfo : R.string.BoostingBoostForGroupsInfo));
        q5 q5Var = new q5(getParentActivity());
        q5Var.addView(this.R != null ? this.c0 : new View(q5Var.getContext()), w7.a6.d(-1, this.R != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, q5Var, new t5(this, getParentActivity()));
    }

    public final void G0(boolean z10) {
        ArrayList arrayList = this.a0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new v5(14, false));
        if (this.R != null) {
            arrayList.add(new v5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new v5(0, false));
            arrayList.add(new v5(2, false));
            if (this.R.prepaid_giveaways.size() > 0) {
                arrayList.add(new v5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.R.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.R.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.R.prepaid_giveaways.size() - 1;
                    v5 v5Var = new v5(11, true);
                    v5Var.e = prepaidGiveaway;
                    v5Var.f = z11;
                    arrayList.add(v5Var);
                    i10++;
                }
                arrayList.add(new v5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new v5(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.b0;
            TLRPC.Chat chat = this.g0;
            if (i11 == 0) {
                ArrayList arrayList3 = this.U;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new v5(8, false));
                    arrayList.add(new v5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new v5((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.W, this.b0));
                        i12++;
                    }
                    if (this.W) {
                        arrayList.add(new v5(9, true));
                    } else {
                        arrayList.add(new v5(7, false));
                    }
                    arrayList.add(new v5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.V;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new v5(8, false));
                    arrayList.add(new v5(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new v5((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.Y, this.b0));
                        i13++;
                    }
                    if (this.Y) {
                        arrayList.add(new v5(9, true));
                    } else {
                        arrayList.add(new v5(7, false));
                    }
                    arrayList.add(new v5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new v5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new v5(3, this.R.boost_url));
            if (MessagesController.getInstance(this.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new v5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new v5(10, true));
                arrayList.add(new v5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new v5(6, ""));
            }
            arrayList.add(new v5(15, false));
        }
        o5 o5Var = this.d0;
        if (z10) {
            o5Var.E(arrayList2, arrayList);
        } else {
            o5Var.l();
        }
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        View createView = super.createView(context);
        F0(false);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ai.b0(2, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f0.addView(new p5(parentActivity), w7.a6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f0, w7.a6.e(-1, -2, 17));
        this.f0.setAlpha(0.0f);
        if (this.R == null) {
            this.f0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.P, new m5(this, 1));
        } else {
            this.f0.setVisibility(8);
            E0(null);
        }
        G0(false);
        return createView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 == NotificationCenter.chatWasBoostedByUser) {
                if (this.P == ((Long) objArr[2]).longValue()) {
                    this.R = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.S = (ChannelBoostsController.CanApplyBoost) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.p2 p2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(2, fragmentStack) : null;
        if (p2Var instanceof yo) {
            ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((p2Var2 instanceof ProfileActivity) || (p2Var2 instanceof eo)) {
                sg.i.f(p2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(3, fragmentStack2) : null;
        if (p2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
        }
        finishFragment();
        if (p2Var3 instanceof eo) {
            sg.i.f(p2Var3, chat, true);
        }
        if (p2Var2 instanceof eo) {
            sg.i.f(p2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.s20
    public final s4.h0 n0() {
        return this.d0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
