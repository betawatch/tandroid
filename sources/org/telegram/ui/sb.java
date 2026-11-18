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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sb extends FrameLayout {
    public int E;
    public final qb F;
    public final org.telegram.ui.Components.ck0 G;
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
    public final c51 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.i6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public sb(c51 c51Var, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(c51Var.getParentActivity());
        int i7 = org.telegram.messenger.j10.t0;
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
        this.c = c51Var;
        Activity parentActivity = c51Var.getParentActivity();
        this.e = i6Var;
        this.a = j3;
        this.J = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(parentActivity, null);
        this.G = ck0Var;
        ck0Var.setSections(true);
        ck0Var.setCaptureSectionsDecoratorAllowed(true);
        ck0Var.setLayoutManager(new v4.c0());
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        ck0Var.setItemAnimator(kVar);
        ck0Var.setClipToPadding(false);
        ck0Var.setOnItemClickListener(new mb(this, parentActivity, j3, i6Var, c51Var));
        addView(ck0Var);
        org.telegram.messenger.mp.u1(i7).I0().a(j3, new r3(this, 1));
        ck0Var.setAdapter(qbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
        ph0Var.setAutoRepeat(true);
        ph0Var.f(R.raw.statistic_preload, 120, 120, null);
        ph0Var.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(org.telegram.messenger.gd.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
        textView2.setTag(Integer.valueOf(i11));
        textView2.setText(org.telegram.messenger.gd.M0(2131748584, null));
        textView2.setGravity(1);
        this.I.addView(ph0Var, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, c8.ma.r(-2, -2, 1));
        addView(this.I, c8.ma.d(org.telegram.messenger.ks.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        di.x8.y(i7, false).v();
    }

    public final void a(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.mp.u1(i7).l1(this.a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new pb(this, countDownLatch, obVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i7 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.mp.u1(i7).l1(this.a);
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
            arrayList.add(new rb(1, org.telegram.messenger.gd.M0(2131744660, null)));
            arrayList.add(new rb(0, false));
            arrayList.add(new rb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new rb(12, org.telegram.messenger.gd.M0(2131753322, null)));
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
                arrayList.add(new rb(6, org.telegram.messenger.gd.M0(2131753284, null)));
            }
            arrayList.add(new rb(13, org.telegram.messenger.gd.M0(2131753604, null)));
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
                    arrayList.add(new rb(6, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(chat) ? 2131753603 : 2131753602, null)));
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
                    arrayList.add(new rb(6, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(chat) ? 2131753603 : 2131753602, null)));
                }
            }
            arrayList.add(new rb(1, org.telegram.messenger.gd.M0(2131748722, null)));
            arrayList.add(new rb(3, this.d.boost_url));
            if (org.telegram.messenger.mp.u1(this.b).s4 && org.telegram.messenger.v3.N(chat)) {
                arrayList.add(new rb(6, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(chat) ? 2131753267 : 2131753266, null)));
                arrayList.add(new rb(10, true));
                arrayList.add(new rb(6, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(chat) ? 2131753501 : 2131753500, null)));
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
