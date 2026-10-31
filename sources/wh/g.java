package wh;

import ag.y0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.t0;
import j$.util.Objects;
import java.util.ArrayList;
import kg.g2;
import mg.i2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.k0;
import org.telegram.messenger.u1;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.y1;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.voip.i0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.br;
import org.telegram.ui.do0;
import org.telegram.ui.o10;
import org.telegram.ui.p10;
import org.telegram.ui.u71;
import ph.o3;
import ph.p0;
import rh.e6;
import rh.g8;
import rh.h8;
import rh.i;
import rh.o7;
import rh.r;
import s4.a0;
import s4.g0;
import s4.j;
import vh.d0;
import vh.w3;
import w7.b6;
import w7.b9;
import xh.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends p10 implements us {
    public FrameLayout R;
    public a7 S;
    public g8 T;
    public ku0 U;
    public t0 V;
    public View W;
    public fe.b X;
    public fe.b Y;
    public fe.b Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public do0 g0;
    public final boolean h0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public f6 k0;
    public f6 l0;
    public i0 m0;
    public vh.d n0;
    public u71 o0;
    public vh.d p0;
    public vh.d q0;
    public boolean r0;
    public boolean s0;
    public o3 t0;
    public int a0 = -1;
    public final d0 f0 = new d0(this, 23);

    public g() {
        boolean z10;
        w0.u();
        if (v2.a()) {
            z10 = true;
        } else {
            w0.r();
            z10 = false;
        }
        this.h0 = z10;
        this.M = true;
    }

    public static void z0(g gVar, int i10) {
        a51 G;
        o3 o3Var = gVar.t0;
        if (o3Var == null || (G = o3Var.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            gVar.t0.O(true);
            return;
        }
        if (i11 == -2) {
            e6.y(gVar.currentAccount, true).u();
            i2.l1(1, y1.a(gVar.currentAccount).b());
        } else if (i11 == -3) {
            e6.y(gVar.currentAccount, true).V();
            gVar.t0.O(true);
        } else if (i11 == -4) {
            if (vp.r1(gVar.currentAccount).u2()) {
                org.telegram.ui.b.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new z2(gVar.getUserConfig().e()));
            }
        }
    }

    public final void C0() {
        F0();
        tk0 tk0Var = this.c;
        if (tk0Var == null || this.U == null || tk0Var.getLayoutParams() == null) {
            return;
        }
        int C = z20.C(48.0f, this.b0, -org.telegram.messenger.i0.L(8.0f));
        int C2 = z20.C(48.0f, this.c0, -org.telegram.messenger.i0.L(8.0f));
        org.telegram.messenger.i0.A3(this.c, 0, C, 0, C2);
        tk0 tk0Var2 = this.c;
        int i10 = -C;
        tk0Var2.setPadding(tk0Var2.getPaddingLeft(), i10, this.c.getPaddingRight(), this.c0 - C2);
        this.U.z(i10, -C2);
    }

    public final void D0(ArrayList arrayList, p51 p51Var) {
        tk0 tk0Var;
        ku0 ku0Var = this.U;
        boolean z10 = ku0Var != null && ku0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e6 y3 = e6.y(this.currentAccount, true);
        t0 t0Var = (t0) super.n0(getParentActivity());
        a51 a51Var = new a51(-2);
        a51Var.c = t0Var;
        arrayList.add(a51Var);
        arrayList.add(a51.k(this.i0));
        boolean z11 = this.h0;
        if (z11) {
            arrayList.add(a51.C(cd.L0(2131749523, null)));
        }
        boolean N = y3.N(0);
        this.r0 = N;
        if (!N) {
            arrayList.add(a51.m(this.g0));
            return;
        }
        if (!z11) {
            arrayList.add(a51.C(null));
        }
        this.a0 = arrayList.size();
        arrayList.add(a51.n(this.V, -2));
        if (!z10 || (tk0Var = this.c) == null) {
            return;
        }
        d0 d0Var = this.f0;
        tk0Var.removeCallbacks(d0Var);
        this.c.post(d0Var);
    }

    public final void E0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i10 = 1;
        e6 y3 = e6.y(this.currentAccount, true);
        double d = ((k0) getMessagesController().y7.l.b).a;
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) h8.L0(p5, 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        int i11 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i11 > 0) {
            this.l0.setText("≈" + u1.i().f(i11, "USD"));
        } else {
            this.l0.setText(cd.L0(2131742814, null));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = r.g(this.currentAccount).j(getUserConfig().e(), true);
        final int i12 = 0;
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.s0 == z10) {
            return;
        }
        this.s0 = z10;
        this.m0.setVisibility(0);
        this.o0.setVisibility(0);
        this.m0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: wh.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        this.o0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: wh.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        if (z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void F0() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(44.0f) + l.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        G0();
    }

    public final void G0() {
        View view = this.W;
        if (view == null) {
            return;
        }
        fe.b bVar = this.X;
        float f7 = bVar == null ? 0.0f : bVar.e;
        fe.b bVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f7)) * l.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * org.telegram.messenger.i0.L(44.0f)));
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        final int i10 = 0;
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        ku0 ku0Var = new ku0(context);
        this.U = ku0Var;
        final int i11 = 1;
        ku0Var.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            z4 z4Var = this.parentLayout;
            this.b0 = (z4Var == null || !((ActionBarLayout) z4Var).S0) ? org.telegram.messenger.i0.m : 0;
            this.c0 = org.telegram.messenger.i0.n;
        }
        this.U.setGeometry(new w3(this));
        this.U.z(-z20.C(48.0f, this.b0, -org.telegram.messenger.i0.L(8.0f)), -z20.C(48.0f, this.c0, -org.telegram.messenger.i0.L(8.0f)));
        ku0 ku0Var2 = this.U;
        ku0Var2.getClass();
        this.V = new t0(ku0Var2, context, 20);
        this.T = new g8(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new do0(this, context, 12);
        super.createView(context);
        o10 o10Var = this.s;
        getBaseSimpleGlass().f(o10Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().l = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().m = new ei.a(9, this, new org.telegram.ui.ActionBar.y1(3, o10Var));
        View tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        ku0 ku0Var3 = this.U;
        ku0Var3.addView(this.W, ku0Var3.indexOfChild(tabsContainer), b6.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        gr grVar = gr.h;
        fe.b bVar = new fe.b(0, aVar, grVar, 380L, false);
        this.X = bVar;
        this.Y = new fe.b(1, new a(this, 1), grVar, 380L, false);
        final int i12 = 2;
        this.Z = new fe.b(2, new a(this, 2), grVar, 380L, false);
        bVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.s(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new bu0(this, 27));
        F0();
        vg.f c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.o(b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        tabsContainer.setBackground(c10);
        z4 z4Var2 = this.parentLayout;
        if (z4Var2 != null && ((ActionBarLayout) z4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        a7 a7Var = new a7(zs.A2, context, false);
        this.S = a7Var;
        a7Var.setStarParticlesView(this.e);
        this.R.addView(this.S, b6.d(zs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(cd.L0(2131749521, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131749522, null), new p0(context, 11)), true), this.R, null);
        this.c.setOverScrollMode(2);
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new y0(this, 22));
        this.s.addView(new xz(getParentActivity()), b6.c(-1.0f, -1));
        e6.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(10.0f));
        f6 f6Var = new f6(getParentActivity(), false, true, false);
        this.k0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.k0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.k0.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.k0, t6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        dq dqVar = new dq(R.drawable.mini_gram_72, 0);
        dqVar.d = false;
        dqVar.H = 0.5f;
        dqVar.I = 0.5f;
        dqVar.r = -org.telegram.messenger.i0.L(3.0f);
        dqVar.s = 0.0f;
        this.j0.setSpan(dqVar, 0, 1, 33);
        this.i0.addView(this.k0, b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        f6 f6Var2 = new f6(getParentActivity(), false, false, false);
        this.l0 = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.l0.setGravity(17);
        this.l0.setText(cd.L0(2131742814, null));
        org.telegram.ui.ActionBar.a7.Z(this.l0, t6.z6, this.resourceProvider);
        this.i0.addView(this.l0, b6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        i0 i0Var = new i0(this, getParentActivity(), 10);
        this.m0 = i0Var;
        frameLayout2.addView(i0Var);
        boolean z10 = this.h0;
        if (z10) {
            vh.d dVar = new vh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.n0 = dVar;
            dVar.f();
            this.n0.i(cd.L0(2131744055, null), false, true);
            this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: wh.c
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i10;
                    g gVar = this.b;
                    switch (i13) {
                        case 0:
                            gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                            break;
                        case 1:
                            gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                            break;
                        default:
                            gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                            break;
                    }
                }
            });
            this.m0.addView(this.n0, b6.e(-1, 48, zs.E1));
        }
        u71 u71Var = new u71(this, getParentActivity(), 24);
        this.o0 = u71Var;
        frameLayout2.addView(u71Var);
        vh.d dVar2 = new vh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new dq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) cd.L0(2131744068, null));
        this.p0.i(spannableStringBuilder, false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: wh.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i11;
                g gVar = this.b;
                switch (i13) {
                    case 0:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        break;
                    case 1:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        break;
                    default:
                        gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (z10) {
            this.o0.addView(this.p0, b6.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        vh.d dVar3 = new vh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new dq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) cd.L0(2131744069, null));
        this.q0.i(spannableStringBuilder2, false, true);
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: wh.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                g gVar = this.b;
                switch (i13) {
                    case 0:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        break;
                    case 1:
                        gf.f.t(gVar.getParentActivity(), cd.L0(2131744053, null));
                        break;
                    default:
                        gVar.presentFragment(new i(1, gVar.getUserConfig().e()));
                        break;
                }
            }
        });
        this.o0.addView(this.q0, b6.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, b6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.o0.animate().cancel();
        this.o0.setAlpha(this.s0 ? 1.0f : 0.0f);
        this.m0.setAlpha(this.s0 ? 0.0f : 1.0f);
        this.o0.setVisibility(this.s0 ? 0 : 8);
        this.m0.setVisibility(this.s0 ? 8 : 0);
        E0();
        o3 o3Var = this.t0;
        if (o3Var != null) {
            o3Var.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.v3) {
            t0();
            o3 o3Var = this.t0;
            if (o3Var != null) {
                o3Var.O(true);
            }
            g0();
            return;
        }
        if (i10 == zs.z3) {
            e6 y3 = e6.y(this.currentAccount, true);
            if (this.r0 != y3.N(0)) {
                this.r0 = y3.N(0);
                t0();
                o3 o3Var2 = this.t0;
                if (o3Var2 != null) {
                    o3Var2.O(false);
                }
                g0();
                return;
            }
            return;
        }
        if (i10 == zs.A3) {
            o3 o3Var3 = this.t0;
            if (o3Var3 != null) {
                o3Var3.O(true);
                return;
            }
            return;
        }
        if (i10 == zs.y3) {
            E0();
        } else if (i10 == zs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override // org.telegram.ui.p10
    public final void g0() {
        ku0 ku0Var;
        super.g0();
        if (this.e0 && (ku0Var = this.U) != null && this.a0 != -1) {
            ku0Var.a();
        }
        this.e0 = false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor() {
        return t6.x0(null, t6.i5, false);
    }

    @Override // org.telegram.ui.p10
    public final void h0() {
        this.s.addView(this.U, b6.c(-1.0f, -1));
        this.U.u(this.c, new a(this, 3));
        ku0 ku0Var = this.U;
        g8 g8Var = this.T;
        w71 viewPager = g8Var.getViewPager();
        g8 g8Var2 = this.T;
        Objects.requireNonNull(g8Var2);
        ku0Var.x(g8Var, viewPager, new b(g8Var2, 0));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        C0();
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ku0 ku0Var = this.U;
        return ku0Var == null || motionEvent == null || ku0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.p10
    public final g0 j0() {
        o3 o3Var = new o3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new qh.d(this, 24), getResourceProvider(), 3);
        this.t0 = o3Var;
        o3Var.r = false;
        return o3Var;
    }

    @Override // org.telegram.ui.p10
    public final a0 k0(Context context) {
        ku0 ku0Var = this.U;
        ku0Var.getClass();
        return new br((Object) ku0Var, 4);
    }

    @Override // org.telegram.ui.p10
    public final g2 l0() {
        return new o7(getParentActivity(), 75, 1, 1);
    }

    @Override // org.telegram.ui.p10
    public final boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.p10
    public final View n0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.v3);
        zs.f(this.currentAccount).c(this, zs.y3);
        zs.f(this.currentAccount).c(this, zs.z3);
        zs.f(this.currentAccount).c(this, zs.A3);
        zs.f(this.currentAccount).c(this, zs.C3);
        e6.y(this.currentAccount, true).S(true);
        e6.y(this.currentAccount, true).R();
        e6.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        tk0 tk0Var = this.c;
        if (tk0Var != null) {
            tk0Var.removeCallbacks(this.f0);
        }
        zs.f(this.currentAccount).n(this, zs.v3);
        zs.f(this.currentAccount).n(this, zs.y3);
        zs.f(this.currentAccount).n(this, zs.z3);
        zs.f(this.currentAccount).n(this, zs.A3);
        zs.f(this.currentAccount).n(this, zs.C3);
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d0 = true;
        this.b0 = i11;
        this.c0 = i13;
        C0();
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.p10
    public final float p0() {
        tk0 tk0Var = this.c;
        if (tk0Var == null) {
            return 0.0f;
        }
        return tk0Var.getY();
    }

    @Override // org.telegram.ui.p10
    public final View q0() {
        return this.U;
    }

    @Override // org.telegram.ui.p10
    public final void r0(boolean z10) {
        fe.b bVar = this.Z;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.p10
    public final void s0(float f7) {
        a7 a7Var = this.S;
        if (a7Var != null) {
            a7Var.setHeaderTilt(f7 * 70.0f);
        }
    }

    @Override // org.telegram.ui.p10
    public final void t0() {
        super.t0();
        ku0 ku0Var = this.U;
        this.e0 = ku0Var != null && ku0Var.e0;
        tk0 tk0Var = this.c;
        if (tk0Var == null || this.P < 0) {
            return;
        }
        this.Q -= tk0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.p10
    public final boolean y0() {
        return true;
    }
}
