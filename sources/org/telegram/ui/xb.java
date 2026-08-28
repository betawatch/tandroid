package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xb extends FrameLayout {
    public final vb A;
    public final org.telegram.ui.Components.wk0 B;
    public ig.k C;
    public boolean D;
    public final LinearLayout E;
    public final TLRPC.Chat F;
    public String G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final long a;
    public final int b;
    public final s91 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.b6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean v;
    public int w;
    public final ArrayList x;
    public int y;

    public xb(s91 s91Var, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(s91Var.getParentActivity());
        int i9 = UserConfig.selectedAccount;
        this.b = i9;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        vb vbVar = new vb(this);
        this.A = vbVar;
        this.G = "";
        this.H = "";
        this.I = 5;
        this.J = 5;
        this.c = s91Var;
        Activity parentActivity = s91Var.getParentActivity();
        this.e = b6Var;
        this.a = j10;
        this.F = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(parentActivity, null);
        this.B = wk0Var;
        wk0Var.setSections(true);
        wk0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var));
        wk0Var.setLayoutManager(new f2.m0());
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        wk0Var.setItemAnimator(nVar);
        wk0Var.setClipToPadding(false);
        wk0Var.setOnItemClickListener(new qb(this, parentActivity, j10, b6Var, s91Var));
        addView(wk0Var);
        MessagesController.getInstance(i9).getBoostsController().getBoostsStats(j10, new sb(this, 0));
        wk0Var.setAdapter(vbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        pi0Var.setAutoRepeat(true);
        pi0Var.f(R.raw.statistic_preload, 120, 120, null);
        pi0Var.d();
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        g10.setTag(Integer.valueOf(i10));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView, 1);
        this.E.addView(pi0Var, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        this.E.addView(g10, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        this.E.addView(textView, g7.e6.q(-2, -2, 1));
        addView(this.E, g7.e6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.E.setAlpha(0.0f);
        this.E.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        gh.v7.y(i9, false).v();
    }

    public final void a(CountDownLatch countDownLatch, tb tbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.offset = this.G;
        int i9 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.a);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new ub(this, countDownLatch, tbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, tb tbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.I;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.H;
        int i9 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.a);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new ub(this, countDownLatch, tbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.D) {
            return;
        }
        this.D = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new tb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new tb(this, 1));
        } else {
            a(null, new tb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new wb(4, false));
            arrayList.add(new wb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new wb(0, false));
            arrayList.add(new wb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new wb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i9 = 0;
                while (i9 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i9);
                    boolean z11 = i9 == this.d.prepaid_giveaways.size() - 1;
                    wb wbVar = new wb(11, true);
                    wbVar.e = prepaidGiveaway;
                    wbVar.f = z11;
                    arrayList.add(wbVar);
                    i9++;
                }
                arrayList.add(new wb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new wb(13, LocaleController.getString(R.string.Boosters)));
            int i10 = this.y;
            TLRPC.Chat chat = this.F;
            if (i10 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new wb(8, false));
                    arrayList.add(new wb(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new wb((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() - 1 && !this.r, this.y));
                        i11++;
                    }
                    if (this.r) {
                        arrayList.add(new wb(9, true));
                    } else {
                        arrayList.add(new wb(7, false));
                    }
                    arrayList.add(new wb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new wb(8, false));
                    arrayList.add(new wb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new wb((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.v, this.y));
                        i12++;
                    }
                    if (this.v) {
                        arrayList.add(new wb(9, true));
                    } else {
                        arrayList.add(new wb(7, false));
                    }
                    arrayList.add(new wb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new wb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new wb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new wb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new wb(10, true));
                arrayList.add(new wb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        vb vbVar = this.A;
        if (z10) {
            vbVar.E(arrayList2, arrayList);
        } else {
            vbVar.l();
        }
    }
}
