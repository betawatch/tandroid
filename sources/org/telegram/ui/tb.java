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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tb extends FrameLayout {
    public int D;
    public final rb E;
    public final org.telegram.ui.Components.qj0 F;
    public boolean G;
    public final LinearLayout H;
    public final TLRPC.Chat I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final long a;
    public final int b;
    public final d51 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.g6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public tb(d51 d51Var, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(d51Var.getParentActivity());
        int i7 = org.telegram.messenger.p10.s0;
        this.b = i7;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.D = 0;
        rb rbVar = new rb(this);
        this.E = rbVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.c = d51Var;
        Activity parentActivity = d51Var.getParentActivity();
        this.e = g6Var;
        this.a = j3;
        this.I = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(parentActivity, null);
        this.F = qj0Var;
        qj0Var.setSections(true);
        qj0Var.setCaptureSectionsDecoratorAllowed(true);
        qj0Var.setLayoutManager(new v4.b0());
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        qj0Var.setItemAnimator(kVar);
        qj0Var.setClipToPadding(false);
        qj0Var.setOnItemClickListener(new nb(this, parentActivity, j3, g6Var, d51Var));
        addView(qj0Var);
        org.telegram.messenger.qp.s1(i7).G0().a(j3, new r3(this, 1));
        qj0Var.setAdapter(rbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        dh0Var.setAutoRepeat(true);
        dh0Var.f(R.raw.statistic_preload, 120, 120, null);
        dh0Var.d();
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.l6.Cj;
        org.telegram.ui.ActionBar.s6.U(g10, i10, null);
        g10.setTag(Integer.valueOf(i10));
        g10.setText(org.telegram.messenger.id.M0(2131748777, null));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.l6.Dj;
        org.telegram.ui.ActionBar.s6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView.setGravity(1);
        this.H.addView(dh0Var, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(g10, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, c8.ha.r(-2, -2, 1));
        addView(this.H, c8.ha.d(org.telegram.messenger.qs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        bi.ea.y(i7, false).v();
    }

    public final void a(CountDownLatch countDownLatch, pb pbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new qb(this, countDownLatch, pbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, pb pbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new qb(this, countDownLatch, pbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.e.c(new pb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new pb(this, 1));
        } else {
            a(null, new pb(this, 2));
        }
    }

    public final void d(boolean z9) {
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new sb(4, false));
            arrayList.add(new sb(1, org.telegram.messenger.id.M0(2131744895, null)));
            arrayList.add(new sb(0, false));
            arrayList.add(new sb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new sb(12, org.telegram.messenger.id.M0(2131753324, null)));
                int i7 = 0;
                while (i7 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i7);
                    boolean z10 = i7 == this.d.prepaid_giveaways.size() - 1;
                    sb sbVar = new sb(11, true);
                    sbVar.e = prepaidGiveaway;
                    sbVar.f = z10;
                    arrayList.add(sbVar);
                    i7++;
                }
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(2131753286, null)));
            }
            arrayList.add(new sb(13, org.telegram.messenger.id.M0(2131753606, null)));
            int i10 = this.D;
            TLRPC.Chat chat = this.I;
            if (i10 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new sb(8, false));
                    arrayList.add(new sb(2, false));
                } else {
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        arrayList.add(new sb((TL_stories.Boost) arrayList3.get(i11), i11 == arrayList3.size() + (-1) && !this.r, this.D));
                        i11++;
                    }
                    if (this.r) {
                        arrayList.add(new sb(9, true));
                    } else {
                        arrayList.add(new sb(7, false));
                    }
                    arrayList.add(new sb(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new sb(8, false));
                    arrayList.add(new sb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        arrayList.add(new sb((TL_stories.Boost) arrayList4.get(i12), i12 == arrayList4.size() - 1 && !this.w, this.D));
                        i12++;
                    }
                    if (this.w) {
                        arrayList.add(new sb(9, true));
                    } else {
                        arrayList.add(new sb(7, false));
                    }
                    arrayList.add(new sb(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new sb(1, org.telegram.messenger.id.M0(2131748914, null)));
            arrayList.add(new sb(3, this.d.boost_url));
            if (org.telegram.messenger.qp.s1(this.b).p4 && org.telegram.messenger.t3.N(chat)) {
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new sb(10, true));
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131753503 : 2131753502, null)));
            }
        }
        rb rbVar = this.E;
        if (z9) {
            rbVar.E(arrayList2, arrayList);
        } else {
            rbVar.f();
        }
    }
}
