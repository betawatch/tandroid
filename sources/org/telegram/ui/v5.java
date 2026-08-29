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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v5 extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public final int M;
    public TL_stories.TL_premium_boostsStatus N;
    public ChannelBoostsController.CanApplyBoost O;
    public ScrollSlidingTextTabStrip P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public final ArrayList W;
    public int X;
    public LimitPreviewView Y;
    public final p5 Z;
    public boolean a0;
    public LinearLayout b0;
    public final TLRPC.Chat c0;
    public String d0;
    public String e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;

    public v5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.M = i10;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.W = new ArrayList();
        this.X = 0;
        this.Z = new p5(this);
        this.d0 = "";
        this.e0 = "";
        this.f0 = 5;
        this.g0 = 5;
        this.L = j10;
        this.c0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void x0(v5 v5Var, Context context, View view, int i10) {
        long j10 = v5Var.L;
        if (view instanceof jg.b) {
            jg.b bVar = (jg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-v5Var.c0.id);
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
                    new eg.f1(v5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(v5Var.getParentActivity(), v5Var.getResourceProvider());
                    ubVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    ubVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    ubVar.b.setSingleLine(false);
                    ubVar.b.setMaxLines(2);
                    org.telegram.ui.Components.mc.g(v5Var, ubVar, 2750).j();
                } else if (!z11 && !z10) {
                    v5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                }
            } else {
                jh.ia.e1(context, v5Var.M, v5Var.L, boost, v5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            eg.y.m(v5Var, v5Var.resourceProvider, j10, null);
        }
        if (view instanceof jg.c) {
            eg.y.m(v5Var, v5Var.resourceProvider, j10, ((jg.c) view).getPrepaidGiveaway());
        }
        if (((u5) v5Var.W.get(i10)).a == 9) {
            v5Var.E0(Boolean.valueOf(v5Var.X == 1));
        }
    }

    public final void C0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.g0;
        tL_premium_getBoostsList.offset = this.d0;
        int i10 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.L);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 0), 2);
    }

    public final void D0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.e0;
        int i10 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.L);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 1), 2);
    }

    public final void E0(Boolean bool) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new m5(this, 1));
        } else if (bool.booleanValue()) {
            D0(null, new m5(this, 2));
        } else {
            C0(null, new m5(this, 3));
        }
    }

    public final void F0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.Y == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Y = limitPreviewView;
            limitPreviewView.V = true;
            limitPreviewView.setDarkGradientProvider(new c1(this, 5));
        }
        if (this.Y.getParent() != null) {
            ((ViewGroup) this.Y.getParent()).removeView(this.Y);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.N;
        if (tL_premium_boostsStatus != null) {
            this.Y.e(tL_premium_boostsStatus, false);
            if (z10) {
                this.Y.setAlpha(0.0f);
                this.Y.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.c0;
        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannels : R.string.BoostingBoostForGroups);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannelsInfo : R.string.BoostingBoostForGroupsInfo));
        q5 q5Var = new q5(getParentActivity());
        q5Var.addView(this.N != null ? this.Y : new View(q5Var.getContext()), i7.f6.d(-1, this.N != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, q5Var, new t5(this, getParentActivity()));
    }

    public final void G0(boolean z10) {
        ArrayList arrayList = this.W;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new u5(14, false));
        if (this.N != null) {
            arrayList.add(new u5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new u5(0, false));
            arrayList.add(new u5(2, false));
            if (this.N.prepaid_giveaways.size() > 0) {
                arrayList.add(new u5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.N.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.N.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.N.prepaid_giveaways.size() - 1;
                    u5 u5Var = new u5(11, true);
                    u5Var.e = prepaidGiveaway;
                    u5Var.f = z11;
                    arrayList.add(u5Var);
                    i10++;
                }
                arrayList.add(new u5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new u5(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.X;
            TLRPC.Chat chat = this.c0;
            if (i11 == 0) {
                ArrayList arrayList3 = this.Q;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new u5(8, false));
                    arrayList.add(new u5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new u5((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.S, this.X));
                        i12++;
                    }
                    if (this.S) {
                        arrayList.add(new u5(9, true));
                    } else {
                        arrayList.add(new u5(7, false));
                    }
                    arrayList.add(new u5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.R;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new u5(8, false));
                    arrayList.add(new u5(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new u5((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.U, this.X));
                        i13++;
                    }
                    if (this.U) {
                        arrayList.add(new u5(9, true));
                    } else {
                        arrayList.add(new u5(7, false));
                    }
                    arrayList.add(new u5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new u5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new u5(3, this.N.boost_url));
            if (MessagesController.getInstance(this.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new u5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new u5(10, true));
                arrayList.add(new u5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new u5(6, ""));
            }
            arrayList.add(new u5(15, false));
        }
        p5 p5Var = this.Z;
        if (z10) {
            p5Var.E(arrayList2, arrayList);
        } else {
            p5Var.l();
        }
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        F0(false);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new eg.w0(4, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.b0 = linearLayout;
        linearLayout.setOrientation(1);
        this.b0.addView(new lh.m1(parentActivity), i7.f6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.b0, i7.f6.e(-1, -2, 17));
        this.b0.setAlpha(0.0f);
        if (this.N == null) {
            this.b0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.L, new n5(this, 1));
        } else {
            this.b0.setVisibility(8);
            E0(null);
        }
        G0(false);
        return createView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 == NotificationCenter.chatWasBoostedByUser) {
                if (this.L == ((Long) objArr[2]).longValue()) {
                    this.N = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.O = (ChannelBoostsController.CanApplyBoost) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack) : null;
        if (o2Var instanceof ko) {
            ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof tn)) {
                eg.s.f(o2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack2) : null;
        if (o2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
        }
        finishFragment();
        if (o2Var3 instanceof tn) {
            eg.s.f(o2Var3, chat, true);
        }
        if (o2Var2 instanceof tn) {
            eg.s.f(o2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.z10
    public final f2.p0 n0() {
        return this.Z;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
