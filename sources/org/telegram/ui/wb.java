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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wb extends FrameLayout {
    public final ub A;
    public final org.telegram.ui.Components.jl0 B;
    public lg.k C;
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
    public final t91 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.c6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean v;
    public int w;
    public final ArrayList x;
    public int y;

    public wb(t91 t91Var, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(t91Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        ub ubVar = new ub(this);
        this.A = ubVar;
        this.G = "";
        this.H = "";
        this.I = 5;
        this.J = 5;
        this.c = t91Var;
        Activity parentActivity = t91Var.getParentActivity();
        this.e = c6Var;
        this.a = j10;
        this.F = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(parentActivity, null);
        this.B = jl0Var;
        jl0Var.setSections(true);
        jl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var));
        jl0Var.setLayoutManager(new f2.j0());
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        jl0Var.setItemAnimator(lVar);
        jl0Var.setClipToPadding(false);
        jl0Var.setOnItemClickListener(new pb(this, parentActivity, j10, c6Var, t91Var));
        addView(jl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new rb(this, 0));
        jl0Var.setAdapter(ubVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.statistic_preload, 120, 120, null);
        aj0Var.d();
        TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
        h.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        h.setTag(Integer.valueOf(i11));
        h.setText(LocaleController.getString(R.string.LoadingStats));
        h.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        b.i(R.string.LoadingStatsDescription, textView, 1);
        this.E.addView(aj0Var, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        this.E.addView(h, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        this.E.addView(textView, i7.f6.q(-2, -2, 1));
        addView(this.E, i7.f6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.E.setAlpha(0.0f);
        this.E.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        jh.s7.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, sb sbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.offset = this.G;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new tb(this, countDownLatch, sbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, sb sbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.I;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.H;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new tb(this, countDownLatch, sbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.D) {
            return;
        }
        this.D = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new sb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new sb(this, 1));
        } else {
            a(null, new sb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new vb(4, false));
            arrayList.add(new vb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new vb(0, false));
            arrayList.add(new vb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new vb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.d.prepaid_giveaways.size() - 1;
                    vb vbVar = new vb(11, true);
                    vbVar.e = prepaidGiveaway;
                    vbVar.f = z11;
                    arrayList.add(vbVar);
                    i10++;
                }
                arrayList.add(new vb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new vb(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.y;
            TLRPC.Chat chat = this.F;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new vb(8, false));
                    arrayList.add(new vb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new vb((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.r, this.y));
                        i12++;
                    }
                    if (this.r) {
                        arrayList.add(new vb(9, true));
                    } else {
                        arrayList.add(new vb(7, false));
                    }
                    arrayList.add(new vb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new vb(8, false));
                    arrayList.add(new vb(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new vb((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.v, this.y));
                        i13++;
                    }
                    if (this.v) {
                        arrayList.add(new vb(9, true));
                    } else {
                        arrayList.add(new vb(7, false));
                    }
                    arrayList.add(new vb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new vb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new vb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new vb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new vb(10, true));
                arrayList.add(new vb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        ub ubVar = this.A;
        if (z10) {
            ubVar.E(arrayList2, arrayList);
        } else {
            ubVar.l();
        }
    }
}
