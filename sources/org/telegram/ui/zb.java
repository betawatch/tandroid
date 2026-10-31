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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zb extends FrameLayout {
    public int D;
    public final xb E;
    public final org.telegram.ui.Components.tk0 F;
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
    public final u61 c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.p6 e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public zb(u61 u61Var, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(u61Var.getParentActivity());
        int i10 = org.telegram.messenger.d20.s0;
        this.b = i10;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.D = 0;
        xb xbVar = new xb(this);
        this.E = xbVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.c = u61Var;
        Activity parentActivity = u61Var.getParentActivity();
        this.e = p6Var;
        this.a = j10;
        this.I = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(parentActivity, null);
        this.F = tk0Var;
        tk0Var.setSections(true);
        tk0Var.setCaptureSectionsDecoratorAllowed(true);
        tk0Var.setLayoutManager(new s4.a0());
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        tk0Var.setItemAnimator(jVar);
        tk0Var.setClipToPadding(false);
        tk0Var.setOnItemClickListener(new tb(this, parentActivity, j10, p6Var, u61Var));
        addView(tk0Var);
        org.telegram.messenger.vp.r1(i10).G0().a(j10, new s3(this, 1));
        tk0Var.setAdapter(xbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        ei0Var.setAutoRepeat(true);
        ei0Var.f(R.raw.statistic_preload, 120, 120, null);
        ei0Var.d();
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(g10, i11, null);
        g10.setTag(Integer.valueOf(i11));
        g10.setText(org.telegram.messenger.cd.L0(2131748787, null));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        textView.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView.setGravity(1);
        this.H.addView(ei0Var, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(g10, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, w7.b6.r(-2, -2, 1));
        addView(this.H, w7.b6.d(org.telegram.messenger.zs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        rh.e6.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, vb vbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.vp.r1(i10).i1(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new wb(this, countDownLatch, vbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, vb vbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.vp.r1(i10).i1(this.a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new wb(this, countDownLatch, vbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.e.c(new vb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new vb(this, 1));
        } else {
            a(null, new vb(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new yb(4, false));
            arrayList.add(new yb(1, org.telegram.messenger.cd.L0(2131744913, null)));
            arrayList.add(new yb(0, false));
            arrayList.add(new yb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new yb(12, org.telegram.messenger.cd.L0(2131753324, null)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.d.prepaid_giveaways.size() - 1;
                    yb ybVar = new yb(11, true);
                    ybVar.e = prepaidGiveaway;
                    ybVar.f = z11;
                    arrayList.add(ybVar);
                    i10++;
                }
                arrayList.add(new yb(6, org.telegram.messenger.cd.L0(2131753286, null)));
            }
            arrayList.add(new yb(13, org.telegram.messenger.cd.L0(2131753606, null)));
            int i11 = this.D;
            TLRPC.Chat chat = this.I;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new yb(8, false));
                    arrayList.add(new yb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new yb((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() + (-1) && !this.r, this.D));
                        i12++;
                    }
                    if (this.r) {
                        arrayList.add(new yb(9, true));
                    } else {
                        arrayList.add(new yb(7, false));
                    }
                    arrayList.add(new yb(6, org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            } else {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new yb(8, false));
                    arrayList.add(new yb(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new yb((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.w, this.D));
                        i13++;
                    }
                    if (this.w) {
                        arrayList.add(new yb(9, true));
                    } else {
                        arrayList.add(new yb(7, false));
                    }
                    arrayList.add(new yb(6, org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753605 : 2131753604, null)));
                }
            }
            arrayList.add(new yb(1, org.telegram.messenger.cd.L0(2131748924, null)));
            arrayList.add(new yb(3, this.d.boost_url));
            if (org.telegram.messenger.vp.r1(this.b).q4 && org.telegram.messenger.w3.N(chat)) {
                arrayList.add(new yb(6, org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753269 : 2131753268, null)));
                arrayList.add(new yb(10, true));
                arrayList.add(new yb(6, org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131753503 : 2131753502, null)));
            }
        }
        xb xbVar = this.E;
        if (z10) {
            xbVar.E(arrayList2, arrayList);
        } else {
            xbVar.f();
        }
    }
}
