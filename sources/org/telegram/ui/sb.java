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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sb extends FrameLayout {
    public int E;
    public final qb F;
    public final org.telegram.ui.Components.uj0 G;
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
    public final z41 c;
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

    public sb(z41 z41Var, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(z41Var.getParentActivity());
        int i7 = org.telegram.messenger.m10.t0;
        this.b = i7;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        qb qbVar = new qb(this);
        this.F = qbVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.c = z41Var;
        Activity parentActivity = z41Var.getParentActivity();
        this.e = e6Var;
        this.a = j3;
        this.J = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(parentActivity, null);
        this.G = uj0Var;
        uj0Var.setSections(true);
        uj0Var.setCaptureSectionsDecoratorAllowed(true);
        uj0Var.setLayoutManager(new v4.b0());
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        uj0Var.setItemAnimator(kVar);
        uj0Var.setClipToPadding(false);
        uj0Var.setOnItemClickListener(new mb(this, parentActivity, j3, e6Var, z41Var));
        addView(uj0Var);
        org.telegram.messenger.np.s1(i7).G0().a(j3, new r3(this, 1));
        uj0Var.setAdapter(qbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.statistic_preload, 120, 120, null);
        fh0Var.d();
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(g10, i10, null);
        g10.setTag(Integer.valueOf(i10));
        g10.setText(org.telegram.messenger.hd.M0(2131748777, null));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.hd.M0(2131748776, null));
        textView.setGravity(1);
        this.I.addView(fh0Var, c8.ja.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(g10, c8.ja.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, c8.ja.r(-2, -2, 1));
        addView(this.I, c8.ja.d(org.telegram.messenger.ns.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        di.v8.y(i7, false).v();
    }

    public final void a(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new pb(this, countDownLatch, obVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new pb(this, countDownLatch, obVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new ob(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new ob(this, 1));
        } else {
            a(null, new ob(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new rb(4, false));
            arrayList.add(new rb(1, org.telegram.messenger.hd.M0(2131744895, null)));
            arrayList.add(new rb(0, false));
            arrayList.add(new rb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new rb(12, org.telegram.messenger.hd.M0(2131753324, null)));
                int i7 = 0;
                while (i7 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i7);
                    boolean z11 = i7 == this.d.prepaid_giveaways.size() - 1;
                    rb rbVar = new rb(11, true);
                    rbVar.e = prepaidGiveaway;
                    rbVar.f = z11;
                    arrayList.add(rbVar);
                    i7++;
                }
                arrayList.add(new rb(6, org.telegram.messenger.hd.M0(2131753286, null)));
            }
            arrayList.add(new rb(13, org.telegram.messenger.hd.M0(2131753606, null)));
            int i10 = this.E;
            TLRPC.Chat chat = this.J;
            if (i10 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new rb(8, false));
                    arrayList.add(new rb(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new rb((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.r, this.E));
                        i11++;
                    }
                    if (this.r) {
                        arrayList.add(new rb(9, true));
                    } else {
                        arrayList.add(new rb(7, false));
                    }
                    arrayList.add(new rb(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new rb(8, false));
                    arrayList.add(new rb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new rb((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.w, this.E));
                        i12++;
                    }
                    if (this.w) {
                        arrayList.add(new rb(9, true));
                    } else {
                        arrayList.add(new rb(7, false));
                    }
                    arrayList.add(new rb(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new rb(1, org.telegram.messenger.hd.M0(2131748914, null)));
            arrayList.add(new rb(3, this.d.boost_url));
            if (org.telegram.messenger.np.s1(this.b).q4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new rb(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new rb(10, true));
                arrayList.add(new rb(6, org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            }
        }
        qb qbVar = this.F;
        if (z10) {
            qbVar.E(arrayList2, arrayList);
        } else {
            qbVar.f();
        }
    }
}
