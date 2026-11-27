// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tg1 extends FrameLayout {
    public int E;
    public final rg1 F;
    public final d79 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public byte M;
    public byte N;
    public int O;
    public int P;
    public final long a;
    public final int b;
    public final w1b c;
    public TL_stories.TL_premium_boostsStatus d;
    public final vnb e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public tg1(w1b w1bVar, long j, vnb vnbVar) {
        super(w1bVar.getParentActivity());
        int i = yac.t0;
        this.b = i;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        rg1 rg1Var = new rg1(this);
        this.F = rg1Var;
        this.K = "";
        this.L = "";
        this.M = (byte) 5;
        this.N = (byte) 5;
        this.c = w1bVar;
        Activity parentActivity = w1bVar.getParentActivity();
        this.e = vnbVar;
        this.a = j;
        this.J = uc7.s1(i).M0(Long.valueOf(-j));
        d79 d79Var = new d79(parentActivity, null);
        this.G = d79Var;
        d79Var.setSections(true);
        d79Var.setCaptureSectionsDecoratorAllowed(true);
        d79Var.setLayoutManager(new x46());
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        d79Var.setItemAnimator(zb3Var);
        d79Var.setClipToPadding(false);
        d79Var.setOnItemClickListener(new pg1(this, parentActivity, j, vnbVar, w1bVar));
        addView(d79Var);
        uc7.s1(i).G0().a(j, new te2(this, (byte) 14));
        d79Var.setAdapter(rg1Var);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        e29 e29Var = new e29(context);
        e29Var.setAutoRepeat(true);
        e29Var.f(R.raw.statistic_preload, jn7.E1, jn7.E1, null);
        e29Var.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        int i2 = aob.Fj;
        yob.X(textView, i2, null);
        textView.setTag(Integer.valueOf(i2));
        textView.setText(ob6.M0(2131748531, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = aob.Gj;
        yob.X(textView2, i3, null);
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(ob6.M0(2131748530, null));
        textView2.setGravity(1);
        this.I.addView(e29Var, tre.t(jn7.E1, jn7.E1, 1, 0, 0, 0, 20));
        this.I.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, tre.r(-2, -2, 1));
        addView(this.I, tre.d(jn7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        jxa.v(i, false).s();
    }

    public final void a(CountDownLatch countDownLatch, qg1 qg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i = this.b;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0((Object) this, (Object) countDownLatch, (Object) qg1Var, (byte) 13), 2);
    }

    public final void b(CountDownLatch countDownLatch, qg1 qg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i = this.b;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0((Object) this, (Object) countDownLatch, (Object) qg1Var, (byte) 12), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        byte b = 1;
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new qg1(this, (byte) 0));
        } else if (bool.booleanValue()) {
            b(null, new qg1(this, b));
        } else {
            a(null, new qg1(this, (byte) 2));
        }
    }

    public final void d(boolean z) {
        ArrayList arrayList = new ArrayList(this.y);
        this.y.clear();
        if (this.d != null) {
            this.y.add(new sg1(4, false));
            this.y.add(new sg1(1, ob6.M0(2131744552, null)));
            this.y.add(new sg1(0, false));
            this.y.add(new sg1(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                this.y.add(new sg1(12, ob6.M0(2131753317, null)));
                int i = 0;
                while (i < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i);
                    ArrayList arrayList2 = this.y;
                    boolean z2 = i == this.d.prepaid_giveaways.size() - 1;
                    sg1 sg1Var = new sg1(11, true);
                    sg1Var.e = prepaidGiveaway;
                    sg1Var.f = z2;
                    arrayList2.add(sg1Var);
                    i++;
                }
                this.y.add(new sg1(6, ob6.M0(2131753279, null)));
            }
            this.y.add(new sg1(13, ob6.M0(2131753599, null)));
            if (this.E == 0) {
                if (this.h.isEmpty()) {
                    this.y.add(new sg1(8, false));
                    this.y.add(new sg1(2, false));
                } else {
                    int i2 = 0;
                    while (i2 < this.h.size()) {
                        this.y.add(new sg1((TL_stories.Boost) this.h.get(i2), i2 == this.h.size() - 1 && !this.r, this.E));
                        i2++;
                    }
                    boolean z3 = this.r;
                    ArrayList arrayList3 = this.y;
                    if (z3) {
                        arrayList3.add(new sg1(9, true));
                    } else {
                        arrayList3.add(new sg1(7, false));
                    }
                    this.y.add(new sg1(6, ob6.M0(xc2.V(this.J) ? 2131753598 : 2131753597, null)));
                }
            } else if (this.n.isEmpty()) {
                this.y.add(new sg1(8, false));
                this.y.add(new sg1(2, false));
            } else {
                int i3 = 0;
                while (i3 < this.n.size()) {
                    this.y.add(new sg1((TL_stories.Boost) this.n.get(i3), i3 == this.n.size() - 1 && !this.w, this.E));
                    i3++;
                }
                boolean z4 = this.w;
                ArrayList arrayList4 = this.y;
                if (z4) {
                    arrayList4.add(new sg1(9, true));
                } else {
                    arrayList4.add(new sg1(7, false));
                }
                this.y.add(new sg1(6, ob6.M0(xc2.V(this.J) ? 2131753598 : 2131753597, null)));
            }
            this.y.add(new sg1(1, ob6.M0(2131748668, null)));
            this.y.add(new sg1(3, this.d.boost_url));
            if (uc7.s1(this.b).k4.W1.f && xc2.N(this.J)) {
                this.y.add(new sg1(6, ob6.M0(xc2.V(this.J) ? 2131753262 : 2131753261, null)));
                this.y.add(new sg1(10, true));
                this.y.add(new sg1(6, ob6.M0(xc2.V(this.J) ? 2131753496 : 2131753495, null)));
            }
        }
        rg1 rg1Var = this.F;
        if (z) {
            rg1Var.E(arrayList, this.y);
        } else {
            rg1Var.f();
        }
    }
}
