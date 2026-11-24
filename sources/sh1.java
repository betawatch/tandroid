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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sh1 extends FrameLayout {
    public int E;
    public final qh1 F;
    public final r59 G;
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
    public final xza c;
    public TL_stories.TL_premium_boostsStatus d;
    public final ylb e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public sh1(xza xzaVar, long j, ylb ylbVar) {
        super(xzaVar.getParentActivity());
        int i = z8c.t0;
        this.b = i;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        qh1 qh1Var = new qh1(this);
        this.F = qh1Var;
        this.K = "";
        this.L = "";
        this.M = (byte) 5;
        this.N = (byte) 5;
        this.c = xzaVar;
        Activity parentActivity = xzaVar.getParentActivity();
        this.e = ylbVar;
        this.a = j;
        this.J = oc7.r1(i).L0(Long.valueOf(-j));
        r59 r59Var = new r59(parentActivity, null);
        this.G = r59Var;
        r59Var.setSections(true);
        r59Var.setCaptureSectionsDecoratorAllowed(true);
        r59Var.setLayoutManager(new u46());
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        r59Var.setItemAnimator(sc3Var);
        r59Var.setClipToPadding(false);
        r59Var.setOnItemClickListener(new oh1(this, parentActivity, j, ylbVar, xzaVar));
        addView(r59Var);
        oc7.r1(i).F0().a(j, new mf2(this, (byte) 14));
        r59Var.setAdapter(qh1Var);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        s09 s09Var = new s09(context);
        s09Var.setAutoRepeat(true);
        s09Var.f(R.raw.statistic_preload, nm7.E1, nm7.E1, null);
        s09Var.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i2 = cmb.Ej;
        anb.X(textView, i2, null);
        textView.setTag(Integer.valueOf(i2));
        textView.setText(jb6.M0(2131748534, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = cmb.Fj;
        anb.X(textView2, i3, null);
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(jb6.M0(2131748533, null));
        textView2.setGravity(1);
        this.I.addView(s09Var, qoe.t(nm7.E1, nm7.E1, 1, 0, 0, 0, 20));
        this.I.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, qoe.r(-2, -2, 1));
        addView(this.I, qoe.d(nm7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        jva.v(i, false).s();
    }

    public final void a(CountDownLatch countDownLatch, ph1 ph1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i = this.b;
        tL_premium_getBoostsList.peer = oc7.r1(i).i1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new eo0((Object) this, (Object) countDownLatch, (Object) ph1Var, (byte) 13), 2);
    }

    public final void b(CountDownLatch countDownLatch, ph1 ph1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i = this.b;
        tL_premium_getBoostsList.peer = oc7.r1(i).i1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new eo0((Object) this, (Object) countDownLatch, (Object) ph1Var, (byte) 12), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        byte b = 1;
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new ph1(this, (byte) 0));
        } else if (bool.booleanValue()) {
            b(null, new ph1(this, b));
        } else {
            a(null, new ph1(this, (byte) 2));
        }
    }

    public final void d(boolean z) {
        ArrayList arrayList = new ArrayList(this.y);
        this.y.clear();
        if (this.d != null) {
            this.y.add(new rh1(4, false));
            this.y.add(new rh1(1, jb6.M0(2131744584, null)));
            this.y.add(new rh1(0, false));
            this.y.add(new rh1(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                this.y.add(new rh1(12, jb6.M0(2131753289, null)));
                int i = 0;
                while (i < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i);
                    ArrayList arrayList2 = this.y;
                    boolean z2 = i == this.d.prepaid_giveaways.size() - 1;
                    rh1 rh1Var = new rh1(11, true);
                    rh1Var.e = prepaidGiveaway;
                    rh1Var.f = z2;
                    arrayList2.add(rh1Var);
                    i++;
                }
                this.y.add(new rh1(6, jb6.M0(2131753251, null)));
            }
            this.y.add(new rh1(13, jb6.M0(2131753571, null)));
            if (this.E == 0) {
                if (this.h.isEmpty()) {
                    this.y.add(new rh1(8, false));
                    this.y.add(new rh1(2, false));
                } else {
                    int i2 = 0;
                    while (i2 < this.h.size()) {
                        this.y.add(new rh1((TL_stories.Boost) this.h.get(i2), i2 == this.h.size() - 1 && !this.r, this.E));
                        i2++;
                    }
                    boolean z3 = this.r;
                    ArrayList arrayList3 = this.y;
                    if (z3) {
                        arrayList3.add(new rh1(9, true));
                    } else {
                        arrayList3.add(new rh1(7, false));
                    }
                    this.y.add(new rh1(6, jb6.M0(sd2.V(this.J) ? 2131753570 : 2131753569, null)));
                }
            } else if (this.n.isEmpty()) {
                this.y.add(new rh1(8, false));
                this.y.add(new rh1(2, false));
            } else {
                int i3 = 0;
                while (i3 < this.n.size()) {
                    this.y.add(new rh1((TL_stories.Boost) this.n.get(i3), i3 == this.n.size() - 1 && !this.w, this.E));
                    i3++;
                }
                boolean z4 = this.w;
                ArrayList arrayList4 = this.y;
                if (z4) {
                    arrayList4.add(new rh1(9, true));
                } else {
                    arrayList4.add(new rh1(7, false));
                }
                this.y.add(new rh1(6, jb6.M0(sd2.V(this.J) ? 2131753570 : 2131753569, null)));
            }
            this.y.add(new rh1(1, jb6.M0(2131748671, null)));
            this.y.add(new rh1(3, this.d.boost_url));
            if (oc7.r1(this.b).l4.O1.f && sd2.N(this.J)) {
                this.y.add(new rh1(6, jb6.M0(sd2.V(this.J) ? 2131753234 : 2131753233, null)));
                this.y.add(new rh1(10, true));
                this.y.add(new rh1(6, jb6.M0(sd2.V(this.J) ? 2131753468 : 2131753467, null)));
            }
        }
        qh1 qh1Var = this.F;
        if (z) {
            qh1Var.E(arrayList, this.y);
        } else {
            qh1Var.f();
        }
    }
}
