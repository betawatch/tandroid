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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y5 extends b20 implements NotificationCenter.NotificationCenterDelegate {
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
    public final s5 f0;
    public boolean g0;
    public LinearLayout h0;
    public final TLRPC.Chat i0;
    public String j0;
    public String k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;

    public y5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.S = i10;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = 0;
        this.f0 = new s5(this);
        this.j0 = "";
        this.k0 = "";
        this.l0 = 5;
        this.m0 = 5;
        this.R = j10;
        this.i0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void y0(y5 y5Var, Context context, View view, int i10) {
        long j10 = y5Var.R;
        if (view instanceof zg.b) {
            zg.b bVar = (zg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (!z10 || boost.stars <= 0) {
                boolean z11 = boost.gift;
                if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-y5Var.i0.id);
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
                    new ug.a0(y5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z10 && boost.user_id == -1) {
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(y5Var.getParentActivity(), y5Var.getResourceProvider());
                    ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                    ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(2);
                    org.telegram.ui.Components.qc.g(y5Var, ybVar, 2750).j();
                } else if (!z11 && !z10) {
                    y5Var.presentFragment(ProfileActivity.o4(bVar.getDialogId()));
                }
            } else {
                ai.nd.f1(context, y5Var.S, y5Var.R, boost, y5Var.getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.r8) {
            ug.l.m(y5Var, y5Var.resourceProvider, j10, null);
        }
        if (view instanceof zg.c) {
            ug.l.m(y5Var, y5Var.resourceProvider, j10, ((zg.c) view).getPrepaidGiveaway());
        }
        if (((x5) y5Var.c0.get(i10)).a == 9) {
            y5Var.F0(Boolean.valueOf(y5Var.d0 == 1));
        }
    }

    public final void D0(CountDownLatch countDownLatch, p5 p5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.j0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new n5(this, countDownLatch, p5Var, 0), 2);
    }

    public final void E0(CountDownLatch countDownLatch, p5 p5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.k0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new n5(this, countDownLatch, p5Var, 1), 2);
    }

    public final void F0(Boolean bool) {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new p5(this, 1));
        } else if (bool.booleanValue()) {
            E0(null, new p5(this, 2));
        } else {
            D0(null, new p5(this, 3));
        }
    }

    public final void G0(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.e0 = limitPreviewView;
            limitPreviewView.c0 = true;
            limitPreviewView.setDarkGradientProvider(new a1(this, 5));
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
        t5 t5Var = new t5(getParentActivity());
        t5Var.addView(this.T != null ? this.e0 : new View(t5Var.getContext()), w7.z5.d(-1, this.T != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, t5Var, new w5(this, getParentActivity()));
    }

    public final void H0(boolean z10) {
        ArrayList arrayList = this.c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new x5(14, false));
        if (this.T != null) {
            arrayList.add(new x5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new x5(0, false));
            arrayList.add(new x5(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new x5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.T.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.T.prepaid_giveaways.size() - 1;
                    x5 x5Var = new x5(11, true);
                    x5Var.e = prepaidGiveaway;
                    x5Var.f = z11;
                    arrayList.add(x5Var);
                    i10++;
                }
                arrayList.add(new x5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new x5(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.d0;
            TLRPC.Chat chat = this.i0;
            if (i11 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new x5(8, false));
                    arrayList.add(new x5(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new x5((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.Y, this.d0));
                        i12++;
                    }
                    if (this.Y) {
                        arrayList.add(new x5(9, true));
                    } else {
                        arrayList.add(new x5(7, false));
                    }
                    arrayList.add(new x5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new x5(8, false));
                    arrayList.add(new x5(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new x5((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.a0, this.d0));
                        i13++;
                    }
                    if (this.a0) {
                        arrayList.add(new x5(9, true));
                    } else {
                        arrayList.add(new x5(7, false));
                    }
                    arrayList.add(new x5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new x5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new x5(3, this.T.boost_url));
            if (MessagesController.getInstance(this.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new x5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new x5(10, true));
                arrayList.add(new x5(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new x5(6, ""));
            }
            arrayList.add(new x5(15, false));
        }
        s5 s5Var = this.f0;
        if (z10) {
            s5Var.E(arrayList2, arrayList);
        } else {
            s5Var.l();
        }
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        G0(false);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new ci.x4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.h0.addView(new ci.s1(parentActivity), w7.z5.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.h0, w7.z5.e(-1, -2, 17));
        this.h0.setAlpha(0.0f);
        if (this.T == null) {
            this.h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.R, new q5(this, 1));
        } else {
            this.h0.setVisibility(8);
            F0(null);
        }
        H0(false);
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
        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack) : null;
        if (o2Var instanceof ko) {
            ((ActionBarLayout) getParentLayout()).b0(o2Var, false);
        }
        List fragmentStack2 = getParentLayout().getFragmentStack();
        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack2) : null;
        if (!booleanValue) {
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof sn)) {
                ug.h.f(o2Var2, chat, false);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.o2) si.o0.g(3, fragmentStack2) : null;
        if (o2Var2 instanceof ProfileActivity) {
            ((ActionBarLayout) getParentLayout()).b0(o2Var2, false);
        }
        finishFragment();
        if (o2Var3 instanceof sn) {
            ug.h.f(o2Var3, chat, true);
        }
        if (o2Var2 instanceof sn) {
            ug.h.f(o2Var2, chat, true);
        }
    }

    @Override // org.telegram.ui.b20
    public final s4.g0 n0() {
        return this.f0;
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
