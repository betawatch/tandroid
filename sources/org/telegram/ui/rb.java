package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rb extends FrameLayout {
    public int E;
    public final pb F;
    public final org.telegram.ui.Components.tj0 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long a;
    public final int b;
    public final r41 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.e6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public rb(r41 r41Var, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(r41Var.getParentActivity());
        int i3 = org.telegram.messenger.h10.t0;
        this.b = i3;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        pb pbVar = new pb(this);
        this.F = pbVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.c = r41Var;
        Activity parentActivity = r41Var.getParentActivity();
        this.e = e6Var;
        this.a = j10;
        this.J = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(parentActivity, null);
        this.G = tj0Var;
        tj0Var.setSections(true);
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        tj0Var.setLayoutManager(new u4.b0());
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        tj0Var.setItemAnimator(kVar);
        tj0Var.setClipToPadding(false);
        tj0Var.setOnItemClickListener(new lb(this, parentActivity, j10, e6Var, r41Var));
        addView(tj0Var);
        org.telegram.messenger.hp.s1(i3).G0().a(j10, new s3(this, 1));
        tj0Var.setAdapter(pbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.statistic_preload, 120, 120, null);
        fh0Var.d();
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g7.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(g7, i10, null);
        g7.setTag(Integer.valueOf(i10));
        g7.setText(org.telegram.messenger.bd.M0(2131748785, null));
        g7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView.setGravity(1);
        this.I.addView(fh0Var, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(g7, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, b8.mf.r(-2, -2, 1));
        addView(this.I, b8.mf.d(org.telegram.messenger.hs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        ci.e9.y(i3, false).v();
    }

    public final void a(CountDownLatch countDownLatch, nb nbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i3 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.a);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new ob(this, countDownLatch, nbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, nb nbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i3 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.a);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new ob(this, countDownLatch, nbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new nb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new nb(this, 1));
        } else {
            a(null, new nb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new qb(4, false));
            arrayList.add(new qb(1, org.telegram.messenger.bd.M0(2131744905, null)));
            arrayList.add(new qb(0, false));
            arrayList.add(new qb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new qb(12, org.telegram.messenger.bd.M0(2131753324, null)));
                int i3 = 0;
                while (i3 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i3);
                    boolean z11 = i3 == this.d.prepaid_giveaways.size() - 1;
                    qb qbVar = new qb(11, true);
                    qbVar.e = prepaidGiveaway;
                    qbVar.f = z11;
                    arrayList.add(qbVar);
                    i3++;
                }
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(2131753286, null)));
            }
            arrayList.add(new qb(13, org.telegram.messenger.bd.M0(2131753606, null)));
            int i10 = this.E;
            TLRPC.Chat chat = this.J;
            if (i10 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new qb(8, false));
                    arrayList.add(new qb(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new qb((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.r, this.E));
                        i11++;
                    }
                    if (this.r) {
                        arrayList.add(new qb(9, true));
                    } else {
                        arrayList.add(new qb(7, false));
                    }
                    arrayList.add(new qb(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new qb(8, false));
                    arrayList.add(new qb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new qb((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.w, this.E));
                        i12++;
                    }
                    if (this.w) {
                        arrayList.add(new qb(9, true));
                    } else {
                        arrayList.add(new qb(7, false));
                    }
                    arrayList.add(new qb(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new qb(1, org.telegram.messenger.bd.M0(2131748922, null)));
            arrayList.add(new qb(3, this.d.boost_url));
            if (org.telegram.messenger.hp.s1(this.b).p4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new qb(10, true));
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            }
        }
        pb pbVar = this.F;
        if (z10) {
            pbVar.E(arrayList2, arrayList);
        } else {
            pbVar.f();
        }
    }
}
