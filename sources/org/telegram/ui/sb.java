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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class sb extends FrameLayout {
    public int E;
    public final qb F;
    public final org.telegram.ui.Components.ek0 G;
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
    public final org.telegram.ui.ActionBar.h6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public sb(c51 c51Var, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.e = h6Var;
        this.a = j3;
        this.J = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(parentActivity, null);
        this.G = ek0Var;
        ek0Var.setSections(true);
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        ek0Var.setLayoutManager(new v4.c0());
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        ek0Var.setItemAnimator(kVar);
        ek0Var.setClipToPadding(false);
        ek0Var.setOnItemClickListener(new mb(this, parentActivity, j3, h6Var, c51Var));
        addView(ek0Var);
        org.telegram.messenger.mp.u1(i7).I0().a(j3, new r3(this, 1));
        ek0Var.setAdapter(qbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        rh0Var.setAutoRepeat(true);
        rh0Var.f(R.raw.statistic_preload, 120, 120, null);
        rh0Var.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(org.telegram.messenger.gd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
        textView2.setTag(Integer.valueOf(i11));
        textView2.setText(org.telegram.messenger.gd.N0(2131748583, null));
        textView2.setGravity(1);
        this.I.addView(rh0Var, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, c8.ma.r(-2, -2, 1));
        addView(this.I, c8.ma.d(org.telegram.messenger.ks.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        di.y8.y(i7, false).v();
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
            arrayList.add(new rb(1, org.telegram.messenger.gd.N0(2131744654, null)));
            arrayList.add(new rb(0, false));
            arrayList.add(new rb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new rb(12, org.telegram.messenger.gd.N0(2131753321, null)));
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
                arrayList.add(new rb(6, org.telegram.messenger.gd.N0(2131753283, null)));
            }
            arrayList.add(new rb(13, org.telegram.messenger.gd.N0(2131753603, null)));
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
                    arrayList.add(new rb(6, org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131753602 : 2131753601, null)));
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
                    arrayList.add(new rb(6, org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131753602 : 2131753601, null)));
                }
            }
            arrayList.add(new rb(1, org.telegram.messenger.gd.N0(2131748721, null)));
            arrayList.add(new rb(3, this.d.boost_url));
            if (org.telegram.messenger.mp.u1(this.b).s4 && org.telegram.messenger.v3.N(chat)) {
                arrayList.add(new rb(6, org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131753266 : 2131753265, null)));
                arrayList.add(new rb(10, true));
                arrayList.add(new rb(6, org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131753500 : 2131753499, null)));
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
