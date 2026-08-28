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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u5 extends x10 implements NotificationCenter.NotificationCenterDelegate {
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
    public final o5 Z;
    public boolean a0;
    public LinearLayout b0;
    public final TLRPC.Chat c0;
    public String d0;
    public String e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;

    public u5(long j10) {
        int i9 = UserConfig.selectedAccount;
        this.M = i9;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.W = new ArrayList();
        this.X = 0;
        this.Z = new o5(this);
        this.d0 = "";
        this.e0 = "";
        this.f0 = 5;
        this.g0 = 5;
        this.L = j10;
        this.c0 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
    }

    public static void w0(u5 u5Var, Context context, View view, int i9) {
        long j10 = u5Var.L;
        if (view instanceof gg.b) {
            gg.b bVar = (gg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-u5Var.c0.id);
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
                    new bg.l1(u5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(u5Var.getParentActivity(), u5Var.getResourceProvider());
                    obVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    obVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    obVar.b.setSingleLine(false);
                    obVar.b.setMaxLines(2);
                    org.telegram.ui.Components.gc.g(u5Var, obVar, 2750).j();
                } else if (!z11 && !z10) {
                    u5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                }
            } else {
                gh.oa.e1(context, u5Var.M, u5Var.L, boost, u5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            bg.a0.m(u5Var, u5Var.resourceProvider, j10, null);
        }
        if (view instanceof gg.c) {
            bg.a0.m(u5Var, u5Var.resourceProvider, j10, ((gg.c) view).getPrepaidGiveaway());
        }
        if (((t5) u5Var.W.get(i9)).a == 9) {
            u5Var.D0(Boolean.valueOf(u5Var.X == 1));
        }
    }

    public final void B0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.g0;
        tL_premium_getBoostsList.offset = this.d0;
        int i9 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.L);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 0), 2);
    }

    public final void C0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.e0;
        int i9 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.L);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 1), 2);
    }

    public final void D0(Boolean bool) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new l5(this, 1));
        } else if (bool.booleanValue()) {
            C0(null, new l5(this, 2));
        } else {
            B0(null, new l5(this, 3));
        }
    }

    public final void E0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.Y == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Y = limitPreviewView;
            limitPreviewView.V = true;
            limitPreviewView.setDarkGradientProvider(new b1(this, 5));
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
        p5 p5Var = new p5(getParentActivity());
        p5Var.addView(this.N != null ? this.Y : new View(p5Var.getContext()), g7.e6.d(-1, this.N != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        l0(string, replaceTags, p5Var, new s5(this, getParentActivity()));
    }

    public final void F0(boolean z10) {
        ArrayList arrayList = this.W;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new t5(14, false));
        if (this.N != null) {
            arrayList.add(new t5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new t5(0, false));
            arrayList.add(new t5(2, false));
            if (this.N.prepaid_giveaways.size() > 0) {
                arrayList.add(new t5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i9 = 0;
                while (i9 < this.N.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.N.prepaid_giveaways.get(i9);
                    boolean z11 = i9 == this.N.prepaid_giveaways.size() - 1;
                    t5 t5Var = new t5(11, true);
                    t5Var.e = prepaidGiveaway;
                    t5Var.f = z11;
                    arrayList.add(t5Var);
                    i9++;
                }
                arrayList.add(new t5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new t5(13, LocaleController.getString(R.string.Boosters)));
            int i10 = this.X;
            TLRPC.Chat chat = this.c0;
            if (i10 == 0) {
                ArrayList arrayList3 = this.Q;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new t5(8, false));
                    arrayList.add(new t5(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new t5((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() - 1 && !this.S, this.X));
                        i11++;
                    }
                    if (this.S) {
                        arrayList.add(new t5(9, true));
                    } else {
                        arrayList.add(new t5(7, false));
                    }
                    arrayList.add(new t5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.R;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new t5(8, false));
                    arrayList.add(new t5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new t5((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.U, this.X));
                        i12++;
                    }
                    if (this.U) {
                        arrayList.add(new t5(9, true));
                    } else {
                        arrayList.add(new t5(7, false));
                    }
                    arrayList.add(new t5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new t5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new t5(3, this.N.boost_url));
            if (MessagesController.getInstance(this.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new t5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new t5(10, true));
                arrayList.add(new t5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new t5(6, ""));
            }
            arrayList.add(new t5(15, false));
        }
        o5 o5Var = this.Z;
        if (z10) {
            o5Var.E(arrayList2, arrayList);
        } else {
            o5Var.l();
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        E0(false);
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        this.c.setItemAnimator(nVar);
        this.c.setOnItemClickListener(new bg.b1(5, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.b0 = linearLayout;
        linearLayout.setOrientation(1);
        this.b0.addView(new ih.o1(parentActivity), g7.e6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.b0, g7.e6.e(-1, -2, 17));
        this.b0.setAlpha(0.0f);
        if (this.N == null) {
            this.b0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.L, new m5(this, 1));
        } else {
            this.b0.setVisibility(8);
            D0(null);
        }
        F0(false);
        return createView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.boostByChannelCreated) {
            if (i9 == NotificationCenter.chatWasBoostedByUser) {
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
        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack) : null;
        if (o2Var instanceof ho) {
            ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof qn)) {
                bg.u.f(o2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) j3.r0.k(3, fragmentStack2) : null;
        if (o2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
        }
        finishFragment();
        if (o2Var3 instanceof qn) {
            bg.u.f(o2Var3, chat, true);
        }
        if (o2Var2 instanceof qn) {
            bg.u.f(o2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.x10
    public final f2.r0 m0() {
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
