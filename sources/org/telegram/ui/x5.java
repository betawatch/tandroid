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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x5 extends d20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public ChannelBoostsController.CanApplyBoost U;
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
    public final r5 f0;
    public boolean g0;
    public LinearLayout h0;
    public final TLRPC.Chat i0;
    public String j0;
    public String k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;

    public x5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.S = i10;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = 0;
        this.f0 = new r5(this);
        this.j0 = "";
        this.k0 = "";
        this.l0 = 5;
        this.m0 = 5;
        this.R = j10;
        this.i0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void w0(x5 x5Var, Context context, View view, int i10) {
        long j10 = x5Var.R;
        if (view instanceof ah.b) {
            ah.b bVar = (ah.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-x5Var.i0.id);
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
                    new vg.c0(x5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(x5Var.getParentActivity(), x5Var.getResourceProvider());
                    ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(2);
                    org.telegram.ui.Components.qc.g(x5Var, ybVar, 2750).j();
                } else if (!z11 && !z10) {
                    x5Var.presentFragment(ProfileActivity.t4(bVar.getDialogId()));
                }
            } else {
                bi.dd.d1(context, x5Var.S, x5Var.R, boost, x5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.v8) {
            vg.n.m(x5Var, x5Var.resourceProvider, j10, null);
        }
        if (view instanceof ah.c) {
            vg.n.m(x5Var, x5Var.resourceProvider, j10, ((ah.c) view).getPrepaidGiveaway());
        }
        if (((w5) x5Var.c0.get(i10)).a == 9) {
            x5Var.D0(Boolean.valueOf(x5Var.d0 == 1));
        }
    }

    public final void B0(CountDownLatch countDownLatch, o5 o5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.j0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new m5(this, countDownLatch, o5Var, 0), 2);
    }

    public final void C0(CountDownLatch countDownLatch, o5 o5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.k0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new m5(this, countDownLatch, o5Var, 1), 2);
    }

    public final void D0(Boolean bool) {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new o5(this, 1));
        } else if (bool.booleanValue()) {
            C0(null, new o5(this, 2));
        } else {
            B0(null, new o5(this, 3));
        }
    }

    public final void E0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.e0 = limitPreviewView;
            limitPreviewView.c0 = true;
            limitPreviewView.setDarkGradientProvider(new y0(this, 5));
        }
        if (this.e0.getParent() != null) {
            ((ViewGroup) this.e0.getParent()).removeView(this.e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.e0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.e0.setAlpha(0.0f);
                this.e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.i0;
        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannels : R.string.BoostingBoostForGroups);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannelsInfo : R.string.BoostingBoostForGroupsInfo));
        s5 s5Var = new s5(getParentActivity());
        s5Var.addView(this.T != null ? this.e0 : new View(s5Var.getContext()), org.telegram.ui.Components.gb1.h(-1, this.T != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        f0(string, replaceTags, s5Var, new v5(this, getParentActivity()));
    }

    public final void F0(boolean z10) {
        ArrayList arrayList = this.c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new w5(14, false));
        if (this.T != null) {
            arrayList.add(new w5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new w5(0, false));
            arrayList.add(new w5(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new w5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.T.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.T.prepaid_giveaways.size() - 1;
                    w5 w5Var = new w5(11, true);
                    w5Var.e = prepaidGiveaway;
                    w5Var.f = z11;
                    arrayList.add(w5Var);
                    i10++;
                }
                arrayList.add(new w5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new w5(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.d0;
            TLRPC.Chat chat = this.i0;
            if (i11 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new w5(8, false));
                    arrayList.add(new w5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new w5((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.Y, this.d0));
                        i12++;
                    }
                    if (this.Y) {
                        arrayList.add(new w5(9, true));
                    } else {
                        arrayList.add(new w5(7, false));
                    }
                    arrayList.add(new w5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new w5(8, false));
                    arrayList.add(new w5(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new w5((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.a0, this.d0));
                        i13++;
                    }
                    if (this.a0) {
                        arrayList.add(new w5(9, true));
                    } else {
                        arrayList.add(new w5(7, false));
                    }
                    arrayList.add(new w5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new w5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new w5(3, this.T.boost_url));
            if (MessagesController.getInstance(this.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new w5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new w5(10, true));
                arrayList.add(new w5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new w5(6, ""));
            }
            arrayList.add(new w5(15, false));
        }
        r5 r5Var = this.f0;
        if (z10) {
            r5Var.E(arrayList2, arrayList);
        } else {
            r5Var.l();
        }
    }

    @Override // org.telegram.ui.d20, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        View createView = super.createView(context);
        E0(false);
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new di.x4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.h0.addView(new di.s1(parentActivity), org.telegram.ui.Components.gb1.x(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.h0, org.telegram.ui.Components.gb1.i(-1, -2, 17));
        this.h0.setAlpha(0.0f);
        if (this.T == null) {
            this.h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.R, new p5(this, 1));
        } else {
            this.h0.setVisibility(8);
            D0(null);
        }
        F0(false);
        return createView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 == NotificationCenter.chatWasBoostedByUser) {
                if (this.R == ((Long) objArr[2]).longValue()) {
                    this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.U = (ChannelBoostsController.CanApplyBoost) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        List fragmentStack = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.r2 r2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack) : null;
        if (r2Var instanceof mo) {
            ((ActionBarLayout) getParentLayout()).c0(r2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((r2Var2 instanceof ProfileActivity) || (r2Var2 instanceof un)) {
                vg.j.f(r2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(3, fragmentStack2) : null;
        if (r2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).c0(r2Var2, false);
        }
        finishFragment();
        if (r2Var3 instanceof un) {
            vg.j.f(r2Var3, chat, true);
        }
        if (r2Var2 instanceof un) {
            vg.j.f(r2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.d20
    public final s4.h0 g0() {
        return this.f0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
